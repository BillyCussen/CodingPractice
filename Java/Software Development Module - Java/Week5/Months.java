/*
Months.java
Billy Cussen
13/07/2020
*/

public class Months {
    
    //Data Members
    private int input;
    private String output;

    //Constructor
    public Months(int input){
        this.input = input;
        this.output = "Month "+this.input+" has ";
    }

    //Compute
    public void computeDays(){

        if(this.input == 2){
            this.output += 28 + " days";
        } else if(this.input == 4 || this.input == 6 || this.input == 11 || this.input == 12){
            this.output += 30 + " days";
        } else{
            this.output += 31 + " days";
        }

    }

    //Getter
    public String getOutput(){
        return this.output;
    }

}