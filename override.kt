open class Father(open var haircolor: String, open var eyecolor: String){
    open fun changehaircolor(haircolor: String){
        this.haircolor = haircolor
    }
}

class Child: Father{
    override var haircolor: String
    override var eyecolor: String
    var others: String

    constructor(haircolor: String, eyecolor: String, others: String): super (haircolor, eyecolor){
        this.haircolor = haircolor
        this.eyecolor = eyecolor
        this.others = others
    }

    override fun changehaircolor(haircolor: String) {
        super.changehaircolor(haircolor)
        this.haircolor = haircolor
    }

    fun printHairColor(){
        println("아이의 모발색은 %${this.haircolor}입니다.")}

    fun changeHairColorSuper(haircolor: String){
        super.haircolor=haircolor
        super.changehaircolor(haircolor)
    }

    fun printHairColorSuper(){
        println("아빠의 모발색은 %${super.haircolor}입니다.")
    }
}


fun main(args: Array<String>) {
    val c1 = Child("검정","검정","기타")
    c1.printHairColor()

    c1.changehaircolor("파랑")
    c1.printHairColor()

    c1.changeHairColorSuper("노랑")
    c1.printHairColorSuper()
}