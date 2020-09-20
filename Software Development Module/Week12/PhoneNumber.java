/*
PhoneNumber.java
Billy Cussen
23/07/2020
*/

public class PhoneNumber{

    //Data Members
    private String input;
    private String output;

    //Constructor and Setter
    public PhoneNumber(String input){
        this.input = input;
        this.output = new String();
    }

    //Compute & Getter
    public String computeAndGetResult(){

        if((this.input.substring(0,2).equals("08"))){
            if((this.input.charAt(2)=='3'||this.input.charAt(2)=='5'||this.input.charAt(2)=='6'||this.input.charAt(2)=='7'||this.input.charAt(2)=='9')){
                this.output = "This is a valid Phone Number";
            } else{
                this.output = "This is not a valid Phone Number";
            }
        } else{
            this.output = "This is not a valid Phone Number";
        } 

        return this.output;
    }
}