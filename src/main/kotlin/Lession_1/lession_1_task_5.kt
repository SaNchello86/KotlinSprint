package Lession_1

fun main() {
    val secmondsInSpace = 6480 // колличество секунд побывавших Юрием Гагариным в космосе
    val hour = 60 // минут в одном часе
    val minute = 60 // секунд в одной минуте
    val oneSeconds = 1000 // миллисекунд в одной секунде
    val inSpaceHour = secmondsInSpace / minute //перевод секунд в минуты
    val inSpaceMinute = inSpaceHour % hour // время полёта в минутах
    val inSpaceSeconds = inSpaceMinute / oneSeconds // время полёта в секундах

    println(String.format("%02d:%02d", inSpaceMinute, inSpaceSeconds,))

}