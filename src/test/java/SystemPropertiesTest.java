import com.sun.javafx.runtime.SystemProperties;
import org.hamcrest.core.Is;
import org.junit.Test;
import sample.Card;
import sample.CardGenerator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class SystemPropertiesTest {

    @Test
    public void printSystemProperties () {

        System.out.println("...executing printSystemProperties() - serviceHost: " + System.getProperty("serviceHost"));
        System.out.println("...executing printSystemProperties() - servicePort: " + System.getProperty("servicePort"));

    }
}
