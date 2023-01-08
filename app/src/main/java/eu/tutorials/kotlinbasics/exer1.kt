package eu.tutorials.kotlinbasics

class MobilePhones(osName: String, brand: String, model: String){
    private var battery: Int = 35
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(charge: Int){
        println("The battery is now: ${battery+charge}")
    }
}

fun main(){
    var samsung = MobilePhones(osName = "Android", brand = "samsung", model = "S22")
    samsung.chargeBattery(charge = 25)
}