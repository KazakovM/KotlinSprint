package lesson_3

fun main() {
    val moveRecord = "D2-D4;0"
    val positionBefore = moveRecord.split(";")[0].split("-")[0]
    val positionAfter = moveRecord.split(";")[0].split("-")[1]
    val moveCount = moveRecord.split(";")[1]
    println(positionBefore)
    println(positionAfter)
    println(moveCount)
}
