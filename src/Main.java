public class Main {

    public void drawStar() {
        System.out.print("*");
    }

    public void drawHorizontalLine(int numberToDraw) {
        drawHorizontalLineOfString("*", numberToDraw);
    }

    public void drawVerticalLine(int numberToDraw) {
        for(int i = 0; i < numberToDraw; i++) {
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int height) {
        for(int i = 1; i <= height; i++){
            drawHorizontalLine(i);
            System.out.println();
        }
    }

    public void drawIsoscelesTriangle(int height) {
        int base = (2 * height) -1;
        for(int i = 1; i <= height; i++){
            int numberToDrawOnCurrentLine = (2 * i) - 1;
            int numberOfSpacesToPad = (base - numberToDrawOnCurrentLine)/2;
            printLineWithPadding(numberOfSpacesToPad, numberToDrawOnCurrentLine);
        }
    }

    private void drawHorizontalLineOfString(String string, int numberToDraw){
        for(int i = 0; i < numberToDraw; i++){
            System.out.print(string);
        }

    }

    private void printLineWithPadding(int numberOfSpacesToPad, int numberToDraw){
        drawHorizontalLineOfString(" ", numberOfSpacesToPad);
        drawHorizontalLine(numberToDraw);
        drawHorizontalLineOfString(" ", numberOfSpacesToPad);
        System.out.println();
    }
}
