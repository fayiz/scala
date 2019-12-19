package fayiz

class Employee{
  var name = ""
  var age = 0
  var gender = ""
}

class EmployeeAttributes extends Employee{
  var salary = 0.0 
  
  def empDef:String = s"Name: $name, Age: $age, Gender: $gender, Salary: $salary" 
}

object InheritancePractice extends App {
  var empObj = new EmployeeAttributes
  empObj.name = "Fayiz Mayam Veettil"
  empObj.age = 35
  empObj.gender = "Male"
  empObj.salary = 123456.00
  println("Employee Name : " + empObj.name)
  println("Employee Age : " + empObj.age)
  println("Employee Gender : " + empObj.gender)
  println("Employee Salary : " + empObj.salary)
  println("")
  println(empObj.empDef)
}