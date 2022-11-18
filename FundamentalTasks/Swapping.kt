import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    println("Enter num1")
    var num1=sc.nextInt()
    println("Enter num2")
    var num2=sc.nextInt()
    print("num1 = $num1 and num2 = $num2")
    println()
    //swapping using temporary variable
    var temp=num2
    num2=num1
    num1=temp
    println("After Swapping using temporary variable- num1=$num1 and num2=$num2")
    //swapping withour using temporary variable
    num1=num1*num2
    num2=num1/num2
    num1=num1/num2
    println("After Swapping without using temporary variable- num1=$num1 and num2=$num2")
}