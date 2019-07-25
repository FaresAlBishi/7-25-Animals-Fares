class Vet {
    fun giveShot(animal: Animal){
        animal.makeNoise()
    }
}

fun main (args: Array<String>){
    val animal = arrayOf(Hippo(),Wolf(),Lion())
    for (item in animal){
        item.roam()
        item.eat()

    }
    val vet = Vet()
    val wolf =  Wolf()
    val hippo = Hippo()
    val lion = Lion()
    vet.giveShot(wolf)
    vet.giveShot(lion)
    vet.giveShot(hippo)

}