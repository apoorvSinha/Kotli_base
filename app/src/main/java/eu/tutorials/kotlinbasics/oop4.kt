package eu.tutorials.kotlinbasics

// inheritance, interface & Polymorphism


// by default classes are final
//super class

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){            // in java body not allowed
        println("The drivable is banking!")
    }
}


open class Caar(val name: String, val brand: String, override val maxSpeed: Double) : Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance Kilometers")
    }

    override fun drive(): String = "Driving the interface driver"

}

//sub class of car
class ElectricCar(name: String, brand: String, batteryLife: Double, maxSpeed: Double) :
    Caar(name, brand, maxSpeed) {
    override var range = batteryLife * 5
    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String{
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }

}

// any class inherits from the any class, every kotlin class has a superclass Any

fun main(){
    var audiA3 = Caar("A3", "Audi", 344.0)
    var tesla_x = ElectricCar("Model -X", "Tesla", 285.6, 363.0)

    tesla_x.drive()
    tesla_x.brake()
    audiA3.brake()
    // polymorphism
    audiA3.drive(200.0)
    tesla_x.drive(200.0)


    tesla_x.extendRange(25.0)

}
