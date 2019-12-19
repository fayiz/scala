package spark

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object MyFirstSpark {
  def main(args: Array[String]) {
    
    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
    
     // Create a SparkContext using every core of the local machine
    val sc = new SparkContext("local[*]", "MyFirstSpark")  
    var myRDD = sc.parallelize(1 to 100)
    println("RDD Partition Size: " +myRDD.partitions.size)
    var filteredRDD = myRDD.filter(x=>x%2==0) //Collect Even Numbers
    println("")
    //filteredRDD.foreach(println)
    filteredRDD.collect.foreach(println)
    println("filteredRDD Partition Size: " + filteredRDD.partitions.size)
    
  }
}