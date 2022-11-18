fun main(){
    var row=5
    var key=2*row-2
    for(i in 1..row){
        for(j in 1..key){
            print(" ")
        }
        key=key-2
        for(j in 1..i){
            print(" *  ")
        }
        println()
    }
    /*output
         *
       *   *
     *   *   *
   *   *   *   *
 *   *   *   *   *
     */

    row=5
    key=2*row-2
    for(i in 1..row){
        for(j in 1..key){
            print(" ")
        }
        key=key-2
        for(j in 1..i){
            print(" * ")
        }
        println()
    }
    /*output
         *
       *  *
     *  *  *
   *  *  *  *
 *  *  *  *  *
     */
    row=5
    key=2*row-2
    for(i in 1..row){
        for(j in 1..key){
            print(" ")
        }
        key=key-2
        for(j in 1..i){
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
}