class Friend3 constructor(_name : String){
    var name : String = _name
    var tel : String = ""
    var type : Int = 0

    constructor(_name : String, _tel:String) : this(_name){
        this.tel = _tel
    }

    constructor(_name : String, _tel:String, _type:Int):this(_name){
        this.tel = _tel
        this.type = _type
    }
}