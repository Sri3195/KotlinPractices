import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    println("Enter a year")
    var year=sc.nextInt()
    var result=if((year%4==0) && (year%100!=0) ||(year%400==0)){
        "$year is a leap year"
    }else{ "$year is not a leap year"}

    println(result)
}