package lession_2
fun main() {
    val staff = 50
    val interns = 30
    val employeeSalary = 30000
    val internsSalary = 20000
    val salaryForEmployees = staff * employeeSalary
    val salaryForInterns = interns * internsSalary + salaryForEmployees
    val averageSalary =  salaryForInterns / staff + interns

    println(salaryForEmployees)
    println(salaryForInterns)
    println(averageSalary)
}