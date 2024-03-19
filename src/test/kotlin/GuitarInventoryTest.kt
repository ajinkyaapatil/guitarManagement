import org.example.Enums.Builder
import org.example.Enums.Type
import org.example.Enums.Wood
import org.example.Guitar
import org.example.GuitarInventory
import org.example.GuitarSpecs
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarInventoryTest {
    @Test
    fun `Inventory has all the list of Guitars`(){

        val guitarspecs = GuitarSpecs(Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER)
        val guitar = Guitar(1, 100, "New", guitarspecs)

        val guitarInventory = GuitarInventory()
        guitarInventory.add(guitar)

        assertEquals(1, guitarInventory.guitars[0].serialNumber)

    }

    @Test
    fun `filtering guitars as per specs gives list of matching guitars`(){
        val guitarSpecs = GuitarSpecs(Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER)
        val guitar = Guitar(1, 100, "New", guitarSpecs)
        val guitarInventory = GuitarInventory()
        guitarInventory.add(guitar)


        val requiredSpecs = GuitarSpecs(Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER)
        val guitars = guitarInventory.search(requiredSpecs)

        assertEquals(1, guitars[0].serialNumber)
    }
}