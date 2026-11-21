
open System

// Task 1
let task1 =
    async {
        printfn "Task 1 started: Downloading data..."
        do! Async.Sleep(3000)
        printfn "Task 1 completed!"
        return "Data downloaded successfully"
    }

// Task 2
let task2 =
    async {
        printfn "Task 2 started: Processing data..."
        do! Async.Sleep(2000)
        printfn "Task 2 completed!"
        return "Data processed successfully"
    }

// Task 3
let task3 =
    async {
        printfn "Task 3 started: Saving data..."
        do! Async.Sleep(1000)
        printfn "Task 3 completed!"
        return "Data saved successfully"
    }

[<EntryPoint>]
let main argv =

    printfn "Starting all tasks concurrently...\n"

    let tasks = [| task1; task2; task3 |]

    // Execute all tasks concurrently
    let results = Async.Parallel tasks
                 |> Async.RunSynchronously

    printfn "\nAll tasks completed!"
    printfn "\n----- FINAL RESULTS -----"

    results
    |> Array.iter (printfn "%s")

    0