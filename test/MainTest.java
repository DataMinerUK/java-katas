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
    public void drawStarShouldDrawASingleStar() {

        main.drawStar();
        assertEquals("*", outputStream.toString());
    }

    @Test
    public void drawHorizontalLineShouldDrawLineOfNStars() {

        main.drawHorizontalLine(8);
        assertEquals("********", outputStream.toString());

        outputStream.reset();
        main.drawHorizontalLine(9);
        assertEquals("*********", outputStream.toString());

    }

    @Test
    public void drawVerticalLineShouldDrawLineOfNStars() {

        main.drawVerticalLine(3);
        assertEquals("*\n*\n*\n", outputStream.toString());
    }

    @Test
    public void drawRightTriangleShouldDrawATriangleToTheRightOfHeightN(){

        main.drawRightTriangle(3);
        assertEquals("*\n**\n***\n", outputStream.toString());
    }

    @Test
    public void drawIsoscelesTriangleShouldDrawAnIsoscelesTriangleOfHeightN(){
        main.drawIsoscelesTriangle(3);
        assertEquals("  *  \n *** \n*****\n", outputStream.toString());
    }

    @Test
    public void drawDiamondShouldDrawADiamondOfHeightN(){
        main.drawDiamond(3);
        assertEquals("  *  \n *** \n*****\n *** \n  *  \n", outputStream.toString());
    }

    @Test
    public void drawDiamondWithNameShouldDrawADiamondOfHeightNWithNameAtCentre(){
        main.drawDiamondWithName(3, "Nicola");
        assertEquals("  *  \n *** \nNicola\n *** \n  *  \n", outputStream.toString());
    }
}
