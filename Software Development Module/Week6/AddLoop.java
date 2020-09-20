/*
AddLoop.java
Billy Cussen
14/07/2020
*/

public class AddLoop {
    
    //Data Members
    private int input;
    private int output;

    //Constructor
    public AddLoop(int input){
        this.input = input;
        this.output = 0;
    }

    //Compute & Getter
    public int getOutput(){

        for(int i = 0; i <= this.input; i++){
            this.output+=i;
        }

        return this.output;
    }

}