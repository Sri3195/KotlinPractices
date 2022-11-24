package com.axis.dbconnection


import java.sql.DriverManager

fun main() {

    val myurl="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection= DriverManager.getConnection(myurl,"root","Sri@cse1")
    println("Connection established successfully")

    //   insert query -Create
    val stmt= connection.createStatement()
    stmt.execute("create table product(id int,name varchar(45));")
    print("table created")


}


