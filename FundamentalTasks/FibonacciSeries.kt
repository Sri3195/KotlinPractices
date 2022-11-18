import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    println("Number of fibonacci series to be printed")
    var limit=sc.nextInt()
    var f0=0
    var f1=1
    print("$f0 $f1")
    for(count in 1..limit-2){
        var sum=f0+f1
        f0=f1
        f1=sum
        print(" $f1")
    }
}