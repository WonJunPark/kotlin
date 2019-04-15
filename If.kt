fun main(args: Array<String>) {
    var x = 100
    if (x==100){
        println("x=$x")
    }
    else{
        println("x는 100이 아님")
    }

    var msg: String
    if (x==100) msg="x=100"
    else msg = "x는 100이 아님"
    println(msg)

    var msg2 = if(x==100) "x=100" else "x는 100이 아님"
    println(msg2)

    println(if(x==100) "x=100" else "x는 100이 아님")
}