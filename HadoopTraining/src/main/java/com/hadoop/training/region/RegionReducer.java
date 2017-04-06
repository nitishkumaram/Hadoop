package com.hadoop.training.region;


import java.io.IOException;
import java.util.Iterator;


import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
public class RegionReducer extends Reducer<Text, LongWritable, Text, LongWritable>
{
    //int sum=0;
public void reduce(Text key, Iterable<LongWritable> value, Context output) throws IOException, InterruptedException
{
    int sum=0;
    for(LongWritable val:value){
        
        sum +=val.get();
}
    output.write(key, new LongWritable(sum));
}

}
