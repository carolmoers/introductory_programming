package twu.diamond;

/**
 * Created by caroline on 13/04/15.
 */
public class Diamond {
    public String drawIsoscelesTriangle(int numberOfLines) {
        StringBuffer numberOfAsteriks = new StringBuffer();
        String isoscelesTriangle = "*";

        for(int counter=1; counter<=numberOfLines;counter++){

            String quantitySpaces = createSpaces(numberOfLines-counter);

            isoscelesTriangle = quantitySpaces + "*" +quantitySpaces;
            numberOfAsteriks.insert(0,"**");
        }
        return isoscelesTriangle;
    }

    private String createSpaces(int quantityOfSpaces){
        String spaces = "";
        for(int counter=0; counter<quantityOfSpaces;quantityOfSpaces++){
            spaces += " ";
        }
        return spaces;
    }
}
