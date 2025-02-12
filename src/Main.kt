fun main() {

    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0, 5.0))

}

val greetSeaCreatures = {println("Hello, Deep Sea Adventurer!")}

val findPearl = {number: Int ->  number * number }

val divideTreasure = {totalTreasure: Double, numberExplorers: Double -> totalTreasure/numberExplorers}