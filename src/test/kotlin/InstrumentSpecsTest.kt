import org.example.Enums.Builder
import org.example.Enums.Type
import org.example.Enums.Wood
import org.example.InstrumentSpecs
import org.example.Specs.GuitarSpecs
import org.example.Specs.QuerySpecs
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class InstrumentSpecsTest {

    @Test
    fun `should match properties with same value in an InstrumentSpecs`() {
        val guitarSpecs = GuitarSpecs(
            backWood = Wood.ALDER,
            builder = Builder.FENDER,
            model = "New",
            type = Type.ACOUSTIC,
            topWood = Wood.CEDAR,
            numString = 5
        )

        val querySpecs = QuerySpecs(
            builder = Builder.FENDER,
        )

        val isMatch = querySpecs.match(guitarSpecs)
        assertTrue { isMatch }
    }


    @Test
    fun `should not match even one property with different values in an InstrumentSpecs`() {

    }

    @Test
    fun `should not match property if not present in an InstrumentSpecs`() {

    }
}
