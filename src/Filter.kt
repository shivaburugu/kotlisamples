fun main(){

    val integerArray = arrayOf(1,3, 5,6, -234, - 24, -3,5,2,51,25,5,36,3)

    //filter
    //sort
    //last
    //sortBy

    data class Person(val name:String, val age:Int)

    val personsArray = arrayOf(Person("Tom",20),
                        Person("Dave",23),
                        Person("Kate",15),
                        Person("Alice",45),
                        Person("Davide",32),
                        Person("Alan",23),
                        Person("Aaron",20),
                        Person("Sean",45)
    )

    personsArray.sortBy { it.name }
    personsArray.forEach { println("$it") }

}