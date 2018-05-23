enum class Color01{
    LightGrey,Blue,Purple,Green,Orange,Red
}

fun main(args:Array<String>){
    /*
    val c01:Color01=Color01.Blue
    val c02:Color01=Color01.Green
    val c03:Color01=Color01.LightGrey
    */
    val c01:Color01=Color01.valueOf("Blue")
    val c02:Color01=Color01.valueOf("Green")
    val c03:Color01=Color01.valueOf("LightGrey")


    println("$c01,$c02,$c03")

}