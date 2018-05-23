package JohnLien.Classes.User

import java.text.FieldPosition


open class UserInfo(val name:String,val position: String){
    fun GetInfo():String{
        return "My name is $name, and position is $position"
    }

}

class UserInfo1(name:String,position: String):UserInfo(name,position){
    fun GetInfoFromUser1():String{
        return "${GetInfo()}-from UserInfo1"
    }

}

class UserInfo2(name:String,position: String):UserInfo(name,position){

    fun GetInfoFromUser2():String{
        return "${GetInfo()}-from UserInfo2"
    }

}