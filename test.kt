fun main(args: Array<String>) {
    val resultArray = createArray(5,5)
    printArray(resultArray)
}

fun createArray(row:Int, col:Int): Array<Array<Int>>{
    val newArray = Array(row,{Array(col,{i->0})})

    var rowValue = 0
    for (x in 0..row -1){
        for(y in 0..col -1){
            rowValue += 1
            newArray[x][y] = rowValue
        }
    }
    return newArray
}

fun printArray(arr: Array<Array<Int>>){
    for(x in 0..arr.size - 1){
        for(y in 0..arr[x].size -1){
            print("${arr[x][y] }")
        }
        println()
    }
}