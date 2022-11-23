package com.inheritance

fun main(args: Array<String>){
    var rect=Rectange()
    var tri=Traingle()
}

open class Shape
{
    init {
        println("Shape class")
    }
}
class Rectange: Shape() {
    init {
        println("Rectangle Class")
    }
}

class Traingle:Shape(){
    init {
        println("Traingle class")
    }
}