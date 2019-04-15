fun main(args: Array<String>) {
    var s8 : String? = "코틀린을 배우자"
    println(s8?.substring(5)?.length)

    if(s8 != null){
        val b: String? = s8.substring(5)
        if( b != null){
            println(b.length)
        }
    }

    val s9 = s8?.length ?: 0
    println("s9 : $s9")
}