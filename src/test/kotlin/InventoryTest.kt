import kotlin.test.assertEquals
import org.example.*
import org.example.Enums.*
import org.example.Specs.GuitarSpecs
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class InventoryTest {

    private lateinit var inventory: Inventory
    private lateinit var storage: Storage

    @BeforeEach
    fun setup() {
        storage = Storage()
        inventory = Inventory(storage)
    }

    @Test
    fun `should add an instrument to the instruments list when adding an instruments`() {

        val guitarSpecs =
                GuitarSpecs(Builder.FENDER, "123", Type.ACOUSTIC, Wood.CEDAR, Wood.ALDER, 4)

        val instrument = Instrument(1, 1000.0, guitarSpecs, InstrumentType.GUITAR)

        inventory.addInstrument(instrument)

        val expectedInstrument = storage.getInstrumentByID(1)

        assertEquals(instrument, expectedInstrument)
    }
}
