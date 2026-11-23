
fun displayDetails(
    name: String,
    age: Int = 20,
    city: String = "Delhi"
) {
    println("Name: $name")
    println("Age: $age")
    println("City: $city")
    println()
}

// Function with vararg
fun printNumbers(vararg numbers: Int) {
    println("Numbers are:")
    for (num in numbers) {
        println(num)
    }
    println()
}

// Higher-order function accepting a lambda
fun processNumbers(
    numbers: List<Int>,
    operation: (Int) -> Int
) {
    val result = numbers.map(operation)
    println("Original List: $numbers")
    println("Processed List: $result")
}

fun main() {

    // 1. Default Parameters
    println("----- DEFAULT PARAMETERS -----")

    // Calling without providing default values
    displayDetails("Rahul")

    // Calling with custom values
    displayDetails("Anuj", 21, "Gurgaon")


    // 2. Named Arguments (Out of Order)
    println("----- NAMED ARGUMENTS -----")

    displayDetails(
        city = "Mumbai",
        name = "Amit",
        age = 22
    )


    // 3. Vararg Function
    println("----- VARARG FUNCTION -----")

    printNumbers(10, 20, 30, 40, 50)


    // 4. Higher-Order Function with Lambda
    println("----- HIGHER-ORDER FUNCTION -----")

    val numbers = listOf(1, 2, 3, 4, 5)

    // Lambda to calculate square of each number
    processNumbers(numbers) { it * it }
}
