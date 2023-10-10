package lesson_4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val season = "зима"
    val isGoodCondition = isSunny && isTentOpen && humidity == 20 && season != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodCondition")
}
