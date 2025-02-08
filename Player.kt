class Player {
    fun chooseMove(): String {
        while (true) {
            println("Choose Rock, Paper, or Scissors:")
            val input = readLine()?.capitalize()
            if (input in listOf("Rock", "Paper", "Scissors")) {
                return input
            }
            println("Invalid choice, try again.")
        }
    }
}
