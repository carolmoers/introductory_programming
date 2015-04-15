package twu.fizz_buzz;

import java.util.Scanner;

/**
 * Created by cmoers on 4/15/15.
 */
public class FizzBuzzMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Choose a number, please: ");
        int numberGive = input.nextInt();

        outputFizzBuzz(numberGive);
    }

    private static void outputFizzBuzz(int numberGive) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.FizzBuzz(numberGive);

        System.out.println(result);
    }
}
