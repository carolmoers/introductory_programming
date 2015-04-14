package twu.diamond;

import java.util.Scanner;

/**
 * Created by caroline on 13/04/15.
 */
public class DiamondMain {
    public static void main(String[] args) {
        int numberGive = 0;

        showDiamondOptions();

        Scanner input = new Scanner(System.in);
        System.out.printf("Choose a number, please (1): ");
        int typeToPrint = input.nextInt();

        System.out.printf("Enter with a number: ");
        numberGive = input.nextInt();


        drawDiamond(typeToPrint, numberGive);
    }


    private static void showDiamondOptions(){
        String options = "Welcome! \n\n" +
                "First, what you would like to print out? \n\n" +
                "1 - Isosceles Triangle \n" +
                "2 - Diamond \n";

        System.out.printf(options);
    }


    private static void drawDiamond(int typeToPrint, int numberGiven){
        Diamond diamond = new Diamond();
        String result = "";

        try{

            if(numberGiven < 0){
                throw new Exception("Invalid number of asterisks.");
            }

            if (typeToPrint == 1) {
                result = diamond.drawIsoscelesTriangle(numberGiven);
            }else if(typeToPrint == 2){
                result = diamond.drawDiamond(numberGiven);
            }

            System.out.println(result);
        }catch (Exception ex){
            System.out.println("Something went wrong: "+ ex.getMessage());
        }

    }
}
