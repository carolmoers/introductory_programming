package twu.fizz_buzz;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by cmoers on 4/15/15.
 */
public class FizzBuzzTest {
    @Test
    public void FizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.FizzBuzz(15);

        assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz", result);
    }
}
