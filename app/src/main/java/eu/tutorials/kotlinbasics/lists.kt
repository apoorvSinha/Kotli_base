package eu.tutorials.kotlinbasics

fun main(){

    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 4, true, false, "string")
//    print(anyTypes.size)
//    print(months[1])
    for (month in months){
        println(month)
    }
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June", "July")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("August")
    println(additionalMonths)


    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thurs")
    days[1] = "Mangal"
    days.removeAt(2)
    print(days)

    val removeList = mutableListOf<String>("Mon", "Wed")
    days.removeAll(removeList)
    print(days)

}