package lesson_4

fun main() {
    println("Корабль имеет повреждения? Введите true, если да и false, если нет")
    val spaceDamaged: Boolean = readln().toBoolean()
    println("Введите число экипажа цифрами")
    val crewMembersNumber: Int = readln().toInt()
    println("Введите число ящиков с провизией")
    val boxesOfProvision: Int = readln().toInt()
    println("Погода благоприятная? Введите true, если да и false, если нет")
    val goodWeather: Boolean = readln().toBoolean()
    val firstCondition = !spaceDamaged && crewMembersNumber in 55..70 &&
            boxesOfProvision > 50 && goodWeather
    val secondCondition = crewMembersNumber > 70 && boxesOfProvision >= 50 && goodWeather
    val allowedToGo = firstCondition || secondCondition
    println("Ship can go: $allowedToGo")
}
