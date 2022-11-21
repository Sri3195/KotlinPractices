import java.util.Scanner
fun main(args:Array<String>){
    var sc=Scanner(System.`in`)
    println("Enter the size of the array")
    var mysize=sc.nextInt()
    var userarr=Array(mysize,{0})
    //taking user input values
    var sum=0
    for(i in 0..(mysize-1)){
        println("enter value at $i index")
        userarr.set(i,sc.nextInt())
        sum=sum+userarr[i]
    }
    println("Before sort,array is")
    for(i in 0..(mysize-1) ){
        print(" ${userarr[i]}")
    }
    var temp=0
    for(i in 0..(mysize-1)){
        for(j in 0..(mysize-2)){
            if(userarr[j]>userarr[j+1]){
                temp=userarr[j]
                userarr[j]=userarr[j+1]
                userarr[j+1]=temp

            }
        }
    }
    println()
    println("After sort, Ascending order of array is")
    for(i in 0..(mysize-1) ){
        print(" ${userarr[i]}")
    }
    println()
    println("After sort, Descending order of array is")
    for(i in (mysize-1) downTo 0 ){
        print(" ${userarr[i]}")
    }
    println()
    println("The Smallest Element of the array is ${userarr[0]}")
    println("The largest element of the array is ${userarr[mysize-1]}")
    println("The Second largest element of the array is ${userarr[mysize-2]}")
    println("The sum of the array elements $sum")

}