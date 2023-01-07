package eu.tutorials.kotlinbasics

var b = 5
fun main() {
    var denis = Person("Denis", "Yu", age = 31)
    var karl = Person()
    var raj = Person(lastName = "peterson")
//
//    var samsung = MobilePhone(osName = "Android", brand = "Samsung", model = "S22")
//    var fos = MobilePhone()
//    myFunction(5)
//    b = 7
//    println("b is $b")

    denis.hobby = "to skateboard"
    karl.hobby = "To run"
    denis.stateHobby()
    karl.stateHobby()
    denis.age = 35
    println("dennis is ${denis.age} years old")

}

class Person (firstName: String = "John", lastName: String = "Doe") {

    // Member variable - Properties
    var age : Int? = null
    lateinit var hobby : String
    var firstName: String? = null

    // Initializer block
    init {
        this.firstName= firstName
        println("This act as constructor initialized with fName $firstName and lName $lastName")
    }

    // member secondary constructor -  is this constructor overloading? doesn't looks like
    constructor(firstName: String, lastName: String, age: Int ) : this(firstName, lastName){
        this.age = age
    }

    //Member functions - methods
    fun stateHobby(){
        println("$firstName hobby is $hobby")
    }

}

class MobilePhone(osName: String = "FireOs", brand: String = "Amazon", model: String = "Fire HD 11"){
    init {
        println("we have a $model from $brand with $osName OS")
    }
}

fun myFunction(a: Int){
    // a is a variable
//    a= 6
    var b = 6
    println("a is $a")

}