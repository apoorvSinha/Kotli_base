package eu.tutorials.kotlinbasics

data class User(val id: Long, var name: String)
// data class cannot be abstract, Open, sealed, inner

fun main(){
    val user1 = User(1, "Dennis")

    val name = user1.name
    println(name)
    user1.name = "Michael"
    println(user1.name)

    val user2 = User(1, "Michael")
    println(user1 == user2)

    //change only one argument
    val updateUser = user1.copy(name = "Denis penuta")
    println("user details: $user1")
    println("user details are: $updateUser")

    //get components
    println(updateUser.component1())
    println(updateUser.component2())

    val (id, names) = updateUser
    println("id= $id and name= $names")
}