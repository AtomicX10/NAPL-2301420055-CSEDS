
data class Student(
    val rollNo: Int,
    val name: String,
    val percentage: Double,
    val course: String
)

fun main() {


    println("===== LIST OPERATIONS =====")

    // Mutable List
    val mutableList = mutableListOf(10, 20, 30, 40)

    println("Mutable List: $mutableList")

    mutableList.add(50)
    println("After add(50): $mutableList")

    mutableList.remove(20)
    println("After remove(20): $mutableList")

    println("Contains 30: ${mutableList.contains(30)}")
    println("Element at index 1: ${mutableList[1]}")

    // Read-only List
    val readOnlyList = listOf(100, 200, 300, 400)

    println("\nRead-only List: $readOnlyList")
    println("Contains 200: ${readOnlyList.contains(200)}")
    println("Element at index 2: ${readOnlyList[2]}")

  
    println("\n===== SET OPERATIONS =====")

    // Mutable Set
    val mutableSet = mutableSetOf(10, 20, 30, 40)

    println("Mutable Set: $mutableSet")

    mutableSet.add(50)
    println("After add(50): $mutableSet")

    mutableSet.remove(20)
    println("After remove(20): $mutableSet")

    println("Contains 30: ${mutableSet.contains(30)}")

    // Read-only Set
    val readOnlySet = setOf(100, 200, 300, 400)

    println("\nRead-only Set: $readOnlySet")
    println("Contains 200: ${readOnlySet.contains(200)}")

  
    println("\n===== MAP OPERATIONS =====")

    // Mutable Map
    val mutableMap = mutableMapOf(
        1 to "Anuj",
        2 to "Rahul",
        3 to "Aman"
    )

    println("Mutable Map: $mutableMap")

    mutableMap[4] = "Rohan"
    println("After adding key 4: $mutableMap")

    mutableMap.remove(2)
    println("After removing key 2: $mutableMap")

    println("Contains key 1: ${mutableMap.containsKey(1)}")
    println("Value for key 3: ${mutableMap[3]}")

    // Read-only Map
    val readOnlyMap = mapOf(
        1 to "Java",
        2 to "Kotlin",
        3 to "Python"
    )

    println("\nRead-only Map: $readOnlyMap")
    println("Contains key 2: ${readOnlyMap.containsKey(2)}")
    println("Value for key 3: ${readOnlyMap[3]}")

    println("\n===== MAP, FILTER AND REDUCE =====")

    val numbers = listOf(1, 2, 3, 4, 5, 6)

    println("Original List: $numbers")

    // map() - transforms every element
    val squares = numbers.map { it * it }

    println("After map (squares): $squares")

    // filter() - selects elements according to a condition
    val evenNumbers = squares.filter { it % 2 == 0 }

    println("After filter (even squares): $evenNumbers")

    // reduce() - combines all elements into one result
    val sum = evenNumbers.reduce { total, number -> total + number }

    println("After reduce (sum): $sum")


    println("\n===== STUDENT SORTING =====")

    val students = listOf(
        Student(101, "Anuj", 82.5, "Data Science"),
        Student(102, "Rahul", 91.0, "Data Science"),
        Student(103, "Aman", 76.5, "CSE"),
        Student(104, "Riya", 88.0, "CSE"),
        Student(105, "Neha", 95.0, "Data Science")
    )

    println("\nOriginal Students:")
    students.forEach {
        println("${it.rollNo} - ${it.name} - ${it.percentage}% - ${it.course}")
    }

    // Sort students by percentage
    val sortedStudents = students.sortedByDescending { it.percentage }

    println("\nStudents Sorted by Percentage:")
    sortedStudents.forEach {
        println("${it.rollNo} - ${it.name} - ${it.percentage}% - ${it.course}")
    }



    println("\n===== GROUPING STUDENTS =====")

    val groupedStudents = students.groupBy { it.course }

    groupedStudents.forEach { (course, studentList) ->
        println("\nCourse: $course")

        studentList.forEach {
            println("${it.name} - ${it.percentage}%")
        }
    }
}

