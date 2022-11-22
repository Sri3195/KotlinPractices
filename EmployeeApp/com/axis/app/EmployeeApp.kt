package com.axis.app
import com.axis.modal.Employee
import com.axis.service.EmployeeService

fun main(args:Array<String>){
    println("--------Employee App --------")

    var employee=Employee(1,"sri",45000)
    var employeeService=EmployeeService()

    employeeService.dislayEmployeeDetails(employee)

    println("Per day Salary = ${employeeService.perDaySalary(employee)}")
    println("Increase salary by 10% = ${employeeService.increaseSalaryByTenPercentage(employee)}")
}