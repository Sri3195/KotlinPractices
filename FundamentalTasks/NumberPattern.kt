fun main(){
    for(i in 1..5){
        for(j in i downTo 1 ){
            print("$j ")
        }
        println()
    }
}
/*output
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */