fun main(args: Array<String>) {
    var x = 3

    when (x) {
        in 1..3 -> {
            println("x == 1 or 2 or 3")
        }
        in 4..6 -> {
            println("x==4 or 5 or 6")
        }
        !in 1..6 -> {
            println("x==!(1,2,3,4,5,6")
        }
    }

    var x2 = f1(1)
    var x3 = f1(2)
    println("x2 : $x2")
    println("x3 : $x3")

    var x4 = f1(3)
    var x5 = f1(5)
    println("x4 : $x4")
    println("x5 : $x5")
}

fun f1(b1: Int): Int = when(b1){
    1->{
        100
    }
    2->{
        200
    }
    3->{
        300
    }
    else->{
        100+200+300
    }
}