

fun main(args:Array<String>){
    //這裡是將資料轉換成Array
    val array= intArrayOf(13,4,5,6,7,8,2,1)

    /*
    for (index:Int in 2..4){
        println(array[index])
    }

    for (value in array){
        println(value)
    }
    */

    array.filter{it>=5}//值大於5
            .sortedBy { it }
            .forEach{ println("$it")}
    /*
    //使用Index來巡覽
    for (i in array.indices){
        println("index:$i, value:${array[i]}")
    }
    */

    //使用WithIndex
    for((i,v) in array.withIndex()){
        println("index:$i, value:${v}")
    }

}