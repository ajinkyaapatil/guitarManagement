package org.example

class GuitarInventory {

    val guitars: MutableList<Guitar> = mutableListOf()

    fun add(guitar: Guitar) {
        guitars.add(guitar)
    }

    fun search(guitarSpecs: GuitarSpecs): List<Guitar> {
        return guitars.filter { it.specs.equals(guitarSpecs) }
    }
}
