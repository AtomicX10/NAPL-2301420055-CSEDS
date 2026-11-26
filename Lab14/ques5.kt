fun main() {

    // 1. Nullable and Non-nullable variables

    var nullableName: String? = "Anuj"
    var nonNullableName: String = "Kotlin"

    println("Nullable variable: $nullableName")
    println("Non-nullable variable: $nonNullableName")

    // Nullable variable can store null
    nullableName = null

    println("Nullable variable after assigning null: $nullableName")

    // The following statement would cause a compile-time error:
    // nonNullableName = null
    // Error: Null can not be a value of a non-null type String


    // 2. Safe Call Operator (?.)

    val name: String? = null

    // Safe call returns null instead of causing an exception
    val length = name?.length

    println("\nSafe Call Example:")
    println("Name length: $length")

    val city: String? = "Delhi"
    println("City length: ${city?.length}")


    // 3. Elvis Operator (?:)

    val username: String? = null

    // If username is null, "Guest" is used
    val displayName = username ?: "Guest"

    println("\nElvis Operator Example:")
    println("Display name: $displayName")


    // 4. Not-null Assertion Operator (!!)

    val nullValue: String? = null

    println("\n!! Operator Example:")

    try {
        // !! forces Kotlin to treat the nullable value as non-null
        val result = nullValue!!

        println("Value: $result")
    }
    catch (e: NullPointerException) {
        println("NullPointerException caught!")
        println("Message: ${e.message}")
    }
}
    