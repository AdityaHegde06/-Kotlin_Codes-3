fun main(args: Array<String>) {
    val year = 1200
    var isLeap = false

    // Check if the year is divisible by 4
    if (year % 4 == 0) {
        // If the year is also divisible by 100, it must also be divisible by 400 to be a leap year
        isLeap = (year % 100 != 0) || (year % 400 == 0)
    }

    if (isLeap) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}

