package com.exception
import java.lang.Exception
import java.util.InputMismatchException
import java.util.Scanner
fun main(args:Array<String>){
    try {
        var sc = Scanner(System.`in`)
        println("Enter number1")
        var num1 = sc.nextInt()
        println("Enter number2")
        var num2 = sc.nextInt()
        try {
            var div = num1 / num2
            println("Division solution : $div")
        } catch (e: ArithmeticException) {
            println("Do not enter zero")
        }
    }
    catch(e:InputMismatchException){
        println("Enter number only")
    }
    finally{
        println("Program Ended !!")
    }
}