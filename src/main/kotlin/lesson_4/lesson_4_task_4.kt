package lesson_4

fun main() {
    var dayNumber = 5
    var armsDay = dayNumber % 2 == 1
    var absDay = dayNumber % 2 == 1
    var legsDay = dayNumber % 2 == 0
    var backDay = dayNumber % 2 == 0
    println("Упражнения для рук: $armsDay\n" +
            "Упражнения для ног: $legsDay\n" +
            "Упражнения для спины: $backDay\n" +
            "Упражнения для пресса: $absDay")
}
