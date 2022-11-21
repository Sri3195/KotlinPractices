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
    println("Before sort,array is")
    for(i in 0..(mysize-1) ){
        print(" ${userarr[i]}")
    }
    var temp=0
    for(i in 0..(mysize-1)){
        for(j in 0..(mysize-2)){
            if(userarr[j]<userarr[j+1]){
                temp=userarr[j]
                userarr[j]=userarr[j+1]
                userarr[j+1]=temp

            }
        }
    }
    println()
    println("After sort, array is")
    for(i in 0..(mysize-1) ){
        print(" ${userarr[i]}")
    }
}