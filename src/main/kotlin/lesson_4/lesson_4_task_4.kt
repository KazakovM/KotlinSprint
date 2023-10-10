package lesson_4

fun main() {
    val dayNumber = 5
    val armsDay = dayNumber % 2 == 1
    val absDay = dayNumber % 2 == 1
    val legsDay = dayNumber % 2 == 0
    val backDay = dayNumber % 2 == 0
    println("Упражнения для рук: $armsDay\n" +
            "Упражнения для ног: $legsDay\n" +
            "Упражнения для спины: $backDay\n" +
            "Упражнения для пресса: $absDay")
}
