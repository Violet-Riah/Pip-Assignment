fun main(args: Array<String>) {
var x= totalSalary(7,1200)
    println(x)
    var w=totalSalary(9,8500)
    println(w)
    var z= totalSalary(8,700)
    println(z)

}
fun totalSalary(hoursWorked: Int, hourRate: Int) :Int {
    var totalSalary = hoursWorked * hourRate
    return totalSalary

}

