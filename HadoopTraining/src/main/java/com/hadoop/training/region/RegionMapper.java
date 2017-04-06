package com.hadoop.training.region;



import java.io.IOException;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class RegionMapper extends Mapper<LongWritable, Text,Text, LongWritable>
{
    //int c=0;
public void map(LongWritable key, Text value, Context output) throws IOException, InterruptedException
{
    Text mapOutputKey = new Text();
    LongWritable mapOutputValue = new LongWritable();
    
    
    String[] i = value.toString().split(" ");
    mapOutputKey.set(i[0]+" "+"-"+i[1]);
    mapOutputValue.set(Long.parseLong(i[2]));
    output.write(mapOutputKey, mapOutputValue);
}
//System.out.println("numberof values is"+c);
//System.out.println("before try");
}