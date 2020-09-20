/*
AbstractPrinter.java
Billy Cussen
15/09/2020
*/

public abstract class AbstractPrinter implements PrinterInterface{

    private final String CYAN = "\u001B[36m";
    private final String CLEARCOLOR = "\u001B[0m";

    @Override
    public void printColor(String value){
        System.out.println(this.CYAN+value+this.CLEARCOLOR);
    }
    
}