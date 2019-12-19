package fayiz

object singleton{
  //its like a class only, only difference is that the constructor of the object never have any input/parameters
  private var num = 0;
  def getNum = {num = num + 1; num}
}

class Class1 {
  private var num = 0;
  def getNum = {num = num + 1; num}
}

object SingletonExample extends App{
  var obj1 = singleton.getNum
  var obj2 = singleton.getNum
  var obj3 = singleton.getNum
  
  println("Object Example")
  println(s"obj1 : $obj1")
  println(s"obj2 : $obj2")
  println(s"obj3 : $obj3")
  
  println("\nClass Example")
  var cl1 = new Class1
  println("obj1 : " + cl1.getNum)
  var cl2 = new Class1
  println("obj2 : " + cl2.getNum)
  var cl3 = new Class1
  println("obj3 : " + cl3.getNum)
  
}