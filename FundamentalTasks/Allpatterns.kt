fun main(){
    for(i in 1..5){
        for(j in 1..5) {
            print("* ")
        }
        println()
    }
    /*output
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
 */
    println()
    for(i in 1..5){
        for(j in 1..i) {
            print("* ")
        }
        println()
    }
    /*output
*
* *
* * *
* * * *
* * * * *
 */
    println()
    for(i in 1..3){
        for(j in 1..i) {
            print("$j ")
        }
        println()
    }

/*output
1
1 2
1 2 3
 */
    println()
    for(i in 1..3){
        for(j in 1..i) {
            print("$i ")
        }
        println()
    }
/*output
1
2 2
3 3 3
 */
    println()
    var ch='A'
    for(i in 1..3){
        for(j in 1..i) {
            print("$ch ")
        }
        ch=ch+1
        println()
    }
/*output
A
A B
A B C
 */
    println()
    for(i in 1..5){
        for(j in 1..5) {
            if(i==1 || i==5 || j==1 || j==5){
                print("* ")
            }
            else{
                print("  ")
            }
        }
        println()
    }
/*output
* * * * *
*       *
*       *
*       *
* * * * *
 */

}