/*
InterestCalculator.java
Billy Cussen
03/09/2020
*/

import java.util.InputMismatchException;

public class InterestCalculator{

    //Data Members
    private double interestTotal;
    private double highestInterest;

    //Constructor
    public InterestCalculator(){
    }

    //Compute, Setter & Getter
    public double getInterest (double amount, int months, boolean accessMoney) throws InputMismatchException{
        switch(months){
            case 6:
                if(accessMoney){
                    this.interestTotal = amount * 0.0002;
                }else{
                    this.interestTotal = amount * 0.0005;
                }
                break;
            case 12:
                if(accessMoney){
                    this.interestTotal = amount * 0.0015;
                }else{
                    this.interestTotal = amount * 0.002;
                }
                break;
            case 18:
                if(accessMoney){
                    this.interestTotal = amount * 0.002;
                }else{
                    this.interestTotal = amount * 0.004;
                }
                break;
            default:
                throw new InputMismatchException("Something went wrong here!");
        }
        return this.interestTotal;
    }

    public double getHighestInterest(double[] allInterest){
        this.highestInterest = allInterest[0];
        for(int i = 1; i < allInterest.length; i++){
            if(allInterest[i] >= this.highestInterest){
                this.highestInterest = allInterest[i];
            }
        }
        return this.highestInterest;
    }

}