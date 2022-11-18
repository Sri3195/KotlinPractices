import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    println("Enter a number")
    var num=sc.nextInt()
    var rev=0;
    var rem=0
    while(num!=0){
         rem=num%10
        rev=rev*10+rem
        num=num/10
    }
    println("Reverse of given number is $rev")

}