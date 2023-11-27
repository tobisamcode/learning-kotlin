package `4 -classes`
class TapeDeck{
    var hasRecorder: Boolean = false

    fun playTape() {
        println("Tape playing")
    }

    fun  recordTape() {
        if (hasRecorder) {
            println("Tape recording!")
        }
    }
}

fun main(args: Array<String>) {
    var t = TapeDeck()
    t.hasRecorder = true
    t.playTape()
    t.recordTape()
}