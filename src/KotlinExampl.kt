class NamePrinter(val firstName:String, val lastName:String){
    val resultName : String by lazy {  firstName.filter { it.isUpperCase() } + lastName.filter { it.isUpperCase() }}

    fun printName(){
        println("hello value is $hello")
        hello = "Shiva"
        println("hello value after set $hello")

    }

    var hello: String = "Default Value"
        get() {
            return "Hello World".filter { it.isUpperCase() }
        }
        set(value) {
            field = "set value is $value"
        }


}

fun main(){
    val namePrinter = NamePrinter("Shivakumar","Burugu")
    namePrinter.printName()
}

