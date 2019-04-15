fun main(args: Array<String>) {
    val obj1 = Score(100, 200)
    val obj2 = Score(300, 400)
    println("obj1 : $obj1")
    println("obj2 : $obj2")
    println("obj1 + obj2 : ${obj1 + obj2}")
    println("obj1 * obj2 : ${obj1 * obj2}")
}

data class Score(val a: Int, val b: Int){
    operator fun plus(other: Score) : Score{
        println(other)
        return Score(a + other.a, b+other.b)
    }
}

operator fun Score.times(other : Score) : Score{
    return Score(a*other.a, b*other.b)
}