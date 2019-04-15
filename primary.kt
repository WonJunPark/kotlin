fun main(args: Array<String>) {
    var obj1 = Friend2("홍길동")
    println(obj1.name)
}

class Friend2 constructor(name1:String){
    val name : String
    init{
        this.name = name1
    }
}