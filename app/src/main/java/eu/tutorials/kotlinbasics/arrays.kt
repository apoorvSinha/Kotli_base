package eu.tutorials.kotlinbasics


// arrays


fun main() {
//    val numbers: IntArray = intArrayOf(1, 2,3 ,4, 5, 6)

//    val numbers = intArrayOf(1, 2,3 ,4, 5, 6)

    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
//    print(numbers.contentToString())
//    for (element in numbers) {
//        print("${element + 2}")
//    }

//    print(numbers[1])
    numbers[0] = 8
    for(elem in numbers){
        print(elem)
    }

    val fruits = arrayOf(Fruit("apple", 2.0), Fruit("orange", 3.0))
    print(fruits.contentToString())

    for(index in fruits.indices){
        print("${fruits[index].name} is in index $index")
    }

    val  mix = arrayOf("sunday", "monday", 1 , 4.5, Fruit("banana", 1.8))
    println(mix.contentToString())
}

data class Fruit(val name: String, val price: Double)