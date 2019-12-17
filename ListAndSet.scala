package fayiz

object ListAndSet{
  def main(args: Array[String]){
    println("Set Example");
    var setv = Set(1, 2, 3, 4, 5)
    setv = setv ++: Set(5, 6)
    println("Set : " + setv)
    println("Head : " + setv.head)
    println("Tail : " + setv.tail)
    println(setv.tail.head)
    println(setv.tail.tail)
    
    println("\nList Example");
    var listv = List(1, 2, 3, 4, 5)
    println(listv)
    listv = listv ++: List(5, 6, 7)
    println(listv)
    println("Second Element: " + listv(1))
    println( "List Size: " + listv.size)
    println("Head : " + listv.head)
    println("Tail : " + listv.tail)
    for(x <- listv){
      println(x)
    }
    println("Distinct : " + listv.distinct)
    
    println("SUM : " + sum(listv))
  }
    
  def sum(input: List[Int]): Int = {
    var a = 0;
    if(input.isEmpty){
      a
    }else{
      input.head + sum(input.tail)
    }
  }
}