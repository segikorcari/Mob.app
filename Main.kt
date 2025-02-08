fun main() {
    println("Welcome to Rock-Paper-Scissors!")
    val game = Game()
    val player = Player()

    while (true) {
        val playerChoice = player.chooseMove()
        game.playRound(playerChoice)
    }
}
