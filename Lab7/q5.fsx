
open System

[<EntryPoint>]
let main argv =

    // Two test lists
    let list1 = [1; 2; 3; 4; 5]
    let list2 = [6; 7; 8; 9; 10]

    printfn "Original Lists:"
    printfn "List 1: %A" list1
    printfn "List 2: %A" list2

    // (1) List.map - Square each element
    printfn "\n----- LIST.MAP (SQUARE) -----"

    let square1 = List.map (fun x -> x * x) list1
    let square2 = List.map (fun x -> x * x) list2

    printfn "Squares of List 1: %A" square1
    printfn "Squares of List 2: %A" square2

    // (2) List.filter - Select even numbers
    printfn "\n----- LIST.FILTER (EVEN NUMBERS) -----"

    let even1 = List.filter (fun x -> x % 2 = 0) list1
    let even2 = List.filter (fun x -> x % 2 = 0) list2

    printfn "Even numbers in List 1: %A" even1
    printfn "Even numbers in List 2: %A" even2

    // (3) List.fold - Calculate sum
    printfn "\n----- LIST.FOLD (SUM) -----"

    let sum1 = List.fold (fun acc x -> acc + x) 0 list1
    let sum2 = List.fold (fun acc x -> acc + x) 0 list2

    printfn "Sum of List 1: %d" sum1
    printfn "Sum of List 2: %d" sum2

    // List.fold - Calculate product
    printfn "\n----- LIST.FOLD (PRODUCT) -----"

    let product1 = List.fold (fun acc x -> acc * x) 1 list1
    let product2 = List.fold (fun acc x -> acc * x) 1 list2

    printfn "Product of List 1: %d" product1
    printfn "Product of List 2: %d" product2

    0
