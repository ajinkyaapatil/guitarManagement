package org.example

class GuitarInventory {

    val guitars: MutableList<Guitar> = mutableListOf()

    fun add(guitar: Guitar) =
        guitars.add(guitar)

    fun search(guitarSpecs: GuitarSpecs) =
        guitars.filter { it.specs == guitarSpecs }

    fun find(serialNumber: Int) =
        guitars.first{ it.serialNumber == serialNumber }

}
