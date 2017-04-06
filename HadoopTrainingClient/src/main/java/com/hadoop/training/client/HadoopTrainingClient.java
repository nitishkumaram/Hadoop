package com.hadoop.training.client;
import java.io.IOException;

import org.apache.hadoop.util.ToolRunner;




import com.hadoop.training.hadooputility.HadoopUtility;
import com.hadoop.training.region.RegionDriver;
//import com.hadoop.training.wikidatamining.WikiDriver;
//import com.hadoop.training.wordcount.WordCountDriver;


public class HadoopTrainingClient {
	
	public HadoopTrainingClient() throws IOException
	{
		HadoopUtility.INSTANCE.pseudomode();
	}

	public void createDirectory(String dirName)throws IOException{
	    HadoopUtility.INSTANCE.createDirectory(dirName);
	    	}
	/*
	public void valuedirectory(String Diname)throws IOException
	{
		HadoopUtility.valueOf(Diname);
	}
	public void EqualChecking(String checkstr)throws IOException
	{
				HadoopUtility.INSTANCE.equals("checkstr");
	}
	*/
	public static void main(String[] args) throws IOException
	{
		HadoopTrainingClient client = new HadoopTrainingClient();
		 System.out.println("before create directory");
		client.createDirectory("chaitanya");
	    System.out.println("directory created successfully");
	    /*client.valuedirectory("sasi");
	    System.out.print("after value");
	    client.EqualChecking("rt");
	    System.out.println("after checking");
	    */
		
		try{
			System.out.println("before try");
		//String[] arga= {"/dailydata","srimaptesop6"};
			String[] arga= {args[0],args[1]};
			System.out.println("after arguments");
			//String[] arga= {"srimapte","qwer"};
		ToolRunner.run(new RegionDriver(),arga);
		//	ToolRunner.run(new WikiDriver(),arga);
		System.out.println("after try");
		}
		catch(Exception e)
		{
			System.out.println("catch block");
			e.printStackTrace();
		}

		}
	}