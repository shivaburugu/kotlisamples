fun main(){
    println("call getName ${getName()}")
}

fun getName():String{

    val flag = false

    if(flag){
        return "Shivakumar Burugu"
    } else {
        TODO("OMG flag is false how did it happen")
    }
}