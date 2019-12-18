package fayiz

class SecondClass{
  
  private var x = 10;
  
  
  def increment() = { x = x + 1 }
  
  //GetterMethod
  def current() = x
  
  //Another getter mothod
  def getCurrent() : Int = {
    x
  }
  
  //Setter Method
  def setValue(input: Int) = x = input
  
  def setCurrent(input: Int) = {
    x = input
  }
  
}

object ClassExample{
  def main(args: Array[String]){
    println("\nFirst Object")
    var obj1 = new SecondClass
    println(obj1.current)
    obj1.setValue(12)
    println(obj1.getCurrent)
    
    println("\nSecond Object")
    var obj2 = new SecondClass
    println(obj2.getCurrent)
    obj2.setCurrent(12)
    println(obj2.current)
    obj2.increment()
    println("incremented value" + obj2.current)
  }
}