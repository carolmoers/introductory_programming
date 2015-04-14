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

            numberOfAsteriks.insert(0,"**");
            if(counter<numberOfLines){
                isosceles += "\n";
            }

        }

        return isosceles;
    }

    private String createIsoscelesReverse(String isosceles, int numberOfLines){
        StringBuffer isoscelesReverse = new StringBuffer(isosceles);


        return isoscelesReverse.reverse().delete(0,(numberOfLines+2)).toString();
    }
}
