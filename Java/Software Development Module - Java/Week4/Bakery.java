/*
Bakery.java
Billy Cussen
09/07/2020
*/

//This class determines how many boxes of items can be carried in a Delivery Trip for a Bakery. Each box has 6 items

public class Bakery {
    
    //Data Members
    private int items;
    private int boxes;
    private int trips;
    private final int TOTALITEMSPERBOX;
    private final int TOTALBOXESPERTRIP;

    //Constructor
    public Bakery(int items){

        this.items = items;
        this.boxes = 0;
        this.trips = 0;
        this.TOTALITEMSPERBOX = 6;
        this.TOTALBOXESPERTRIP = 2;
    }

    //Compute
    public void computeBoxesAndTrips(){

        this.boxes = (this.items/this.TOTALITEMSPERBOX);
        this.trips = (this.boxes/this.TOTALBOXESPERTRIP);
 
    }

    //Getters
    public int getBoxes(){
        return this.boxes;
    }

    public int getTrips(){
        return this.trips;
    }

}