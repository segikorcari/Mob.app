import kotlin.random.Random

class Game {
    private val choices = listOf("Rock", "Paper", "Scissors")
    var playerScore = 0
    var computerScore = 0
    private val winningScore = 10

    fun playRound(playerChoice: String) {
        val computerChoice = choices.random()
        println("Computer chose: $computerChoice")

        when {
            playerChoice == computerChoice -> println("It's a tie!")
            playerWins(playerChoice, computerChoice) -> {
                println("You win this round!")
                playerScore++
            }
            else -> {
                println("Computer wins this round!")
                computerScore++
            }
        }

        println("Score: You [$playerScore] - Computer [$computerScore]")

        if (playerScore == winningScore) {
            println("🎉 You won the game!")
            resetGame()
        } else if (computerScore == winningScore) {
            println("💻 Computer won the game!")
            resetGame()
        }
    }

    private fun playerWins(player: String, computer: String): Boolean {
        return (player == "Rock" && computer == "Scissors") ||
               (player == "Scissors" && computer == "Paper") ||
               (player == "Paper" && computer == "Rock")
    }

    private fun resetGame() {
        println("Game Over! Do you want to play again? (yes/no)")
        val input = readLine()?.lowercase()
        if (input == "yes") {
            playerScore = 0
            computerScore = 0
        } else {
            println("Thanks for playing!")
            System.exit(0)
        }
    }
}
