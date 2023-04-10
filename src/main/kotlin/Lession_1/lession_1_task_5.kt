package Lession_1

fun main() {
    val secmondsInSpace = 6480 // время полёта в секундах
    val hous = 60 // минут
    val minute = 60 // секунд
    val oneSeconds = 1000 // миллисекунд
    val inSpaceMinute = secmondsInSpace / minute - hous
    val inSpaceSeconds = inSpaceMinute / oneSeconds

    println(String.format("%02d:%02d", inSpaceMinute, inSpaceSeconds,))

}