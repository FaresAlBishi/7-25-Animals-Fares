class Lion : Feline() {
    override val image = "Lion.jpg"
    override val food = "meat"
    override val habitat = "Safaris"
    override fun makeNoise() {
        println("Ahhhhhhhhhh!")
    }


    override fun eat() {
        println("The Lion is eating $food")


    }
}
