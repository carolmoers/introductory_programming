package twu.triangle;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by caroline on 10/04/15.
 */
public class TriangleTest {

    @Test
    public void drawEasiestAsteriskTest(){
        Triangle triangle = new Triangle();
        String asterisk = triangle.drawEasiestAsterisk();

        assertEquals("*", asterisk);
    }

    @Test
    public void drawHorizontalLineTest(){
        Triangle triangle = new Triangle();
        int numberOfAsterisks = 3;
        String horizontalLine = triangle.drawHorizontalLine(numberOfAsterisks);

        assertEquals("***", horizontalLine);
    }

    @Test
    public void drawVerticalLineTest(){
        Triangle triangle = new Triangle();
        int numberOfAsterisks = 3;
        String verticalLine = triangle.drawVerticalLine(numberOfAsterisks);

        assertEquals("*\n*\n*", verticalLine);
    }

    @Test
    public void drawRightTrianguleTest(){
        Triangle triangle = new Triangle();
        int numberOfAsterisksLastLine = 3;
        String rightTriangule = triangle.drawRightTriangule(numberOfAsterisksLastLine);

        assertEquals("*\n**\n***", rightTriangule);
    }

}
