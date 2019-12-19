package fayiz

trait Logger{
  def log(msg:String) //Abstract Method
  //Abstract Method - only signature, no body defined. Body should be declared in the implemented Classes
  def log2(msg: String) = println(msg) //Concrete Method
  //Concrete Method - with body definition 
  
}

class TraitClass extends Logger{ //if multiple traits are to be implemente use 'implelemts' instead of extends
  def log(msg: String) = println(msg)
  //def log2(msg: String) = println(msg) //It will give error as the body is already defined in the Logger trait
}

object TraitObj extends App{
  var obj = new TraitClass
  obj.log("Logger 1")
  obj.log2("Logger 2")
}


