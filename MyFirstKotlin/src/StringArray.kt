fun main(args:Array<String>){
    //這裡在使用String Array，很不大熟，所以錯了很多次
    val names:Array<String?> = arrayOfNulls<String>(5)
    for (i:Int in 0..4){
        names[i]="John Line${i+1}"
    }

    //使用Foreach的方式巡覽
    names.forEach { println("$it") }

}