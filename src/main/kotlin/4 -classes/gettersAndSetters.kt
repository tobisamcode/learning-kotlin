package `4 -classes`

class Dog(val name: String, weight_param: Int, breed_param: String) {

    init {
        println("Dog $name has been created")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("The breed is $breed")
    }

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs: Double
        get() = weight / 2.2

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main(args: Array<String>) {
    val dogOne = Dog("Bingo", 70, "Native")
    dogOne.bark()
    dogOne.weight = 75
    println("Weight in Kgs is ${dogOne.weightInKgs}")
    dogOne.weight = -2
    println("Weight is ${dogOne.weight}")
    dogOne.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in dogOne.activities) {
        println("My dog enjoys $item")
    }

    val dogs = arrayOf(Dog("Smart", 20, "Shepherd"), Dog("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight of ${dogs[1].name} is ${dogs[1].weight}")
}
