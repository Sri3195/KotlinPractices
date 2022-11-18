import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    println("Enter a number")
    var num=sc.nextInt()
    var n=num
    var rem=0
    var rev=0
    while(num!=0){
        rem=num%10
        rev=rev*10+rem
        num=num/10
    }
    var result=if(rev==n) "$n is a palindrome"
    else "$n is not a palindrome"
    println(result)
}