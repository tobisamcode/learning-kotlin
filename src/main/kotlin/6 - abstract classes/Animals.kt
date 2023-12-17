interface Roamables {
    fun roam()
}

abstract class Animals : Roamables {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()
    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }

    open fun sleeping() {
        println("The Animal is sleeping")
    }
}

class Hippos : Animals() {
    override val image = "hippo.png"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }
}

abstract class Canines : Animals() {
    override fun roam() {
        println("The canine is roaming!")
    }
}

class Wolfs : Canines() {
    override val image = "wolf.png"
    override val food = "forests"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooools!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

class Vehicle : Roamables {
    override fun roam() {
        println("The vihicle is roaming")
    }
}

class Vets {
    fun giveShot(animal: Animals) {
        animal.makeNoise()
    }
}

fun main() {
    val animals = arrayOf(Hippos(), Wolfs(), Vehicle())

    for (item in animals) {
        item.roam()
        if (item is Animals) {
            item.eat()
        }
    }

    val vet = Vets()
    val wolf = Wolfs()
    val hippo = Hippos()

    vet.giveShot(wolf)
    vet.giveShot(hippo)
}
