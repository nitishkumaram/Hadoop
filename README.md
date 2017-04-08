# Hadoop

HADOOP Commands

TO START HADOOP-

cd Documents/HADOOP/HADOOP_SW/hadoop-1.0.3/
bin/start-all.sh

TO OPEN ECLIPSE-

cd Documents/HADOOP/HADOOP_SW/eclipse
./eclipse

TO COPY DATA FROM LOCAL TO HOST-

$Hadoop home

bin/hadoop fs -copyFromLocal /Users/NITISH/Documents/Region.txt RegionOutput

bin/hadoop fs -cat RegionOutput/*

TO GET INTO WORKSPACE DIRECTORY-

cd /Users/NITISH/git/Hadoop/

TO COMPILE AND RUN-

cd /Users/NITISH/git/HadoopTraining
mvn clean install
cd /Users/NITISH/git/HadoopTrainingClient
mvn clean install
cd target/
java -jar HadoopTrainingClient-1.0.jar RegionOutput.txt Region

$Hadoop home -> /Users/NITISH/Documents/HADOOP/HADOOP_SW/hadoop-1.0.3/
