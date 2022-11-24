package com.axis.dbconnection

import java.sql.DriverManager

fun main() {

    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("Connection established successfully")

    //   insert query -Create
    val stmt= connection.createStatement()
    val res=stmt.executeUpdate("insert into users values(5,'ankit')")

    if (res > 0) {
        println("successfully inserted record into users db !!!")
    } else {
        println("Insert Not sucessful")
    }
}


