package twu.triangle;

/**
 * Created by caroline on 09/04/15.
 */
public class Triangle {

    public String drawEasiestAsterisk() {
        return "*";
    }

    public String drawHorizontalLine(int numberOfAsterisks) {

        String horizontalLine = "";

        for (int counter = 0; counter < numberOfAsterisks; counter++) {
            horizontalLine += "*";
        }

        return horizontalLine;
    }

    public String drawVerticalLine(int numberOfAsterisks) {
        String verticallLine = "";

        for(int counter=0; counter<numberOfAsterisks; counter++){
            verticallLine += "*";

            if(counter<(numberOfAsterisks-1)){
                verticallLine += "\n";
            }
        }

        return verticallLine;
    }

    public String drawRightTriangule(int numberOfAsterisksLastLine) {
        StringBuffer newLine = new StringBuffer();
        String rightTriangule = "";

        for(int counter=0; counter<numberOfAsterisksLastLine;counter++){
            newLine.insert(0,"*");
            rightTriangule += newLine.toString();

            if(counter<(numberOfAsterisksLastLine-1)){
                rightTriangule += "\n";
            }
        }


        return rightTriangule;
    }
}
