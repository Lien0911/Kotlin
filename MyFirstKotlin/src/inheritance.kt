import JohnLien.Classes.User.*


fun main(args:Array<String>){
    val users:Array<UserInfo> = arrayOf(UserInfo("John","Worker1"),
            UserInfo1("John","Worker1"),
            UserInfo2("John","Worker1"))

    for (user in users){
        when(user){
            is UserInfo1->{
                //Smart Casts(當判斷成立之後，會自動幫忙轉型)
                println(user.GetInfo())
                println(user.GetInfoFromUser1())
            }
            is UserInfo2->{
                //Smart Casts(當判斷成立之後，會自動幫忙轉型)
                println(user.GetInfo())
                println(user.GetInfoFromUser2())
            }
            else-> println(user.GetInfo())
        }
        //println(user.GetInfo())
    }


}