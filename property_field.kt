fun main(args: Array<String>) {
    var result = MyCalcu(100,100)
    println(result)
}

class MyCalcu constructor(_p1:Int, _p2:Int){
    var p1: Int
    var p2: Int
    val sum:Int
    init{
        this.p1=_p1
        this.p2=_p2
        sum = p1+p2
    }
}