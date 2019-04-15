fun main(args: Array<String>) {
    println(cal(45,6))
}

fun cal(whole :Int, selected: Int):Double{
    fun cal1(num:Int):Double{
        var total : Double = 1.0
        for(i in num downTo 1){
            total *= i
        }
        return total
    }
    if ((selected > whole)||(selected<=0)||(whole<=0)){
        return -1.0
    }else if(selected == whole){
        return 1.0
    }
    return cal1(whole)/(cal1(whole-selected)*cal1(selected))
}