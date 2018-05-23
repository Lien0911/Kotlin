package ASI.User

/*class MyData(val name:String,val description:String){
    constructor(name:String):this(name,""){

    }
}
*/

/*
class MyData(val name:String,val description:String="super man"){

}
*/

/* 建立了一個Private 建構式，看起來沒甚麼用，因為沒辦法使用靜態方法
class MyData private constructor(){

    fun GetMyData():MyData{
        return MyData()
    }

}
*/

/*
class House(type:String,price:Double,yearBuilt:Int,Owner:String){

    var type:String?=null
    var price:Double?=null
    var yearBuilt:Int?=null
    var owner:String?=null

    init {
        this.type=type
        this.price=price
        this.yearBuilt=yearBuilt
        this.owner=owner
    }
}

class House2(val type:String,val price:Double,val yearBuilt:Int,var Owner:String){

}
*/

/* 自訂義一些唯讀的屬性
class MyData(name:String,description:String){
    val Name=name
    val Description=description
}
*/

/* 在Java的世界裡，所有的Class都是Final
open class MyData(name:String,description:String){
    val Name=name
    val Description=description
}

class MyData1(name:String,description:String):MyData(name,description){

}
*/

/* 繼承1
open class MyData(val name:String,val description:String){
 open fun GetInfo():String {
     return "My name is ${name},and my position is ${description}"
 }
}

open class MyData2:MyData{
    constructor(name:String):super(name,"Worker")

    final override fun GetInfo(): String {
        return "Happy Friday"
    }
}

class MyData3:MyData2{
    constructor(name:String):super(name)

}

fun main(args:Array<String>){
    var mydata=MyData3("John Lien")
    println(mydata.GetInfo())
}
*/

/* 使用Abstract Class 與 Abstract Method
abstract class MyBase(var name:String,val description:String){
    abstract fun GetInfo():String
}

class MyInstance()
    :MyBase("John Lien","worker"){

    override fun GetInfo():String {
        return "$name, $description"
    }
}

fun main(args:Array<String>){
    var mydata=MyInstance()
    println(mydata.GetInfo())
}
*/

/* 使用靜態方法
   得使用Companion 方式定義靜態方法
class UserUtil{
    companion object {
        fun GetUserName(name:String):String{
            return "My name is $name"
        }
    }
}

fun main(args:Array<String>){
    println(UserUtil.GetUserName("John Lien"))
}
 */

/* 定義屬性1
class MyData(val Name:String,val Description:String){
    private var _address:String=""
    private var Address:String
        get(){
            return _address
        }
        set(value){
            _address=value
        }

    init {
        if(Name=="")
            println("必須要有值")
        if(Description=="")
            println("必須要有值")
    }
}

fun main(args:Array<String>){
    var mydata=MyData("John Lien","IT Engineer")
    mydata.Address="lenchen@gmail.com"
*/

/*
定義屬性2
class MyProfile{

    var Name:String=""
    get() {
        return field
    }
    set(value) {
        field=value
    }

    var Description:String=""
        get() {
            return field
        }
        set(value) {
            field=value
        }

}

fun main(args:Array<String>){
    var myprofile=MyProfile()
    myprofile.Name="John Lien"
    myprofile.Description="Worker"
}
*/

/* 定義 Interface
interface IMyProfile{
    var Name:String
    var Description:String
    fun GetMyProfile:String()
}

class MyProfile:IMyProfile{
    //敘述
    override var Description: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}
    //名稱
    override var Name: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun GetMyProfile(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
*/

/* 擴充方法
class MyProfile(val name:String,val description:String){

}

fun MyProfile.Test(x:Int,y:Int):Int{
    return x+y
}

fun MyProfile.GetMyProfile():String{
    return "My name is ${this.name}, my position is ${this.description}"
}

fun main(args:Array<String>){
       var myprofile=MyProfile("John Lien",description = "Worker")
    var value=myprofile.Test(10,12)
    println(value)
    println(myprofile.GetMyProfile())
}
*/

/*
 使用Package，類似像是namespace
class MyProfile(val Name:String,val Description:String){
    fun GetMyProfile():String{
        return "My name is $Name, and my position is $Description"
    }
}
*/

data class MyData(var name:String,var description:String){
    var age:Int=0 //比較時，這裡加入的屬性不會納入判斷是否相等
}

fun main(args:Array<String>){
    var data1=MyData("John Line",description = "worker")
    var data2=MyData("John Line",description = "worker")
    var data3=data2.copy(description = "Engineer") //複製的用意在於，某些資料只有部分屬性被修改
    data1.age=18
    data2.age=19

    if(data1.equals(data2))
    {
        //var data1=MyData("John Line",description = "worker")
        //var data2=MyData("John Line",description = "worker")
        println("兩筆資料相同!")
    }
    else
    {
        //var data1=MyData("John Line",description = "worker")
        //var data2=MyData("John Line",description = "Engineer")
        println("兩筆資料不相同!")
    }

}












