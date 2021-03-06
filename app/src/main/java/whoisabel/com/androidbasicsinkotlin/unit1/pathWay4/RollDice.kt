package whoisabel.com.androidbasicsinkotlin.unit1.pathWay4

fun main() {
    val firstDice = Dice(6)
    val diceRoll = firstDice.roll()
    println("Your ${firstDice.numSide} sided dice rolled ${diceRoll}!")

    val luckyNumber = 4

    when (diceRoll) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
    }

}

