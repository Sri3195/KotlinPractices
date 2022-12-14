package com.axis.dbconnection

import java.sql.DriverManager
import java.util.Scanner
import com.axis.dbconnection.User

fun main() {

    var sc=Scanner(System.`in`)
    println("Enter user id")
    var id=sc.nextInt()
    val myurl="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection= DriverManager.getConnection(myurl,"root","Sri@cse1")
    //println("Connection established successfully")

    val prestmt=connection.prepareStatement("select * from users where id=(?)")

    prestmt.setInt(1,id)
    val result=prestmt.executeQuery()
    val users = mutableListOf<User>()

    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        users.add(User(id, name))
    }
    for(user in users){
        println(user)
    }
}


