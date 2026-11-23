
class Student(
    private var rollNo: Int,
    private var name: String,
    private var course: String,
    private var percentage: Double
) {

    // Function to accept and update student details
    fun acceptData() {
        println("\nEnter Student Details:")

        print("Enter Roll Number: ")
        rollNo = readLine()!!.toInt()

        print("Enter Name: ")
        name = readLine()!!

        print("Enter Course: ")
        course = readLine()!!

        print("Enter Percentage: ")
        percentage = readLine()!!.toDouble()
    }

    // Function to display student details
    fun displayDetails() {
        println("\n========== STUDENT DETAILS ==========")
        println("Roll Number : $rollNo")
        println("Name        : $name")
        println("Course      : $course")
        println("Percentage  : $percentage%")
        println("=====================================")
    }
}

fun main() {

    // Creating first Student object
    println("----- STUDENT 1 -----")
    val student1 = Student(0, "", "", 0.0)

    student1.acceptData()
    student1.displayDetails()

    // Creating second Student object
    println("\n----- STUDENT 2 -----")
    val student2 = Student(0, "", "", 0.0)

    student2.acceptData()
    student2.displayDetails()
}
