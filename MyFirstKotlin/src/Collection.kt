import java.awt.List

fun main(args:Array<String>){
    //集合有三種: List,Set,Map
    //然後有分可變與不可辨兩種

    /*  List使用

    若是使用listOf 則無法新增欄位值
    若是使用mutableListOf 可以隨意新增刪除修改
    //無法定義型別??? var myList:Array<String>會出錯
    var myList=listOf("value1","value2","value3")
    //myList[0]="value3" 會出錯
    println(myList[0])

    var mutableList= mutableListOf<String>("value1","value2","value3")
    //可以新增
    mutableList.add("value4")
    println(mutableList[3])
    mutableList.removeAt(0)
    println(mutableList[0])

    */

    /*  Set 使用
    var setValues= setOf<String>("value1","value2","value3")
    var setmutableValues= mutableSetOf<String>("m1","m2","m3")
    setmutableValues.add("m4")
    //可以做快照 (無法更動的集合)
    setValues=setmutableValues
    */

    /* List 與 Set的擴充方法
    val items= listOf<Int>(1,2,3,4,5,6)
    println(items.first())
    println(items.last())
    println(items.lastIndexOf(5))
    println(items.filter { it%2==0 })

    var rwList= mutableListOf<Int>(2,5,8)
    var list=rwList.requireNoNulls()
    for (item in list)
        println(item)
    if(list.none { it>10 })
        println("沒有值超過10")
    */










}

class Controller{
    private val _items= mutableListOf<String>()

    //定義一個不可變的集合，需要變動的部分由_items控制
    //toList() 只是複製一個集合
    val items get()=_items.toList()
}