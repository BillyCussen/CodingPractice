/*
BMICalculator.java
Billy Cussen
30/07/2020
*/

public class BMICalculator{

    //Data Members
    private double weight;
    private double height;
    private String BMI;

    //Constructor
    public BMICalculator(double weight, double height){
        this.weight = weight;
        this.height = height;
        this.BMI = new String();
    }

    //Compute and Getter
    public String getBMI(){
        this.BMI = "Your BMI is: "+((double)Math.round(this.weight/Math.pow(this.height,2)));
        return this.BMI;
    }
}