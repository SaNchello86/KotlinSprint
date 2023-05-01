package lession_2

import kotlin.math.pow

fun main () {
    val depositAmount = 70000
    val interestRate  = 16.7
    val depositTerm  = 20.0
    val amountOfIncome = depositAmount * ((1 + interestRate / 100).pow(depositTerm))

    println (String.format ("%.3f", amountOfIncome))

}