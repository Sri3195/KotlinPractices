package com.axis.dbconnection

import java.sql.Connection
import java.sql.DriverManager

class DBConnection {
    fun connect():Connection{
        val myurl="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
        val connection= DriverManager.getConnection(myurl,"root","Sri@cse1")
        return connection
    }
}