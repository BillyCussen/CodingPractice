/*
RockPaperScissorsApp.java
Billy Cussen
14/07/2020
*/

import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class RockPaperScissorsApp {
    
    public static void main(String [] args){

        //Variables
        int playerOneGuess = 0;
        int playerOneScore, playerTwoScore;
        int wonGameCount = 0, loseGameCount = 0, drawGameCount = 0;
        String retry;
        String result;
        boolean inputCheckRockPaperScissors;

        //Object
        RockPaperScissors myRockPaperScissors;

        //Input 
        do{
            retry = new String();
            playerOneScore = 0;
            playerTwoScore = 0;

            for(int i = 0; i < 3; i++){

                do{
                    inputCheckRockPaperScissors = true;

                    try{

                        playerOneGuess = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number between 1 and 3\n1 = Rock\n2 = Paper\n3 = Scissors"));

                        if(playerOneGuess <= 0 || playerOneGuess > 3){
                            throw new InputMismatchException();
                        }

                    }catch(InputMismatchException | NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "You need to enter an Integer between 1 and 3\ni.e. Select 1, 2 or 3");
                        inputCheckRockPaperScissors = false;
                    }

                }while(!inputCheckRockPaperScissors);

                myRockPaperScissors = new RockPaperScissors(playerOneGuess);
                myRockPaperScissors.calculateWinner();
                result = myRockPaperScissors.getWinner();
                myRockPaperScissors = null;

                if(result.equalsIgnoreCase("Winner")){
                    JOptionPane.showMessageDialog(null,"You win this round!");
                    playerOneScore++;
                } else if(result.equalsIgnoreCase("Loser")){
                    JOptionPane.showMessageDialog(null,"You lose this round!");
                    playerTwoScore++;
                }else{
                    JOptionPane.showMessageDialog(null,"This round was a draw!");
                }

            }

            if(playerOneScore > playerTwoScore){
                JOptionPane.showMessageDialog(null,"You won this game, Congratulations!\nPlayer Score: "+playerOneScore+"\nComputer Score: "+playerTwoScore);
                wonGameCount++;
            } else if (playerOneScore < playerTwoScore){
                JOptionPane.showMessageDialog(null,"You lost this game, Better luck next time!!\nPlayer Score: "+playerOneScore+"\nComputer Score: "+playerTwoScore);
                loseGameCount++;
            } else{
                JOptionPane.showMessageDialog(null,"This round was a Draw, you should try again to win!!!\nPlayer Score: "+playerOneScore+"\nComputer Score: "+playerTwoScore);
                drawGameCount++;
            }

            do{

                retry = JOptionPane.showInputDialog("Would you like to retry?\n\"Yes\" to Retry\n\"No\" to Quit");

                if(!(retry.equalsIgnoreCase("Yes")||retry.equalsIgnoreCase("No"))){
                    JOptionPane.showMessageDialog(null,"You need to enter either \"Yes\" or \"No\"");
                }

            }while(!(retry.equalsIgnoreCase("Yes")||retry.equalsIgnoreCase("No")));

        }while(retry.equalsIgnoreCase("Yes"));

        JOptionPane.showMessageDialog(null, "Thanks for playing, heres a breakdown of your Games:\nWon: "+wonGameCount+"\nLost: "+loseGameCount+"\nDrawn: "+drawGameCount);


    }

}