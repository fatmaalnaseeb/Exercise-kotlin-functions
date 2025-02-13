fun main(){
val differenceDepth = calculateDepth(1500,800){depth0,depth1 ->depth0-depth1}
    println(differenceDepth)
}

fun calculateDepth(depth0: Int, depth1: Int, depthCalculator: (Int, Int)-> Int): Int{
    return depthCalculator(depth0,depth1)

}
