fun main() {
    val list = listOf("Kotlin", "Java" , "C++", "JavaScript", "C", "C#", null, null)

    list
        .filterNotNull()
       /* .filter {
            it.startsWith("C")
        }*/
      //  .take(2)
       /* .map {
            it.length
        }*/
        .associate { it to it.length }
        .forEach {
            println("${it.value}, ${it.key}")
        }

    val language = list.filterNotNull().last();
    println("the last language is $language")

    val language2 = list.filterNotNull().find { it.startsWith("foo") }.orEmpty();
    println("the fist language that starts with 'foo' is $language2")
}
