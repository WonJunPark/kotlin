fun main(){
    printJavaClass(JavaClass("platform type test!!"))

    printJavaClass(JavaClass(null))
}

fun printJavaClass(jClass: JavaClass){
    println((jClass.platformVar ?:"It is Null!!").toUpperCase())
}