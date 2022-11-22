package com.oops

fun main(args:Array<String>)
{
    var person:Person=Person("Sri",21)
    person.displayPersonInfo()
}
class Person(name:String,age:Int){
    var name:String=name
    var age:Int=age

    init{
        println("Initaializer block")
    }
    fun displayPersonInfo()
    {
        println("$name $age")
    }
}