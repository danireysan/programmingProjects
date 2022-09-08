import kotlin.math.PI
fun main() {
    val squareCabin = SquareCabin(5, 50.0)
    val roundHut = RoundHut(3, 10.0)
    val roundTower = RoundTower(4, 15.5)

    val dwellings =
            mapOf(
                    "Square Cabin" to squareCabin,
                    "Round Hut" to roundHut,
                    "Round Tower" to roundTower
            )

    dwellings.forEach { (key, value) ->
        with(value) {
            println("\n${key}\n=========")
            println("Capacity: ${capacity}")
            println("Material: ${buildingMaterial}")
            println("Has rooms: ${hasRoom()}")
            println("Floor Area : ${floorArea()}")
        }
    }
}

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    abstract fun floorArea(): Double

    fun hasRoom(): Boolean {
        return residents < capacity
    }


}

class SquareCabin(residents: Int, val lenght:Double) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
    override fun floorArea(): Double{
        return lenght * lenght
    }
}

open class RoundHut(residents: Int, val radius:Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    override fun floorArea(): Double{
        return PI * radius * radius
    }
}

class RoundTower(residents: Int, radius: Double, val floors:Int = 2) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4
    override fun floorArea(): Double{
        return super.floorArea() * floors
    }
}
