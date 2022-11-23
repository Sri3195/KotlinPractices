package com.collections
import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    var fruitsbasket=mutableListOf("Apple","Banana")
    println("1.Add 2.CheckContains 3.Delete")
    var choice=sc.nextInt()
    when(choice){
        1->{
            println("enter the fruit")
            var fruit=sc.next()
            fruitsbasket.add(fruit)
        }
        2->{
            println("enter the fruit")
            var fruit=sc.next()
            println("$fruit is in fruitsbasket ${fruitsbasket.contains(fruit)}")
        }
        3->{
            println("enter the fuit")
            var fruit=sc.next()
            if(fruitsbasket.contains(fruit)==true) {
                fruitsbasket.remove(fruit)
                println("fruit removed")
            }
            else{
                println("fruit not found")
            }

        }
        else-> println("Enter only fruits")
    }
    println("----Fruits Basket Contains -------")
    for(fruit in fruitsbasket){
        println(fruit)
    }

}