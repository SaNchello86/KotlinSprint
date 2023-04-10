package lession_2
fun main() {
    val staff = 70
    val interns = 30
    val salaryOfEmployees = 30000
    val salaryOfInterns = 20000
    val salaryForEmployees = staff * salaryOfEmployees
    val salaryForInterns = interns * salaryOfInterns + salaryForEmployees
    val averageSalary =  salaryForInterns / staff + interns

    println(salaryForEmployees)
    println(salaryForInterns)
    println(averageSalary)

}