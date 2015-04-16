package twu.triangle;

import java.util.Scanner;

public class TriangleMain {

    public static void main(String[] args) {
        int numberGive = 0;
        showTriangleOptions();
        Scanner input = new Scanner(System.in);
        System.out.printf("Choose a number, please (1-4): ");

        int typeToPrint = input.nextInt();
        if(typeToPrint > 1) {
            System.out.printf("Enter with a number: ");
            numberGive = input.nextInt();
        }
        drawTriangle(typeToPrint, numberGive);
    }


    private static void showTriangleOptions(){
        String options = "Welcome! \n\n" +
                "First, what you would like to print out? \n\n" +
                "1 - Easiest Asterisk \n" +
                "2 - Horizontal Line \n" +
                "3 - Vertical Line \n" +
                "4 - Right Triangle \n";

        System.out.printf(options);
    }


    private static void drawTriangle(int typeToPrint, int numberGiven){
        Triangle triangle = new Triangle();
        String result = "";

        try {
            if (typeToPrint == 1) {
                result = triangle.drawEasiestAsterisk();
            } else {
                if(numberGiven < 0){
                    throw new Exception("Invalid number of asterisks.");
                }

                if (typeToPrint == 2) {
                    result = triangle.drawHorizontalLine(numberGiven);
                } else if (typeToPrint == 3) {
                    result = triangle.drawVerticalLine(numberGiven);
                } else if (typeToPrint == 4) {
                    result = triangle.drawRightTriangule(numberGiven);
                }else{
                    throw new Exception("The type number is invalid.");
                }
            }
            System.out.println(result);
        }catch (Exception ex){
            System.out.println("Something went wrong: "+ ex.getMessage());
        }
    }
}
