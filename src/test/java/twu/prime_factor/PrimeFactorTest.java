package twu.prime_factor;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by cmoers on 4/15/15.
 */
public class PrimeFactorTest {
    @Test
    public void PrimeFactorTest(){
        PrimeFactor primefactor = new PrimeFactor();
        int totalNumber = 30;
        String result = primefactor.filterPrimeFactorsFor(totalNumber);

        assertEquals("2,3,5", result);
    }
}
