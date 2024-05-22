package org.example

class Inventory (private val storage: Storage) {

    fun addInstrument(instrument: Instrument) =
        storage.addInstrument(instrument)

//    fun search(instrumentSpecs: InstrumentSpecs) =
//        storage.searchByInstrumentSpecs(instrumentSpecs)
//
//    fun get(serialNumber: Int) =
//        storage.getInstrumentByID(serialNumber)

}
