import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

/**
 * Created by nihughes on 01/03/2016.
 */
public class MainTest {

    private ByteArrayOutputStream outputStream;
    private Main main;

    @Before
    public void beforeEach() {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        main = new Main();
    }
    @Test
    public void shouldDrawStar() {

        main.drawStar();
        assertEquals("*", outputStream.toString());
    }

    public void shouldDrawHorizontalLine() {

        main.drawHorizontalLine(8);
        assertEquals("********", outputStream.toString());

    }
}
