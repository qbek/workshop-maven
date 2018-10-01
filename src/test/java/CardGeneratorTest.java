import org.junit.Test;
import sample.Card;
import sample.CardGenerator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CardGeneratorTest {

    private CardGenerator generator = new CardGenerator();

    @Test
    public void testPanNumber() {
        System.out.println("...executing testPanNumber()");
        Card testCard = generator.newValidCard("12345");
        assertTrue("Generated PAN has incorrect pan", testCard.getPan().startsWith("12345"));
    }

    @Test
    public void testHolderName() {
        System.out.println("...executing testHolderName()");
        Card testCard = generator.newValidCard("12345");
        assertNotNull("Empty holder name", testCard.getHolder());
    }
}
