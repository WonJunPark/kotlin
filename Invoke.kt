fun main(args: Array<String>) {
    val obj1 = Person("홍길동")
    obj1("010-1234-1234","dnjswns2280@naver.com")
}

class Person(val name: String){
    operator fun invoke(phone: String, email:String){
    println(" name: $name\n phone: $phone\n email: $email")
    }
}