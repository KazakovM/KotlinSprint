package lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100
    var itemOneWeight = 20
    var itemOneVolume = 80
    var itemTwoWeight = 50
    var itemTwoVolume = 100
    println(
        "Груз с весом $itemOneWeight кг и объемом $itemOneVolume л " +
                "соответствует категории 'Average': " +
                "${
                    (itemOneWeight >= minWeight) &&
                    (itemOneWeight <= maxWeight) &&
                    (itemOneVolume < maxVolume)
                }"
    )
    println(
        "Груз с весом $itemTwoWeight кг и объемом $itemTwoVolume л " +
                "соответствует категории 'Average': " +
                "${
                    (itemTwoWeight >= minWeight) &&
                    (itemTwoWeight <= maxWeight) &&
                    (itemTwoVolume < maxVolume)
                }"
    )
}
