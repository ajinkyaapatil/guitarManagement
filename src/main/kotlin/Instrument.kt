package org.example

import org.example.Enums.InstrumentType

class Instrument(
        val serialNumber: Int,
        val price: Double,
        val specs: InstrumentSpecs,
        val instrumentType: InstrumentType
) {
    //    fun match(matchSpecs : InstrumentSpecs) = specs.match(matchSpecs)
}
