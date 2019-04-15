fun <T> newList(vararg ts:T):ArrayList<T>{
    val result = ArrayList<T>()
    for (t in ts){
        result.add(t)
    }
    return result
}

fun main(args: Array<String>) {
    val list1 = newList<Int>(1,2,3,4,5)
    println("list1 : $list1")

    val list2 = newList<String>("코틀린","자바","스위프트","오브젝트-C")
    println("list2 : $list2")
}