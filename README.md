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

----------------------------------------------------------------------------------------------------------------------------


Hive Commands

$Hadoop _SW
rm -r hive-0.9.0

Nitishs-MacBook-Pro:HADOOP_SW NITISH$ chmod 777 hive-0.9.0-bin.tar.gz 

Nitishs-MacBook-Pro:HADOOP_SW NITISH$ tar -xzvf hive-0.9.0-bin.tar.gz
 
Nitishs-MacBook-Pro:HADOOP_SW NITISH$ mv hive-0.9.0-bin hive-0.9.0

Nitishs-MacBook-Pro:HADOOP_SW NITISH$ cd hive-0.9.0

Nitishs-MacBook-Pro:~ NITISH$ vi .bashrc

export Hive_Home

Nitishs-MacBook-Pro:hive-0.9.0 NITISH$ source .bashrc

Nitishs-MacBook-Pro:hadoop-1.0.3 NITISH$ bin/hadoop fs -mkdir tmp

Nitishs-MacBook-Pro:hadoop-1.0.3 NITISH$ bin/hadoop fs -mkdir warehouse
	
Nitishs-MacBook-Pro:hadoop-1.0.3 NITISH$ bin/hadoop fs -chmod g+w tmp

Nitishs-MacBook-Pro:hadoop-1.0.3 NITISH$ bin/hadoop fs -chmod g+w warehouse

Nitishs-MacBook-Pro:hadoop-1.0.3 NITISH$ cd conf

Nitishs-MacBook-Pro:conf NITISH$ vi hive-site.xml 

<?xml version="1.0"?>
<?xml-stylesheet type="text/xsl" href="configuration.xsl"?>
<configuration>

<property>
<name>hive.metastore.warehouse.dir</name>
<value>/users/Nitish/warehouse</value>
</property>

<property>
<name>fs.default.name</name>
<value>hdfs://localhost:54310</value>
</property>


<property>
<name>mapred.job.tracker</name>
<value>hdfs://localhost:54311</value>
</property>

</configuration>


—————————————————————————————
Nitishs-MacBook-Pro:conf NITISH$ cd 

Nitishs-MacBook-Pro:~ NITISH$ source .bashrc
Nitishs-MacBook-Pro:~ NITISH$ hive
—————————————————————————————

OR Open new terminal

Nitishs-MacBook-Pro:~ NITISH$ source .bashrc
Nitishs-MacBook-Pro:~ NITISH$ hive
