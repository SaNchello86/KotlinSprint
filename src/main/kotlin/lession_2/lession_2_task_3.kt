package lession_2

fun main(){
    val travelTime: Int = 457 // время в пути в минутах
    val departureTimeHour: Int = 9 // часы выезда поезда
    val departureTimeMinute: Int = 39 // минуты выезда поезда
    val hour: Int = 60 // минут в 1 часе
    val inSpaceMinute = travelTime + departureTimeMinute + departureTimeHour * hour
    val inSpaceSeconds = inSpaceMinute % hour

    println(String.format("%02d:%02d", inSpaceMinute/hour, inSpaceSeconds,))
}