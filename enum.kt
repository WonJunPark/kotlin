fun main(args: Array<String>) {
    println(FriendType.SCHOOL)
    println(FriendType.SCHOOL.ordinal)
    println(FriendType.COMPANY.ordinal)
    println(FriendType.COMPANY.name)
    println(FriendType.valueOf("COMPANY"))

    val friends = FriendType.values()
    for (item in friends){
        println(item)
    }

    println(getFriendTypeName(FriendType.SCHOOL))
}

enum class FriendType{
    SCHOOL, COMPANY, SNS, OTHERS
}

fun getFriendTypeName(friend:FriendType) =
        when(friend){
            FriendType.SCHOOL -> "학교 친구"
            FriendType.COMPANY -> "회사 친구"
            FriendType.SNS -> "SNS 친구"
            FriendType.OTHERS -> "기타 친구"
        }
