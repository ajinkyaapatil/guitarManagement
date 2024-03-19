import org.example.Enums.Builder
import org.example.Enums.Type
import org.example.Enums.Wood
import org.example.Guitar
import org.example.GuitarInventory
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarInventoryTest {
    @Test
    fun `Inventory has all the Guitars List`(){
        val guitar = Guitar(1, 100, Builder.FENDER, "New", Type.ELECTRIC, Wood.CEDAR, Wood.ALDER)

        val guitarInventory = GuitarInventory()

        guitarInventory.add(guitar)

        assertEquals(1, guitarInventory.guitars[0].serialNumber)

    }
}