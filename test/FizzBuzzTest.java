import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

/**
 * Created by nihughes on 01/03/2016.
 */
public class FizzBuzzTest {

    private ByteArrayOutputStream outputStream;
    private FizzBuzz fb;

    @Test
    public void fizzBuzz15() {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        fb = new FizzBuzz();
        fb.go(15);
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", outputStream.toString());
    }
}
