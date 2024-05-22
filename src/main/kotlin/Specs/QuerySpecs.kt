package org.example.Specs

import org.example.Enums.Builder
import org.example.Enums.Style
import org.example.Enums.Type
import org.example.Enums.Wood
import org.example.InstrumentSpecs

class QuerySpecs(
    val builder: Builder? = null,
    val model: String? = null,
    val type: Type? = null,
    val backWood: Wood? = null,
    val topWood: Wood? = null,
    val numString: Int? = null,
    val style : Style? = null
) {

    fun match(instrumentSpecs: InstrumentSpecs) : Boolean{
        if(numString == null) return true
        return when {
            instrumentSpecs.builder != builder -> false
            (instrumentSpecs).numString != numString -> false
            else -> true
        }
    }
}