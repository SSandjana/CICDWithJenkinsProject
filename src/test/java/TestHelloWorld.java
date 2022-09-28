import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {

    @Test
    public void checkHelloWorldOutput() {
        String expected = "Hello World!";
        String actual = DisplaySomething.display("Hello World!");
        Assert.assertEquals(expected, actual);
    }

}
