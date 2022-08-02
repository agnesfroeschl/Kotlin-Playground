import main.kotlin.Person

fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main() {
    val interesstingThings = arrayOf("Kotlin","Programming","Comic Books")
    //sayHello(greeting = "Hi", itemsToGreet = interesstingThings)

    var person = Person()
    person.printInfo()
}
