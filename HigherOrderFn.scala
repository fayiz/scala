package fayiz

object HigherOrderExample{
  /*def sum(input: List[Int]): Int = {
    var a = 0;
    if(input.isEmpty){
      a
    }else{
      input.head + sum(input.tail)
    }
  }*/
  
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if(a == b){
      f(a)
    }else{
      f(a) + sum(f, a+1, b)
    }
  }
  
  def sqrt(input: Int): Int = { input * input }
  def normal(input: Int): Int = { input }
  
  def main(args: Array[String]){
    
    println(sum(normal, 2, 3))
    println(sum(sqrt, 2, 3))
    
    println(sum(x=>x*x, 2, 3))
    println(sum(x=>x*x*x, 2, 3))
    
  }
  
}