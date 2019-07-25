class Lynx : Feline() {
    override val image = "Lynx.jpg"
    override val food = "meat"
    override val habitat = "Safaris"
    override fun makeNoise() {
        println("meowwwww!!")
    }


    override fun eat() {
        println("The Lynx is eating $food")


    }
}
