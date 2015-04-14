package twu.diamond;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by caroline on 13/04/15.
 */
public class DiamondTest {

    @Test
    public void drawIsoscelesTriangleTest(){
        Diamond diamond = new Diamond();
        int numberOfLines = 3;
        String result = diamond.drawIsoscelesTriangle(numberOfLines);

        assertEquals("  *  \n *** \n*****", result);
    }

    @Test
    public void drawDiamondTest(){
        Diamond diamond = new Diamond();
        int numberOfLines = 3;
        String result = diamond.drawDiamond(numberOfLines);

        assertEquals("  *  \n *** \n*****\n *** \n  *  ", result);
    }
}
