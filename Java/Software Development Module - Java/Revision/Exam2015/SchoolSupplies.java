/*
SchoolSupplies.java
Billy Cussen
10/08/2020
*/

public class SchoolSupplies{

    //Data Members
    private int[] supplyQuantity;
    private double[] supplyCost;
    private String total;

    public SchoolSupplies(){
        this.total = "Total Cost of these Supplies is: ";
    }

    //Setter, Compute and Getter
    public String calculateSchoolSupplies(int[] supplyQuantity, double[]supplyCost){
        this.supplyQuantity = supplyQuantity;
        this.supplyCost = supplyCost;
        double numTotal = 0.0;

        for(int i = 0; i < this.supplyQuantity.length; i++){

            numTotal += this.supplyQuantity[i] * this.supplyCost[i];

        }
        this.total += numTotal;
        return this.total;
    }

}