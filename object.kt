fun main(args: Array<String>) {
    for (i in 1..10){
        StateManager.msgNumber += 1
        StateManager.msgContent = StateManager.msgNumber.toString() + "번째 메시지"
        StateManager.storeMessage()
    }
}

object StateManager{
    var msgNumber: Int = 0
    var msgContent: String = ""

    fun storeMessage(){
        println("메시지 번호 = $msgNumber, 내용 = $msgContent")
    }
}