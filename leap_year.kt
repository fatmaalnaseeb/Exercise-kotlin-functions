fun main(){
    val year: Int = 2002
    if (year %4 ==0 && (year % 100!=0 || year % 400 ==0 )){
        println("Leap year")

    }
    else {
        println("Not a Leap Year")
    }
}