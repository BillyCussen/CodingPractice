/*
Bin.java
Billy Cussen
20/07/2020
*/

public class Bin {

    //Data Members
    private String binColor;
    private int apartmentNumber;
    private String result;

    //Constructor and Setter
    public Bin(String binColor, int apartmentNumber){
        this.binColor = binColor;
        this.apartmentNumber = apartmentNumber;
        this.result = "Your collection day is: ";
    }

    //Compute and Getter
    public String computeAndGetDay(){
        
        switch(this.binColor.toLowerCase()){

            case "green": 
                if(this.apartmentNumber % 2 == 0){
                    this.result += "Monday.";
                } else{
                    this.result += "Tuesday.";
                }
                break;
            case "brown": 
                if(this.apartmentNumber % 2 == 0){
                    this.result += "Wednesday.";
                } else{
                    this.result += "Thursday.";
                }
                break;
            case "black": 
                if(this.apartmentNumber % 2 == 0){
                    this.result += "Friday.";
                } else{
                    this.result += "Saturday";
                }
                break;
        }

        return this.result;
    }

}