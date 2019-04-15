open class Father(var hairColor:String, var eyeColor:String)

class Child: Father{
    constructor(hairColor:String, eyeColor:String) : super(hairColor, eyeColor){
        this.haircolor = hairColor
        this.eyecolor = eyeColor
    }
}