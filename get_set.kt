fun main(args: Array<String>) {
    val f1 = mf()
    f1.name
    f1.name = "홍길동"
}

class mf{
    var name : String = ""
    get(){
        println("name 속성의 게터 호출")
        if(field != "") return field
        else return "이름없음"
    }
    set (value) {
        field = value
        println("name 속성의 세터 호출 name = $field")
    }
}