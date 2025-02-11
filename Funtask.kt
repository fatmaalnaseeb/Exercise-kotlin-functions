fun main(){
    //1
    greetTraveler()

    //2
    findOasis(10,20)

    //3
    val avgTemp= currentTemperature(25,40)
    println("Average Temperature: $avgTemp")

    //4
    startCamelRide(10, 5)
    startCamelRide(10)

    //5
    val timeToClimb = exploreDune(climbRate = 3, height = 20)

    val climbTime = exploreDune(20, 30)
    println("Time to Climb the Dune: $climbTime hours")

    //6
    val supplies = 8
    val chance = survivalChance(supplies)
    println("Survival Chance: $chance")






}
//1
fun greetTraveler() {
    println("Welcome to the Desert, Traveler!")
}
//2
fun findOasis(x : Int , y : Int){
    println("Oasis found at coordinates ($x, $y)")
}

//3
fun currentTemperature(morningTemperature:Int , afternoonTemperature:Int): Int{
    return (morningTemperature + afternoonTemperature) / 2
}

//4
fun startCamelRide(time: Int, speed: Int = 5) {
    val distance = time * speed
    println("Camel Ride: Distance = $distance km, Speed = $speed km/h, Time = $time hours")
}

//5
fun exploreDune(height: Int, climbRate: Int): Double {
    return height.toDouble() / climbRate
}

//6
fun survivalChance(supplies: Int): Int = supplies * 10


