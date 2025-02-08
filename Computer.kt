import kotlin.random.Random

class Computer {
    private val choices = listOf("Rock", "Paper", "Scissors")

    fun chooseMove(): String {
        return choices[Random.nextInt(choices.size)]
    }
}
