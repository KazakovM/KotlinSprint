package lesson_2

fun main() {
    val numberOfStaff: Int = 50
    val salaryOfStaff: Int = 30000
    val numberOfInterns: Int = 30
    val salaryOfInterns: Int = 20000
    val totalSalaryOfStaff: Int = numberOfStaff * salaryOfStaff
    val totalSalary: Int = totalSalaryOfStaff + numberOfInterns * salaryOfInterns
    val averageSalary: Int = totalSalary / (numberOfInterns + numberOfStaff)
    println(totalSalaryOfStaff)
    println(totalSalary)
    println(averageSalary)
}
