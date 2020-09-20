/*
Eggs.java
Billy Cussen
08/07/2020
*/

//This Class will compute how many boxes of eggs will be filled based on the amount collected (a dozen/12 eggs per box)

public class Eggs {
    
    //Data Members
    private int eggs;
    private int remainder;
    private int boxes;

    //Constructor
    public Eggs(){
        this.eggs = 0;
        this.remainder = 0;
        this.boxes = 0;
    }

    //Setter
    public void setEggs(int eggs){
        this.eggs = eggs;
    }

    //Compute
    public void computeBoxes(){
        boxes = eggs / 12;
        remainder = eggs % 12;
    }

    //Getters
    public int getBoxes(){
        return boxes;
    }

    public int getRemainder(){
        return remainder;
    }


}