package com.hadoop.training.hadooputility;

import java.io.File;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public enum HadoopUtility {

	INSTANCE;
	private Configuration config;
	private HadoopUtility()
	{
		config = new Configuration();
		
	}
    public Configuration pseudomode()
    {
    	String localhostfile = "/Users/NITISH/hadoop-localhost.xml";
    	Path inputPath = new Path(localhostfile);
    	config.addResource(inputPath);
		return config;
    }
    
    public void createDirectory(String dirName) throws IOException
    {
    	FileSystem fs = FileSystem.get(config);
    	Path homeDir = fs.getHomeDirectory();
    	Path dirPath = new Path(homeDir+File.separator+dirName);
    	if (fs.exists(dirPath))
    	{
    		System.out.println("Directory already exist");
    	}
    	else
    	{
    		fs.mkdirs(dirPath);
    	}
    }
	
}
