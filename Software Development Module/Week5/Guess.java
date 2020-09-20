/*
Guess.java
Billy Cussen
13/07/2020
*/

public class Guess {
    
    //Data Members
    private int guess;
    private int correctNumber;
    private String result;

    //Constructor
    public Guess(int guess){
        this.guess = guess;
        this.correctNumber = 0;
        this.result = new String();
    }

    //Compute
    public String computeCorrectNumber(){

        this.correctNumber = (int) (Math.random()*10 + 1);
        //System.out.println("DEBUG: Random number is: "+this.correctNumber);

        if(this.guess == this.correctNumber){
            return "Correct";
        } else if(this.guess > this.correctNumber){
            return "Larger";
        } else{
            return "Smaller";
        }
    }

    //Getter
    public int getCorrectNumber(){
        return this.correctNumber;
    }

}