fun main() {
    val a = 40
    val b = 25
    val c = 45

    var largestNum = a

    if (b>a) {
        largestNum = b
    }

    else if (b>c){
        largestNum = b
    }
    else if (c>a){
        largestNum = c
    }
    else if (c>b){
        largestNum = c
    }



    println("The largest number is $largestNum")
}
