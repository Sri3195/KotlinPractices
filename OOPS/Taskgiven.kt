package com.oops

fun main(args:Array<String>)
{
    var emp:Employee=Employee(629,"Sri",30000,28)
    emp.displayInfo()
    var perday=emp.calculatePeDaySalary()
    println("Per day salary = $perday")
    var total=emp.totalSalary()
    println("Total salary $total")
}

class Employee(var id:Int,var name:String,var salary:Int,var noofDaysPresent:Int)
{
    fun displayInfo(){
        println("$id $name $salary $noofDaysPresent")
    }

    fun calculatePeDaySalary():Int{
        return (salary/30)
    }

    fun totalSalary():Int{
        var sal=calculatePeDaySalary()
        return (noofDaysPresent*sal)
    }
}
