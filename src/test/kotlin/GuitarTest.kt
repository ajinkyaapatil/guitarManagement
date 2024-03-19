import org.example.Enums.Builder
import org.example.Enums.Type
import org.example.Enums.Wood
import org.example.Guitar
import org.example.GuitarSpecs
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarTest {

    @Test
    fun `Guitar is created when given basic Input`(){

        val guitarspecs = GuitarSpecs(Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER)

        val guitar = Guitar(
            1,
            100,
            "New",
            guitarspecs
        )

        assertEquals(1, guitar.serialNumber)
        assertEquals(100, guitar.price)
        assertEquals(guitarspecs.type, guitar.specs.type)
        assertEquals("New", guitar.model)
    }
}