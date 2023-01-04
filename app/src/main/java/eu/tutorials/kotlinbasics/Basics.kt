package eu.tutorials.kotlinbasics

fun main() {
    // immutable variables

    //TODO: Add new functionality

    /*
    Multi lines comments
     */

    //type variables

    var myName = "Apoorv Sinha"
    //int 32 bits
    val myAge: Int = 31
    val myByte: Byte = 124
    val myLong: Long = 39_345_454_343
    var myDouble: Double = 3.1231231231323
    var myFloat: Float = 3.12f

    //type inference : auto detects type of variable
    var isSunny = true
    var myChar = 'A'
    var myChar1 = '$'

    var myf_name = myName[0]
    var myl_name = myName[myName.length - 1]

    isSunny = false
    myName = "Heidi"
    println("Hello $myName")
    println(isSunny)
    println(myf_name)
    println(myl_name)

    // Exercise
    var udemyCourseName: String = "Android Masterclass"

    val udemyFloats: Float = 13.37F

    val udemyDouble: Double = 3.14159265358979

    var udemyByte: Byte = 25

    var udemyShort: Short = 2020

    var udemyLong: Long = 18_881_234_567

    var udemyBool: Boolean = true

    var udemyChar: Char = 'a'


    // String interpolation
    println("Hey there just checking value of pi is ${udemyDouble+ 2} and that is not $udemyBool")

    // Arithmatic operators
    var result = 5 + 3 * 14.0/ 7 - 8
    println(result%3)


    val res: String
    res = "I will reassign later"
    res.contentEquals("")
    println(res)


    // Comparison operators
    val isEqual = 5!=3
    println("$isEqual is equal")

    var mynum = 5
    println(++mynum)

    //control flow
    val heightPerson1 = 170
    val heightPerson2 = 189
    if (heightPerson1> heightPerson2){
        println("$heightPerson1 is taller than $heightPerson2")
    }else if(heightPerson1 == heightPerson2){
        println("Both are equal")
    }
    else{
        println("not so tall due")
    }

    //when statement

    // Kotlin’s "when" expression is the replacement of the switch statement
    // from other languages like C, C++, and Java.
    // It is compact and more powerful than switch statements.
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall")
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    var month = 3
    when(month) {
        1,2,3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    val age =26
    when(age){
        // with the !in it's the same as saying not in ...
        !in 0..20  -> print("now you may drink in the US")
        in 18..20  -> print("now you may vote")
        16,17 -> print("you now may drive")
        else -> print("you're too young")
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    /*
    loops
     */


    //while
    var x1 = 1
    while(x1<10){
        println(x1)
        x1++
    }

    //do while
    var x2 = 9
    do{
        x2++
        println(x2)
    }while (x2<=15)

    //for
    for (num in 11..17){
        println("$num")
    }

    for (i in 1 until 10){
        print("$i")
    }
    println()
    for (i in 10 downTo 5 step 2){
        print("$i")
    }


    // exercise loops
    var num = 0
    do{
        num ++
    }while (num <= 90)
    println("It's over we have $num")


    //break loop
    for (i in 10 downTo 1){
        print("$i ")
        if (i== 5){
            break
        }
    }

    myFunc()
    print(addUp(3,5.0))

    //nullability
    var name: String? = "Dennis"
//    name = null
    println("length is ${name?.length}")
    println("name is ${name?.toLowerCase()}")
    name?.let { print("something")}

    //elvis operator
    val name1 = name ?: "Guest"
    println("Name is $name1")

    name!!.toLowerCase()
}

fun myFunc(){
    println()
    print("called from function")
}
fun addUp(a: Int, b: Double) : Double {
    return a+b
}