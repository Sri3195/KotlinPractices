package com.inheritance

fun main(args:Array<String>){
    var daughter=Daughter()
}
open class Grandmother
{
    init{
        println("My Grandmoter name is Jammu")
    }
}
open class Mother:Grandmother()
{
    init{
        println("My Mother name is Aruna")
    }
}
class Daughter:Mother()
{
    init{
        println("My name is Srilakshmi")
    }
}
