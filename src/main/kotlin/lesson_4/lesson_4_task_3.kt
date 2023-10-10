package lesson_4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val goodHumidity = 20
    val season = "зима"
    val badSeason = "зима"
    val isGoodCondition = isSunny && isTentOpen && humidity == goodHumidity && season != badSeason
    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodCondition")
}
