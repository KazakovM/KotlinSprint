package lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val allowedWeight = minWeight..maxWeight
    val maxVolume = 100
    val itemOneWeight = 20
    val itemOneVolume = 80
    val itemTwoWeight = 50
    val itemTwoVolume = 100
    println(
        "Груз с весом $itemOneWeight кг и объемом $itemOneVolume л " +
                "соответствует категории 'Average': " +
                "${
                    (itemOneWeight in allowedWeight &&
                    itemOneVolume < maxVolume)
                }"
    )
    println(
        "Груз с весом $itemTwoWeight кг и объемом $itemTwoVolume л " +
                "соответствует категории 'Average': " +
                "${
                    (itemTwoWeight in allowedWeight &&
                    itemTwoVolume < maxVolume)
                }"
    )
}
