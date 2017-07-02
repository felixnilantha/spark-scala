package org.spark.scala.readme

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext


object ReadMEScala {
  
  
  def main(args: Array[String]): Unit = {
    
    val conf = new SparkConf().setMaster("local").setAppName("My Read ME Scala")
    
    val sc = new SparkContext(conf)
    
    val lines = sc.textFile("/Users/sooriyasilva/Documents/spark-2.1.1-bin-hadoop2.7/README.md")
    
    val pythonLines = lines.filter(line => line.contains("Python"))
    
    println(pythonLines.first())
    
    
  }
  
  
  
}