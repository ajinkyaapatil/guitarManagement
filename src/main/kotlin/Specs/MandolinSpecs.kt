package org.example.Specs

import org.example.Enums.Builder
import org.example.Enums.Style
import org.example.Enums.Type
import org.example.Enums.Wood
import org.example.InstrumentSpecs

class MandolinSpecs(
    override val builder: Builder,
    override val model: String,
    override val type: Type,
    override val backWood: Wood,
    override val topWood: Wood,
    private val style: Style,
) : InstrumentSpecs {

    fun match(querySpecs: QuerySpecs): Boolean {
        return when {
            querySpecs.builder != builder -> false
            querySpecs.style != style -> false
            querySpecs.model != model -> false
            querySpecs.type != type -> false
            querySpecs.backWood != backWood -> false
            querySpecs.topWood != topWood -> false
            else -> true
        }
    }
}