package edu.iesam.json.serializar.domain

import android.util.Log
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json


@Serializable
data class KAnimal(val id: String, val name: String, val dog: KDog, val owner: KOwner)

@Serializable
data class KDog(val chip: String)

@Serializable
data class KOwner(val id: String, val name: String, val address: KAddress)

@Serializable
data class KAddress(val number: String, val name: String, val zipCode: String)


fun KMockData() {
    val animalAK = KAnimal(
        "1",
        "Tobi",
        KDog("0123123ABV"),
        KOwner("1", "Pepe", KAddress("2", "Sta. Teresa", "05001"))
    )

    val json = Json.encodeToString(animalAK)

    //TODO Añadir codigo de prueba

    Log.d(KAnimal::class.java.simpleName, json)

    val animalBK = Json.decodeFromString<KAnimal>(json)
}