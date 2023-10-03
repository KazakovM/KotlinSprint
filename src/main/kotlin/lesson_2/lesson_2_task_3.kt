package lesson_2

fun main() {
    val hourOfDeparture: Byte = 9
    val minuteOfDeparture: Byte = 39
    val travelTimeInMinutes: Int = 457
    val hourOfArrival: Int = ((hourOfDeparture * 60) + minuteOfDeparture + travelTimeInMinutes) / 60
    val minuteOfArrival: Int = ((hourOfDeparture * 60) + minuteOfDeparture + travelTimeInMinutes) % 60
    println(String.format("%02d:%02d", hourOfArrival, minuteOfArrival))
}
