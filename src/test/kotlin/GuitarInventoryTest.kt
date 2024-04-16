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

        val guitarSpecs = GuitarSpecs(Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER)
        val guitar = Guitar(1, 100, "New", guitarSpecs)

        val guitarInventory = GuitarInventory()
        guitarInventory.add(guitar)

        val guitars = guitarInventory.guitars

        assertEquals(1, guitars[0].serialNumber)
    }

    @Test
    fun `should return a guitar when provided with the serial Number`(){
        val guitarSpecs = GuitarSpecs(Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER)
        val guitar = Guitar(1, 100, "New", guitarSpecs)

        val guitarInventory = GuitarInventory()
        guitarInventory.add(guitar)

        val fetchedGuitar = guitarInventory.find(1)

        assertEquals(1, fetchedGuitar.serialNumber)
    }

    @Test
    fun `should return list of guitars when provided a guitar specification`(){
        val guitarSpecs = GuitarSpecs(Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER)
        val guitar = Guitar(1, 100, "New", guitarSpecs)
        val guitarInventory = GuitarInventory()
        guitarInventory.add(guitar)


        val requiredSpecs = GuitarSpecs(Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER)

        val guitars = guitarInventory.search(requiredSpecs)

        assertEquals(1, guitars[0].serialNumber)
    }

    @Test
    fun `should return an empty list when provided a unavailable guitar specification`(){
        val guitarSpecs = GuitarSpecs(Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER)
        val guitar = Guitar(1, 100, "New", guitarSpecs)
        val guitarInventory = GuitarInventory()
        guitarInventory.add(guitar)


        val requiredSpecs = GuitarSpecs(Builder.FENDER, Type.ACOUSTIC, Wood.CEDAR, Wood.ALDER)

        val guitars = guitarInventory.search(requiredSpecs)

        assertEquals(0, guitars.size)
    }


}