package lession_2

fun main(){
    val travelTime: Int = 457 // время в пути в минутах
    val hous: Int = 9 // часы выезда поезда
    val minute: Int = 39 // минуты выезда поезда
//    val oneSeconds: Int = 1000 // миллисекунд
    val inSpaceMinute = travelTime / hous
    val inSpaceSeconds = travelTime / 1000

    println(String.format("%02d:%02d", inSpaceMinute, inSpaceSeconds,))
}