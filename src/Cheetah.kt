class Cheetah : Feline() {
    override val image = "Lion.jpg"
    override val food = "meat"
    override val habitat = "Safaris"
    override fun makeNoise() {
        println("meowwww!")
    }


    override fun eat() {
        println("The Cheetah is eating $food")


    }
}
