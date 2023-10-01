package lesson_1

fun main() {
    val totalSeconds: Short = 6480
    var hours: String = (totalSeconds / 3600).toString()
    var minutes: String = (totalSeconds / 60 % 60).toString()
    var seconds: String = (totalSeconds / 1 % 60).toString()
    if (totalSeconds / 1 % 60 < 10) {
        seconds = "0$seconds"
    }
    if (totalSeconds / 60 % 60 < 10) {
        minutes = "0$minutes"
    }
    if (totalSeconds / 3600 < 10) {
        hours = "0$hours"
    }
    println("$hours:$minutes:$seconds")
}
