package main

import "fmt"

func main() {

	for {
		fmt.Println("\n===== SIMPLE CALCULATOR =====")
		fmt.Println("1. Integer Operations")
		fmt.Println("2. Floating-Point Operations")
		fmt.Println("3. Exit")

		var choice int
		fmt.Print("Enter your choice: ")
		fmt.Scan(&choice)

		if choice == 1 {

			var a, b int

			fmt.Print("Enter first integer: ")
			fmt.Scan(&a)

			fmt.Print("Enter second integer: ")
			fmt.Scan(&b)

			fmt.Println("\nInteger Operations:")
			fmt.Println("Addition:", a+b)
			fmt.Println("Subtraction:", a-b)
			fmt.Println("Multiplication:", a*b)

			if b != 0 {
				fmt.Println("Division:", a/b)
			} else {
				fmt.Println("Cannot divide by zero")
			}

		} else if choice == 2 {

			var a, b float64

			fmt.Print("Enter first floating-point number: ")
			fmt.Scan(&a)

			fmt.Print("Enter second floating-point number: ")
			fmt.Scan(&b)

			fmt.Println("\nFloating-Point Operations:")
			fmt.Printf("Addition: %.2f\n", a+b)
			fmt.Printf("Subtraction: %.2f\n", a-b)
			fmt.Printf("Multiplication: %.2f\n", a*b)

			if b != 0 {
				fmt.Printf("Division: %.2f\n", a/b)
			} else {
				fmt.Println("Cannot divide by zero")
			}

		} else if choice == 3 {

			fmt.Println("Exiting program...")
			break

		} else {

			fmt.Println("Invalid choice! Please enter 1, 2, or 3.")
		}
	}
}