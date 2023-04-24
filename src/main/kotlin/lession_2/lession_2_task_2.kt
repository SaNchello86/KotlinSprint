package lession_2
fun main() {
    val staff = 70
    val interns = 30
    val salaryOfEmployees = 30000
    val salaryOfInterns = 20000
    val salaryForEmployees = staff * salaryOfEmployees // Зарплата сотрудников
    val salaryForInterns = interns * salaryOfInterns // Зарплата интернов
    val salaryForAll = salaryForEmployees + salaryForInterns // Общая зарплата
    val salaryAverage = salaryForAll / staff + interns // Средняя зарплата сотрудника

    println(salaryForEmployees)
    println(salaryForAll)
    println(salaryAverage)

}