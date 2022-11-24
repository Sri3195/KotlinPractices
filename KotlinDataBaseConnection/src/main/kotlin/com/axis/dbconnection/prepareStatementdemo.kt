package com.axis.dbconnection
import java.sql.DriverManager
import java.util.Scanner

fun main() {

    var sc=Scanner(System.`in`)
    println("Enter user id")
    var id=sc.nextInt()
    println("Enter user name")
    var name=sc.next()

    val myurl="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection= DriverManager.getConnection(myurl,"root","Sri@cse1")
    println("Connection established successfully")

   val prestmt=connection.prepareStatement("insert into users values(?,?)")

    prestmt.setInt(1,id)
    prestmt.setString(2,name)
    val result=prestmt.executeUpdate()
    if(result>0){
        println("inserted")
    }else{
        println("not inserted")
    }
}


