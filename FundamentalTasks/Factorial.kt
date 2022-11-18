import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    println("Enter a number")
    var num=sc.nextInt()
    var result= fact(num)
    println("Factorial of $num is $result")

}
fun fact(n:Int):Int{
    if(n==1)
        return 1
    else
        return n*fact(n-1)
}
