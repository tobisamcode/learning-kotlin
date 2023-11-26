package `4 -classes`
class Song (private val title: String, private val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop () {
        println("Stop playing $title")
    }
}

fun main(args: Array<String>) {
    val songOne = Song("The Mesopotamians", "They might be giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songOne.play()
    songOne.stop()
    songThree.play()
}