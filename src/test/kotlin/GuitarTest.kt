import org.example.Enums.Builder
import org.example.Enums.Type
import org.example.Enums.Wood
import org.example.Guitar
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuitarTest {

    @Test
    fun `Guitar is created when given basic Input`(){
        val guitar = Guitar(
            1,
            100,
            Builder.FENDER,
            "New",
            Type.ELECTRIC,
            Wood.CEDAR,
            Wood.ALDER)

        assertEquals(1, guitar.serialNumber)
        assertEquals(100, guitar.price)
        assertEquals(Builder.FENDER, guitar.builder)
        assertEquals("New", guitar.model)
        assertEquals(Type.ELECTRIC, guitar.type)
    }
}