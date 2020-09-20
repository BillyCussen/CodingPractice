/*
GuessApp.java
Billy Cussen
13/07/2020
*/

import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class GuessApp {
  
    public static void main(String [] args){

        //Variables
        int guess = 0;
        int count;
        int enemyCount;
        boolean inputCheckGuess;
        String result;
        String retry;

        //Object
        Guess myGuess;

        //Input
        do{
            retry = new String();
            count = 0;
            enemyCount = 0;

            for(int i = 0; i < 3; i++){

                do{

                    inputCheckGuess = true;

                    try{
                        guess = Integer.parseInt(JOptionPane.showInputDialog("Please Guess a Number between 1 and 10: "));

                        if(guess <= 0 || guess > 10){
                            throw new InputMismatchException();
                        }

                    }catch(NumberFormatException | InputMismatchException e){
                        inputCheckGuess = false;
                        JOptionPane.showMessageDialog(null, "You need to enter an Integer between 1 and 10");
                    } 

                }while(!inputCheckGuess);

                //Compute
                myGuess = new Guess(guess);
                result = myGuess.computeCorrectNumber();

                //Output
                if(result.equalsIgnoreCase("Correct")){
                    count++;
                    JOptionPane.showMessageDialog(null, "Correct! You guessed the correct number which is "+myGuess.getCorrectNumber());
                } else if(result.equalsIgnoreCase("Higher")){
                    enemyCount++;
                    JOptionPane.showMessageDialog(null, "Wrong! You guessed too high! \nThe correct number is "+myGuess.getCorrectNumber());
                }else{
                    enemyCount++;
                    JOptionPane.showMessageDialog(null, "Wrong! You guessed too low! \nThe correct number is "+myGuess.getCorrectNumber());
                }
                
            }

            if(count > enemyCount){
                JOptionPane.showMessageDialog(null,"Congratulations, you won this round!\nScore: "+count+"\nComputer Score: "+enemyCount);
            } else{
                JOptionPane.showMessageDialog(null,"Too bad, you lost this round!\nScore: "+count+"\nComputer Score: "+enemyCount);
            }

            do{
                retry = JOptionPane.showInputDialog("Would you like to retry? \nYes or No");

                if(!(retry.equalsIgnoreCase("Yes")||retry.equalsIgnoreCase("No"))){
                    JOptionPane.showMessageDialog(null,"You need to enter either Yes or No");
                }

            }while(!(retry.equalsIgnoreCase("Yes")||retry.equalsIgnoreCase("No")));

        }while(retry.equalsIgnoreCase("Yes"));

    }

}