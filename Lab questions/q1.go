package main

import "fmt"

func main() {
	fmt.Println("Hello, Anuj")

    var a int = 20
    var b int = 10

    
    var x float64 = 20.5
    var y float64 = 10.5

    fmt.Println("Integer Operations:")
    fmt.Println("Integer Addition:", a+b)
    fmt.Println("Integer Subtraction:", a-b)
    fmt.Println("Integer Multiplication:", a*b)
	fmt.Println("Integer Division:", a/b)

    fmt.Println("\nFloat Operations:")
    fmt.Println("Float Addition:", x+y)
    fmt.Println("Float Subtraction:", x-y)
    fmt.Println("Float Multiplication:", x*y)
	fmt.Println("Float Division:", x/y)
}
