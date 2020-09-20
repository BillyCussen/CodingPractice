/*
ConcretePrinter.java
Billy Cussen
15/09/2020
*/

public class ConcretePrinter extends AbstractPrinter{

    private final String BLACK_BACKGROUND = "\u001B[40m";
    public  final String WHITE_TEXT = "\u001B[37m";
    private final String CLEARCOLOR = "\u001B[0m";

    @Override
    public void printBW(String value){
        System.out.println(this.BLACK_BACKGROUND+this.WHITE_TEXT+value+this.CLEARCOLOR);
    }

}