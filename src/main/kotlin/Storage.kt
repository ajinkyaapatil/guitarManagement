package org.example

class Storage() {
    private val instrumentList: MutableList<Instrument> = mutableListOf()

    fun addInstrument(instrument: Instrument) = instrumentList.add(instrument)

    fun getInstrumentByID(serialNumber: Int) =
            instrumentList.first { it.serialNumber == serialNumber }

    //    fun searchByInstrumentSpecs(instrumentSpecs: InstrumentSpecs) =
    //        instrumentList.filter { it.match(instrumentSpecs) }
}
