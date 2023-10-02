package lesson_2

import kotlin.math.pow

fun main() {
    val depositAmount: Int = 70000
    val depositRate: Float = 0.167F
    val depositTime: Int = 20
    val amountAfterDeposit: Float = depositAmount * (1 + depositRate).pow(depositTime)
    println(amountAfterDeposit)
}
