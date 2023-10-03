package lesson_2

fun main() {
    val numberOfCrystalOre: Int = 7
    val numberOfIronOre: Int = 11
    val buffBonus: Float = 0.2F
    val buffedNumberOfCrystalOre = (numberOfCrystalOre * buffBonus).toInt()
    val buffedNumberOfIronOre = (numberOfIronOre * buffBonus).toInt()
    println(buffedNumberOfCrystalOre)
    println(buffedNumberOfIronOre)
}
