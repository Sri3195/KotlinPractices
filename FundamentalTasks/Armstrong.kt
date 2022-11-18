import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    println("Enter a number")
    var num=sc.nextInt()
    var n=num
    var n1=n
    var rem=0
    var rev=0
    var count=0
    //calculate the length of the number
    while(num!=0){
        count=count+1
        num=num/10
    }
    //to calculate the reverse
    while(n!=0){
        rem=n%10
        rev=rev+(Math.pow(rem.toDouble(),count.toDouble()).toInt())
        n=n/10
    }
    var result=if(rev==n1) "$n1 is an armstrong number"
    else "$n1 is not an armstrong number"
    println(result)
}