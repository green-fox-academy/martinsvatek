import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ApplesTest {

    @Test
    public void getApple_initializeNewApple_toBeInitialized() {
        Apples testedApple = new Apples();

        String result = testedApple.getApple();
        assertEquals("apple", result);
    }
}
