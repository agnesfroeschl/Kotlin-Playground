package main.kotlin

import java.util.*

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create(type: EntityType): Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.getFormattedName()
            EntityType.HELP -> type.getFormattedName()
        }
        return when(type){
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity(){
    object Help: Entity(){
        val name = "Help"
    }
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
}

fun Entity.Medium.printInfo(){
    println("Medium class: $id")
}

val Entity.Medium.info: String
    get() = "some info"

fun main() {
    val entity0 = Entity.Easy("id", "name")
    val entity01 = entity0.copy()
    val entity1: Entity = EntityFactory.create(EntityType.EASY)
    val entity2: Entity = EntityFactory.create(EntityType.MEDIUM)
    if(entity2 is Entity.Medium){
        entity2.printInfo()
        entity2.info
    }
    // == ... data is compared (is the data of the objects the same) - equal
    // === ... reference is compared (is it the same object) - not equal
    if(entity0 === entity0){
        println("they are equal")
    } else {
        println("they are NOT equal")
    }


}

