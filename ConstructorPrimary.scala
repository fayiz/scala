package fayiz

class pc{
  var a = 0
  
  //a = 100
  
  def getA() = {
    println("inside getA method")
    a
  }
  
  def setA(inputA: Int) = {
    println("inside setA method")
    a = inputA
  }
  
}

object primaryConstructor extends App{
  var obj = new pc
  println(obj.a)
  println(obj.getA())
  obj.setA(2)
  println(obj.getA())
}