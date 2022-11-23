package com.inheritance

fun main(args:Array<String>){
    var dev=Developer("Sri",21,50000)
    dev.displayInfo()
}
open class Employee(name:String,age:Int)
{
    var name:String=name
    var age:Int=age
    open fun displayInfo()
    {
       println("Name of Employee : $name")
       println("Age : $age")
    }
}

class Developer(name:String,age:Int,salary:Int):Employee(name,age){

    var salary:Int=salary
    override fun displayInfo(){
        super.displayInfo()
        println("Salary : $salary")
    }
}