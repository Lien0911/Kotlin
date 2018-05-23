import ASI.User.MyData

fun main(args:Array<String>){
    var data1=MyData("John Line",description = "worker")
    var data2=MyData("John Line",description = "worker")

    if(data1.equals(data2))
    {
        println("兩筆資料相同!")
    }
    else
    {
        println("兩筆資料不相同!")
    }

}