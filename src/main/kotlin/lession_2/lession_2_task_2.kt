package lession_2
fun main() {
    var staff = 70
    var interns = 30
    var salaryOfEmployees = 30000
    var salaryOfInterns = 20000
    val salaryForEmployees = staff * salaryOfEmployees
    val salaryForInterns = interns * salaryOfInterns + salaryForEmployees
    val averageSalary =  salaryForInterns / staff + interns

    println(salaryForEmployees)
    println(salaryForInterns)
    println(averageSalary)
}