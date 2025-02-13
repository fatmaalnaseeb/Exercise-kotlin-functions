fun main(){
    //1
    val favoriteFruits = mutableListOf("Apple","Mango","Orange")
    favoriteFruits.add("Dragon")
    favoriteFruits.removeAt(1)
    println(favoriteFruits)

    //2
    val lisfOfValues = mutableSetOf(1,2,3,3,4,5,5)
    lisfOfValues.add(3)
    lisfOfValues.add(6)
    println(lisfOfValues)

    //3
    val countryNames = mutableMapOf("USA" to "Washington", "France" to "Paris","Germany" to "Berlin")
    countryNames["UK"] = "London"
    println("Countries: ${countryNames.keys}")
    println("Capitals: ${countryNames.values}")
    countryNames.remove("USA")
    println("Final Map: $countryNames")


    //4
    val carBrands = arrayListOf("BMW","Mercedes","bentley")
    carBrands.add("porsche")
    carBrands.add("maserati")
    carBrands.remove("BMW")
    println(carBrands)


    //5
    val listOfNum = listOf(10, 5, 20, 15, 25, 30)
    val numbersGreaterThanFifteen = listOfNum.filter { it > 15 }
    println("Numbers greater than 15: $numbersGreaterThanFifteen")
    println(listOfNum.sorted())


    //6
    val pointNumbers = listOf(2.5, 7.1, 3.8, 9.2, 5.6)
    val maxNumber = pointNumbers.max()
    val minNumber = pointNumbers.min()
    println("Largest number: $maxNumber")
    println("Smallest number: $minNumber ")








}