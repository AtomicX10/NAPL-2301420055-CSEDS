package main

import (
	"fmt"

	"Lab 2/utils"
)

func main() {

	fmt.Println("=== String Manipulation Functions ===")

	// Reverse function
	originalStr := "Hello"
	reversedStr := utils.Reverse(originalStr)

	fmt.Println("Original String:", originalStr)
	fmt.Println("Reversed String:", reversedStr)

	// CountVowels function
	testStr := "Programming"
	vowelCount := utils.CountVowels(testStr)

	fmt.Println("String:", testStr)
	fmt.Println("Vowel Count:", vowelCount)

	fmt.Println()
	fmt.Println("=== Mathematical Utility Functions ===")

	// Factorial function
	num := 5
	fact := utils.Factorial(num)

	fmt.Printf("Factorial of %d: %d\n", num, fact)

	// Power function
	base := 2
	exp := 8
	result := utils.Power(base, exp)

	fmt.Printf("%d raised to power %d: %d\n", base, exp, result)
}
