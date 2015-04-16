package twu.prime_factor;

import java.util.Scanner;

/**
 * Created by cmoers on 4/15/15.
 */
public class PrimeFactorMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Choose a number, please: ");
        int numberGive = input.nextInt();
        outputPrimeFactors(numberGive);
    }

    private static void outputPrimeFactors(int numberGive) {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.filterPrimeFactorsFor(numberGive);
        System.out.println(result);
    }
}
