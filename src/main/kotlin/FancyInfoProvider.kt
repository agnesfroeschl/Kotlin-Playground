package main.kotlin

class FancyInfoProvider : BasicInfoProvider() {
    override val providerInfo: String
        get() = "FancyInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info")
    }

    override val sessionIdPrefix: String
        get() = "Fancy Session"
}
