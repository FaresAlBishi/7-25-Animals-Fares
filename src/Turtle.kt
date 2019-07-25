class Turtle : Animal() {
    override val image = "Turtle.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Bruh Bruh")
    }

    override fun eat() {
        println("The Turtle is Eating $food")
    }
}