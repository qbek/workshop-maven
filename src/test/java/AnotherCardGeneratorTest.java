import org.hamcrest.core.Is;
import org.junit.Test;
import sample.Card;
import sample.CardGenerator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AnotherCardGeneratorTest {

    private CardGenerator generator = new CardGenerator();

    @Test
    public void testCVVNumber () {
        System.out.println("...executing testCVVNumber() - from AnothreCardGeneratorTest");
        Card testCard = generator.newValidCard("12345");
        assertNotNull("Empty holder name", testCard.getCvv());
        assertThat(Integer.parseInt(testCard.getCvv()), Is.isA(int.class));
    }
}
