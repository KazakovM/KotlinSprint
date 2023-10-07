package lesson_4

fun main() {
    var isSunny = true
    var isTentOpen = true
    var humidity = 20
    var season = "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunny && isTentOpen && humidity == 20 && season != "зима"}")
}
