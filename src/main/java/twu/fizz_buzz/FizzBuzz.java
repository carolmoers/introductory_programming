package twu.fizz_buzz;

/**
 * Created by cmoers on 4/15/15.
 */
public class FizzBuzz {

    public String fizzBuzz(int quantityOfNumbers) {
        String result = "";
        for(int counter=1;counter<=quantityOfNumbers;counter++) {
            if ((counter % 3 == 0) && (counter % 5 == 0)) {
                result += "FizzBuzz";
            } else if (counter % 3 == 0) {
                result += "Fizz";
            } else if (counter % 5 == 0) {
                result += "Buzz";
            } else {
                result += counter;
            }

            if (counter < quantityOfNumbers) {
                result += "\n";
            }
        }
        return result;
    }
}
