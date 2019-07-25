class Fox : Canine() {
    override val image = "Fox.jpg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise() {
        println("hooooooow")
    }


    override fun eat() {
        println("The Fox is eating $food")


    }
}
