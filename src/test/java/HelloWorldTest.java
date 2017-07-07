import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGetGreeting() throws Exception {
        String greeting = HelloWorld.getGreeting("user");
        assertEquals("Hello, user", greeting);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGreetingNull() throws Exception {
        HelloWorld.getGreeting(null);
    }
}

