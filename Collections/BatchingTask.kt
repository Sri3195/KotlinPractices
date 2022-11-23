package com.collections

fun main(){
    var javabatch= mutableListOf<String>("Anil","Gopal","Ankit","Manish")
    var kotlinbatch= mutableListOf<String>("Ankit","Kumar","Manish","Rahul")
    println("Javabatch: $javabatch")
    println("Kotlinbatch $kotlinbatch")
    javabatch.addAll(kotlinbatch)
    println("Adding both batches $javabatch")
    javabatch= javabatch.distinct().toMutableList()
    println("Removing duplicates $javabatch")
    javabatch.sort()
    println("Sorting the name : $javabatch")
}