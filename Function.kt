fun f1(){
    println("f1 함수 호출")
}

fun f2(a1 : Int, a2 : Double){
    println("f2호출")
    println("a1 : ${a1}")
    println("a2 : ${a2}")
}

fun f3(a1 : Int=0, a2:Double=0.0){
    println("f3 호출")
    println("a1 : ${a1}")
    println("s2 : ${a2}")
}

fun f4():Unit{
    println("f4 호출 (리턴값 없음)")
}

fun f5() : Int {
    println("f5 호출 (리턴값 반환)")

    return 100
}

fun f6(){
    println("f6 호출(매개변수 없음)")
}

fun f6(a1:Int){
    println("f6 호출(매개변수 1개) : ${a1}")
}

fun f6(a1:Double){
    println("f6 호출(매개변수 1개, 데이터 타입이 다름) : ${a1}")
}

fun f6(a1:Int, a2:Int){
    println("f6 호출(매개변수 2개) : ${a1}, ${a2}")
}

fun f7(){
    fun f8(){
        println("f8 호출")
    }

    println("f7 호출")
    f8()
}

fun main(args: Array<String>) {
    f1()
    f2(100,200.00)
    f3(a2=123.12, a1=20000)

    f4()
    var rvl = f5()
    println("리턴값 rvl : ${rvl}")

    f6()
    f6(100)
    f6(100.12)
    f6(100, 200)
    f7()
}
