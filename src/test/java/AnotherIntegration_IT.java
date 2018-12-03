import org.junit.Test;
import sample.Card;
import sample.CardGenerator;

public class AnotherIntegration_IT {

    @Test
    public void integrationTest () {
        System.out.println("...execution anotherIntegrationTest 2");
        Card testCard = new CardGenerator().newValidCard("1234");
        System.out.println("Generated card details: pan " + testCard.getPan() + ", holder " + testCard.getHolder());
        //do something with card
        //eg. send it somewhere and check response ;D
    }
}
