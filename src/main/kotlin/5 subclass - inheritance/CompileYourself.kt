open class Monster {
    open fun frighten(): Boolean {
        println("Argh!")
        return true
    }
}

class Vampire: Monster() {
    override fun frighten(): Boolean {
        println("Fancy is a bite?")
        return false
    }
}

class Dragon: Monster() {
    override fun frighten(): Boolean {
        println("Fire!")
        return  true
    }
}

fun main(args: Array<String>) {
    val m = arrayOf(Vampire(), Dragon(), Monster())

    for (item in m) {
        item.frighten()
    }
}