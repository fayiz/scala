package fayiz

class ac{
  var x = 0;
  var y = 0;
  
  println("Object Called");
  
  def this(input: Int) = {
    this()
    x = input
    println("inside constructor 1 : x = " + x)
  }
  
    def this(input: Int, input2: Int) = {
    this(input)
    y = input2
    println("inside constructor 2 : x = " + x + ", y = " + y)
  }
  
  
}

object AuxilaryConstructor extends App{
  println("Obj:");
  var obj = new ac
  println("\nObj1:");
  var obj1 = new ac()
  println("\nObj2:");
  var obj2 = new ac(20)
  println("\nObj3:");
  var obj3 = new ac(50, 100)
}