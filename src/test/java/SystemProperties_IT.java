import org.junit.Test;

public class SystemProperties_IT {

    @Test
    public void printSystemProperties () {

        System.out.println("...executing printSystemProperties() [IT] - serviceHost: " + System.getProperty("serviceHost"));
        System.out.println("...executing printSystemProperties() [IT] - servicePort: " + System.getProperty("servicePort"));

    }
}
