package twu.diamond;

/**
 * Created by caroline on 13/04/15.
 */
public class Diamond {

    public String drawIsoscelesTriangle(int numberOfLines) {
        return createIsosceles(numberOfLines);
    }

    public String drawDiamond(int numberOfLines) {
        String isosceles = createIsosceles(numberOfLines);

        String diamond = isosceles + createIsoscelesReverse(isosceles, numberOfLines);

        return diamond;
    }


    public String drawDiamondWithName(int numberOfLines) {
        String isosceles = createIsosceles(numberOfLines);

        String isoscelesWithoutLastLine = createIsoscelesWithoutLastLine(isosceles, numberOfLines);

        String diamond = isoscelesWithoutLastLine + "Caroline" + createIsoscelesReverse(isosceles, numberOfLines);

        return diamond;
    }

    private String createSpaces(int quantityOfSpaces){
        String spaces = "";

        for(int counter=0; counter<quantityOfSpaces;counter++){
            spaces += " ";
        }

        return spaces;
    }

    private String createIsosceles(int numberOfLines){
        StringBuffer numberOfAsteriks = new StringBuffer("*");
        String isosceles = "";

        for(int counter=1; counter<=numberOfLines;counter++){

            String quantitySpaces = createSpaces(numberOfLines-counter);

            isosceles += quantitySpaces + numberOfAsteriks.toString() + quantitySpaces;


            if(counter<numberOfLines){
                numberOfAsteriks.insert(0,"**");

                isosceles += "\n";
            }

        }

        return isosceles;
    }

    private String createIsoscelesReverse(String isosceles, int numberOfLines){
        StringBuffer isoscelesReverse = new StringBuffer(createIsoscelesWithoutLastLine(isosceles, numberOfLines));

         return isoscelesReverse.reverse().toString();
    }

    private String createIsoscelesWithoutLastLine(String isosceles, int numberOfLines){
        String[] LinesOfIsosceles = isosceles.split("\n");
        String isoscelesWithoutLastLine = "";

        for(int counter=0; counter<(numberOfLines-1); counter++){
            isoscelesWithoutLastLine += LinesOfIsosceles[counter] + "\n";
        }

        return isoscelesWithoutLastLine;
    }
}
