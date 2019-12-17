package fayiz

object MapAndTuple{
  def main(args: Array[String]){
    println("Map Example");
    var mapv = scala.collection.mutable.Map[String, String]("id" -> "ID1234", "name" -> "Fayiz", "profession" -> "IT")
    println(mapv)
    println(mapv.keys)
    println(mapv.values)
    println(mapv("id"))
    println(mapv("name"))
    println(mapv("profession"))
    
    for(v <- mapv.values){
      println("Value is : " + v)
    }
    
    for(k <- mapv.keys){
      println("Key: " + k + ", Value: " + mapv(k))
    }
    
    
    println("");
    println("Tuple Example");
    var tup = (1234, "Fayiz", "Dubai", 123123.123)
    println(tup.getClass);
    println(tup);
    println(tup._1);
    println(tup._2);
    println(tup._3);
    println(tup._4);
  }
}