
fun printFilteredString(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true){
            println(it)
        }
    }
}

fun getPrintPredicate(): (String) -> Boolean {
    return {it.startsWith("K")}
}

fun main() {
    val list = listOf("Kotlin", "Java" , "C++", "JavaScript")
    printFilteredString(list) {
        it.startsWith("J")
    }
    printFilteredString(list, null)
    printFilteredString(list, getPrintPredicate())
}
