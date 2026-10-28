package edu.iesam.json.gson.domain

import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlin.math.log

data class Animal(val id: String, val name: String, val dog: Dog, val owner: Owner)

data class Dog(val chip: String)

data class Owner(val id: String, val name: String, val address: Address)

data class Address(val number: String, val name: String, val zipCode: String)

fun mockData() {
    val animalA = Animal(
        "1",
        "Tobi",
        Dog("0123123ABV"),
        Owner("1", "Pepe", Address("2", "Sta. Teresa", "05001"))
    )

    val animalB = Animal(
        "2",
        "Kodak",
        Dog("170815SRN"),
        Owner("2", "Rafa", Address("41", "recoletos", "05270"))
    )

    // esto serializa una lista

    val animalList : List<Animal> = listOf(animalA,animalB)

    val collectionType: TypeToken<List<Animal>> =
        object : com.google.gson.reflect.TypeToken<List<Animal>>() {}

    val gson = Gson()

    val jsonL = gson.toJson(animalList)

    Log.d("Animal", jsonL)

    val animalCopy = Gson().fromJson(jsonL, collectionType)

    Log.d("Animal list", animalCopy.toString())


    //esto serializa un objeto

//    val json = gson.toJson(animalA)
//
//    Log.d("animal", json)


    // esto es para descerializar

//    val jsonD = gson.fromJson(json, Animal::class.java)
//
//    Log.d("AnimalD", jsonD.toString())
}