package `4 -classes`

class DVDPlayer(var hasRecorder: Boolean) {
    fun recordDVD () {
        if (hasRecorder) {
            println("DVD recording")
        }
    }

    fun playDVD () {
        if (hasRecorder) {
            println("DVD playing!")
        }
    }
}

fun main(args: Array<String>) {
    val d = DVDPlayer(true)
    d.recordDVD()
    d.playDVD()
}