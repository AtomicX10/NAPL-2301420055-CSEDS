package main

import "fmt"

func changeValue(num *int) {
	*num = 100
}

type Student struct {
	Name string
	Age  int
	Marks float32
}

func addStudent(s *Student, name string, age int, marks float32) {
	s.Name = name
	s.Age = age
	s.Marks = marks
}

func main() {

	x := 50

	fmt.Println("Original value:", x)
	fmt.Println("Address of x:", &x)
	fmt.Println("Value using pointer:", *(&x))

	fmt.Println("\nBefore function call:", x)

	changeValue(&x)

	fmt.Println("After function call:", x)

	student := new(Student)

	student.Name = "Anuj"
	student.Age = 21
    student.Marks = 90

	fmt.Println("\nStudent Details:")
	fmt.Println("Name:", student.Name)
	fmt.Println("Age:", student.Age)
	fmt.Println("Marks:", student.Marks)
	addStudent(student, "Anuj", 22, 85)
	fmt.Println("\nUpdated Student Details:")
	fmt.Println("Name:", student.Name)
	fmt.Println("Age:", student.Age)
	fmt.Println("Marks:", student.Marks)
}