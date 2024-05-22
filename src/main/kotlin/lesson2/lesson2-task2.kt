package lesson2

fun main(){
    val numberOfEmployees = 50
    val salaryOfEmployees = 30000
    val numberOfInterns = 30
    val salaryOfInterns = 20000
    val theWageFundEmployees = numberOfEmployees * salaryOfEmployees
    val theWageFundInterns = numberOfInterns * salaryOfInterns
    val theGeneralSalaryFund = theWageFundInterns + theWageFundEmployees
    val totalNumberOfEmployees = numberOfEmployees + numberOfInterns
    val averageSalary = theGeneralSalaryFund/totalNumberOfEmployees


    println(theWageFundEmployees)
    println(theGeneralSalaryFund)
    println(averageSalary)
}