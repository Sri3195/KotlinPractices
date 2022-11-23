package com.inheritance
fun main(args:Array<String>)
{
    var parrot=Parrot()
    parrot.fly()
    println("Parrot color is : ${parrot.color}")
}

open class Bird
{
    open var color="Black"
    open fun fly()
    {
        println("Bird is Flying")
    }
}

interface Duck
{
    fun fly(){
        println("Duck is flying")
    }
}
class Parrot:Bird(),Duck{
    override var color="Green"
    override fun fly(){
        super<Bird>.fly()
        super<Duck>.fly()
        println("Parrot is flying")
    }
}
