
fun main() {

    // TASK 1: Hello Kotlin
    println("----- TASK 1: Hello Kotlin -----")
    println("Hello Kotlin!!!")


    // TASK 2: Employee Bonus Calculation
    println("\n----- TASK 2: Employee Bonus -----")

    print("Enter Employee Name: ")
    val name = readLine()!!

    print("Enter Department Code (IT/HR/FINANCE): ")
    val deptCode = readLine()!!.uppercase()

    print("Enter Years of Experience: ")
    val experience = readLine()!!.toInt()

    print("Enter Employee Salary: ")
    val salary = readLine()!!.toDouble()

    // Calculate bonus percentage using when
    val bonusPercentage = when {
        deptCode == "IT" && experience > 5 -> 20
        deptCode == "HR" && experience > 3 -> 15
        deptCode == "FINANCE" && experience > 4 -> 18
        else -> 10
    }

    val bonusAmount = salary * bonusPercentage / 100

    println("\nEmployee Name: $name")
    println("Department: $deptCode")
    println("Experience: $experience years")
    println("Bonus Percentage: $bonusPercentage%")
    println("Bonus Amount: Rs. $bonusAmount")


    // TASK 3: Average of Individual Digits
    println("\n----- TASK 3: Average of Digits -----")

    print("Enter an integer: ")
    var number = readLine()!!.toInt()

    // Handle negative numbers
    number = kotlin.math.abs(number)

    var sum = 0
    var count = 0

    if (number == 0) {
        count = 1
    }

    while (number > 0) {
        val digit = number % 10
        sum += digit
        count++
        number /= 10
    }

    val average = sum.toDouble() / count

    println("Sum of digits: $sum")
    println("Number of digits: $count")
    println("Average of digits: $average")
}
