import java.awt.Choice

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")

    val gameChoice = getGameChoice(options)

    val userChoice = getUserChoice(options)

    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    // Loop until the user enters a valid choice
    while (!isValidChoice) {

        // Ask the user for choice
        print("Please enter on of the following: ")
        for (item in optionsParam) print(" $item")
        println(".")

        //Read the user input
        val userInput = readlnOrNull()

        //Validate the user input
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }

        // If the choice is invalid, inform the user
        if (!isValidChoice) println("You must enter a valid choice. ")
    }

    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    var result: String

    if (userChoice == gameChoice) result = "Tie!"
    else if (((userChoice == "Rock" && gameChoice == "Scissors")) || (userChoice == "Paper" && gameChoice ==
                "Rock") || (userChoice == "Scissors" && gameChoice == "Paper")
    ) result = "You win!";
    else result = "You lose!"

    println("You chose $userChoice. I chose $gameChoice. $result")
}