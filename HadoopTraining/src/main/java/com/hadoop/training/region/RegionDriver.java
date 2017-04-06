package com.hadoop.training.region;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

import javax.lang.model.SourceVersion;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;


import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

import com.hadoop.training.hadooputility.HadoopUtility;


public class RegionDriver extends Configured implements Tool {
    
    public int run (String args[]) throws Exception
    {
        Configuration config =HadoopUtility.INSTANCE.pseudomode();
        
        
        Job job = new Job(config, "Basic word Counting job");
        job.setJarByClass(RegionDriver.class);
        
        job.setInputFormatClass(TextInputFormat.class);
        
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(LongWritable.class);
        

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(LongWritable.class);
              
        job.setMapperClass(RegionMapper.class);
        job.setReducerClass(RegionReducer.class);
                
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        
        int exitcode = job.waitForCompletion(true)? 0:1;
        return exitcode;
    }
}