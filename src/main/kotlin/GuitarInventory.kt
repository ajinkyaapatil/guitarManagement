package org.example

class GuitarInventory {

    val guitars: MutableList<Guitar> = mutableListOf()

    fun add(guitar: Guitar) {
        guitars.add(guitar)
    }
}
