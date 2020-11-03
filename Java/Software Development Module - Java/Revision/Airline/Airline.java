/*
Airline.java
Billy Cussen
29/07/2020
*/

public class Airline{

    //Data Members
    private String status;
    private int flights;
    private String pointsEarned;

    //Constructor
    public Airline(String status, int flights){
        this.status = status;
        this.flights = flights;
        this.pointsEarned = new String();
    }

    //Compute & Getter
    public String getPointsEarned(){

        if(this.status.equalsIgnoreCase("Silver")){
            if(this.flights <= 3){
                this.pointsEarned = "Congratulations, you get "+this.flights*2 + " points!";
            }else{
                this.pointsEarned = "Congratulations, you get "+this.flights*3 + " points!";
            }
        } else if(this.status.equalsIgnoreCase("Gold")){
            if(this.flights <= 3){
                this.pointsEarned = "Congratulations, you get "+this.flights*4 + " points!";
            }else{
                this.pointsEarned = "Congratulations, you get "+this.flights*5 + " points!";
            }
        } else{
            if(this.flights <= 3){
                this.pointsEarned = "Congratulations, you get "+ ((int)Math.pow(this.flights,2)) + " points!";
            }else{
                this.pointsEarned = "Congratulations, you get "+ ((int)Math.pow(this.flights,3)) + " points!";
            }            
        }

        return this.pointsEarned;
    }

}