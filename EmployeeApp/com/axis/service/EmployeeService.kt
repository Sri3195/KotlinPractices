package com.axis.service

import com.axis.modal.Employee

//in servicde call we write the business logic
class EmployeeService {

    /*
    this method is used to display employee details
    parameters:IT takes employee objects as parameters
    returns=It returns unit
     */
    fun dislayEmployeeDetails(employee:Employee)
    {
        println("----------Employee Info --------")
        println("Employee id = ${employee.id}")
        println("Employee name = ${employee.name}")
        println("Employee salary= ${employee.salary}")
    }

    /*
        to find the perday salary of the employee
     */
    fun perDaySalary(employee:Employee):Int
    {
     return (employee.salary/30)
    }

    /*
      to increase the salary by ten percentage
     */
    fun increaseSalaryByTenPercentage(employee:Employee):Double
    {
        var incrementedSalary=(employee.salary*0.10)
        println("10% of salary is $incrementedSalary")
        return (incrementedSalary+employee.salary)

    }
}