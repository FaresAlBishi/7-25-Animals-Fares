class Wolf : Canine() {
    override val image = "Wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise() {
        println("hooooooow")
    }


    override fun eat() {
        println("The Wolf is eating $food")


    }
}
