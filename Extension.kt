fun main(args: Array<String>) {
    val str = "Hello, Kotlin"
    println(str.lastString())
}

fun String.lastString() : String{
    println(this)
    return this.get(this.length-1).toString()
}