package com.strings
fun main(args:Array<String>){
    var name="Srilakshmi"

    println("Your name is $name")
    println("The length of your name is ${name.length}")
    println("The indices range is ${name.indices}")
    println("The last index of you name is ${name.lastIndex}")
    println()

    println("------String Functions")
    println("1.Comparing Strings")
    var dept="CSE"
    var dept1="CS"
    var res=dept.compareTo(dept1)
    if(res==0)
        println("The words $dept and $dept1 are equal ")
    else
        println("The words $dept and $dept1 are not equal")


    println()
    println("2.Getting index of a character")
    println("The character at index 0 in your name is ${name.get(0)}")

    println()
    println("3.Adding another string to a string")
    println("Your full name is ${name.plus("ln(Bhukya")}")

    println()
    println("4.Printing SubSequence")
    println("The subsequence of your name is ${name.subSequence(0,3)}")
}
