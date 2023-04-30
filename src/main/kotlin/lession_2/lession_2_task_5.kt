package lession_2

import kotlin.math.pow

fun main () {
    val depositAmount: Double = 70000.0
    val interestRate: Double = 16.7
    val depositTerm: Double = 20.0
    val amountOfIncome = depositAmount * ((1+interestRate/100).pow(depositTerm))

    println (String.format ("%.3f", amountOfIncome))

}