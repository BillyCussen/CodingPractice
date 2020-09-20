/*
RockPaperScissors.java
Billy Cussen
14/07/2020
*/

public class RockPaperScissors {

    //Data Members
    private int playerOneGuess;
    private int computerGuess;
    private String result;

    //Constructor
    public RockPaperScissors(int playerOneGuess){
        this.playerOneGuess = playerOneGuess;
        this.computerGuess = (int)((Math.random()*3) + 1);
        //System.out.println("DEBUG: Computer Guess is: "+this.computerGuess);
        this.result = new String();
    }

    //Compute
    public void calculateWinner(){

        //Rock 1
        //Paper 2
        //Scissors 3

        if(this.playerOneGuess == this.computerGuess){
            this.result = "Draw";
        } else if((this.playerOneGuess == 1 & this.computerGuess == 3) || (this.playerOneGuess == 2 & this.computerGuess == 1) || (this.playerOneGuess == 3 & this.computerGuess == 2)){
            this.result = "Winner";
        } else{
            this.result = "Loser";
        }

    }

    //Getter
    public String getWinner(){
        return this.result;
    }
}