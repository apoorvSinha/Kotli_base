package eu.tutorials.kotlinbasics

import java.util.*

// getters and setters

fun main(){
    var myCar = Car()
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("My car max speed is ${myCar.maxSpeed}")
    myCar.owner
//    myCar.myModel = "M3"
    println("my card model is ${myCar.myModel}")
}

class Car {
    lateinit var owner: String
    val myBrand: String = "BMW"
        // customer getter
        get() {
            return field.toLowerCase()
        }
    var maxSpeed: Int = 250
//    This is auto generated when we initialize above var
        get() = field
        set(value){
            field = if(value>0) value else throw java.lang.IllegalArgumentException("max speed can't be less than 0")
        }

    var myModel: String = "MS"
        private set     // Will be able to set only through constructor

    init {
        this.myModel = "M3"
        this.owner = "Frank"
    }
}