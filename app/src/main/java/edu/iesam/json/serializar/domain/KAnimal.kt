package edu.iesam.json.serializar.domain

import kotlinx.serialization.Serializable


@Serializable
data class KAnimal(val id: String, val name: String, val dog: KDog, val owner: KOwner)

@Serializable
data class KDog(val chip: String)

@Serializable
data class KOwner(val id: String, val name: String, val address: KAddress)

@Serializable
data class KAddress(val number: String, val name: String, val zipCode: String)
