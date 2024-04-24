import org.example.*
import org.example.Enums.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class InventoryTest {

    private lateinit var inventory : Inventory
    private lateinit var properties : MutableMap<String, Any>
    @BeforeEach
    fun setup(){
        inventory = Inventory()
        properties =  mutableMapOf(
            "instrumentType" to InstrumentType.GUITAR,
            "builder" to Builder.RYAN,
            "model" to "M1",
            "type" to Type.ACOUSTIC,
            "backWood" to Wood.ALDER,
            "topWood" to Wood.CEDAR,
            "numString" to 4,
            "style" to Style.F
        )
    }

    @Test
    fun `should add an instrument to the instruments list when adding an instruments`(){
        val specs = InstrumentSpecs(properties)

        inventory.addInstrument(1, 1000.0, specs)

        val actualInstrumentList = inventory.search(specs)

        assertEquals(1, actualInstrumentList.size)
    }
    @Test
    fun `should return a list of instruments when provided with specs`() {

        val specs = InstrumentSpecs(properties)

        inventory.addInstrument(1, 1000.0, specs)

        val actualInstrumentList = inventory.search(specs)

        assertEquals(1, actualInstrumentList[0].serialNumber)
        assertEquals(1000.0, actualInstrumentList[0].price)
        assertEquals(specs, actualInstrumentList[0].specs)
    }

    @Test
    fun `should return an instrument when provided with the serial Number`() {

        val specs = InstrumentSpecs(properties)

        inventory.addInstrument(1, 1000.0, specs)

        val actualInstrument = inventory.get(1)

        assertEquals(1, actualInstrument.serialNumber)
        assertEquals(1000.0, actualInstrument.price)
        assertEquals(specs, actualInstrument.specs)
    }


    @Test
    fun `should return an empty list when provided an unavailable instrument properties`() {

        val specs = InstrumentSpecs(properties)

        inventory.addInstrument(1, 1000.0, specs)

        val requiredProperties : MutableMap<String, Any> = mutableMapOf(
            "instrumentType" to InstrumentType.MANDOLIN,
        )

        val requiredSpecs = InstrumentSpecs(requiredProperties)

        val actualInstrumentList = inventory.search(requiredSpecs)

        assertEquals(0, actualInstrumentList.size)

    }

    @Test
    fun `should return a list of instruments when provided with less number of properties`(){
        val specs = InstrumentSpecs(properties)

        inventory.addInstrument(1, 1000.0, specs)

        val requiredProperties : MutableMap<String, Any> = mutableMapOf(
            "instrumentType" to InstrumentType.GUITAR,
        )

        val requiredSpecs = InstrumentSpecs(requiredProperties)

        val actualInstrumentList = inventory.search(requiredSpecs)

        assertEquals(1, actualInstrumentList.size)

    }



}