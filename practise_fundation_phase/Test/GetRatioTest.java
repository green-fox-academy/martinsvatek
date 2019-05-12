import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class GetRatioTest {

    @Test
    public void getRatio_PositiveInput_ReturnsRatio() { // what is in the test (method name)/ what i provide/ what i expect

        double ratio = MainForTest.getRatio(6, 2);

        assertEquals(3, ratio, 0.0001); //four decimal numbers
    }

    @Test
    public void getRatio_DivideByZero_ReturnsZero() {

        double ratio = MainForTest.getRatio(6, 0);

        assertEquals(0, ratio, 0.0001);
    }
}