package com.arrays

import java.util.Scanner
fun main(args:Array<String>){
    var sc=Scanner(System.`in`)
    println("Enter the size of the array")
    var mysize=sc.nextInt()
    var userarr=Array(mysize,{0})
    //taking user input values
    for(i in 0..(mysize-1)){
        println("enter value at $i index")
        userarr.set(i,sc.nextInt())
    }
    println("Array is")
    for(i in 0..(mysize-1) ){
        print(" ${userarr[i]}")
    }
    var small=10000
    for(i in 0..(mysize-1)){
        if(userarr[i]<small){
            small=userarr[i]
        }
    }
    println()
    println("The smallest element in the array= $small")
}