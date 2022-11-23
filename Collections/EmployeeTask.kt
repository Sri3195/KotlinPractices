package com.collections

fun main()
{
    var employee= mutableListOf<Employee>()
    employee.add(Employee(629,"Sri","CSE",21,50000.0))
    employee.add(Employee(970,"Bala","CHEM",22,45000.0))
    employee.add(Employee(630,"Yamani","Nutrition",22,50000.0))
    for(emp in employee){
        println("${emp.id} ${emp.name} ${emp.dept} ${emp.age} ${emp.salary}")
    }
}
class Employee(id:Int,name:String,dept:String,age:Int,salary:Double)
{
    var id:Int=id
    var name:String=name
    var dept:String=dept
    var age:Int=age
    var salary:Double=salary
}