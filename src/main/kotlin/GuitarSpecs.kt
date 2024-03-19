package org.example

import org.example.Enums.Builder
import org.example.Enums.Type
import org.example.Enums.Wood

class GuitarSpecs(
    private val builder: Builder,
    private val type: Type,
    private val backWood: Wood,
    private val topWood: Wood) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GuitarSpecs

        if (builder != other.builder) return false
        if (type != other.type) return false
        if (backWood != other.backWood) return false
        if (topWood != other.topWood) return false

        return true
    }

}
