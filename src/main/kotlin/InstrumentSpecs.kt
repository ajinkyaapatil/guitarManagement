package org.example

import org.example.Enums.Builder
import org.example.Enums.Style
import org.example.Enums.Type
import org.example.Enums.Wood

interface InstrumentSpecs {
    val builder: Builder
    val model: String
    val type: Type
    val backWood: Wood
    val topWood: Wood
}

