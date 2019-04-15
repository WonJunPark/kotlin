fun main(args: Array<String>) {
    var car2 = Car2()
    println(car2.getBrandName().getPrice())
}

class Car2{
    fun getPrice() : Int{
        return 100
    }
}

fun Car2.getBrandName() : Car2{
    println("BMW")
    return this
}