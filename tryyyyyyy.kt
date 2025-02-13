fun main() {
    // Define the customFilter function
    fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
        return numbers.filter(filter)  // Apply the filter to the list
    }

    // Test the customFilter function with different lambdas

    // Filter numbers greater than 5
    val greaterThan5 = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it > 5 }
    println(greaterThan5)  // Output: [6, 7, 8, 9, 10]

    // Filter even numbers
    val evenNumbers = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 2 == 0 }
    println(evenNumbers)  // Output: [2, 4, 6, 8, 10]

    // Filter numbers that are multiples of 3
    val multiplesOf3 = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 3 == 0 }
    println(multiplesOf3)  // Output: [3, 6, 9]
}