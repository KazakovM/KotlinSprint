package lesson_4

fun main() {
    val totalTables = 13
    var bookedToday = 13
    var bookedTomorrow = 9
    println("Доступность столиков на сегодня: ${bookedToday < totalTables}\n" +
            "Доступность столиков на завтра: ${bookedTomorrow < totalTables}")
}
