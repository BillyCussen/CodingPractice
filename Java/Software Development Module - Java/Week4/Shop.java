/*
Shop.java
Billy Cussen
10/07/2020
*/

public class Shop {
    
    //Data Members
    private int hoodies;
    private int tshirts;
    private int caps;
    private final double COSTPERHOODIES;
    private final double COSTPERTSHIRT;
    private final double COSTPERCAP;
    private double total;

    //Constructor
    public Shop(int hoodies, int tshirts, int caps){
        this.hoodies=hoodies;
        this.tshirts=tshirts;
        this.caps=caps;
        this.COSTPERHOODIES = 25.99;
        this.COSTPERTSHIRT = 12.99;
        this.COSTPERCAP = 6.99;
        this.total = 0;
    }

    //Compute
    public void computeTotal(){
        this.total = (this.hoodies * this.COSTPERHOODIES)+(this.tshirts * this.COSTPERTSHIRT)+(this.caps * this.COSTPERCAP);
    }

    //Getter
    public double getTotal(){
        return this.total;
    }

}