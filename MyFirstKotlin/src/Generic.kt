class Box<T>(t:T){
    var myValue=t

    fun <T> GetMyValue(value:T):T{
        return value
    }
}

fun main(args:Array<String>){
    var box=Box("Ya!")
    println(box.myValue)
    var box2=Box(10)
    println(box2.myValue)
}