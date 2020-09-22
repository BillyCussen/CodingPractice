/*
LotteryApp.java
Billy Cussen
20/09/2020
*/

//In Progress

import java.util.Scanner;
import java.util.InputMismatchException;

public class LotteryApp{

    public static void main(String [] args){

        //Variables
        boolean inputCheck;
        int linesToBePlayed = 0;
        final int LENGTH = 6;
        int[][] playerNumbers;

        //Objects
        Scanner keyboard;
        Lottery myLotteryApp = new Lottery();
        
        //Description
        System.out.println("***LOTTERY GAME***");
        System.out.println("Description: 6 random secret lottery numbers between 1 and 40 are generated!");
        System.out.println("Rule 1: You can play up to 3 lines per game!");
        System.out.println("Rule 2: You can guess 6 Numbers per line!");
        System.out.println("Rule 3: If you guess 3 or more numbers, you'll win a prize!\n");

        //Input
        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;

            try{
                System.out.print("Please enter Number of lines you wish to play (1, 2 or 3): ");
                linesToBePlayed = keyboard.nextInt();

                if(linesToBePlayed<1||linesToBePlayed>3){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException | NumberFormatException e){
                System.out.println("You need to enter either 1, 2 or 3!");
                inputCheck = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);

        playerNumbers = new int[linesToBePlayed][LENGTH];

        for(int i = 0; i < linesToBePlayed; i++){

            do{

                try{

                do{
                    inputCheck = true;
                    keyboard = new Scanner(System.in);
                    String userNumbersInput = new String();
                    
                    try{
                        System.out.print("Please enter your 6 numbers for line "+(i+1)+": ");
                        userNumbersInput = keyboard.nextLine();
                        String[] userNumbersTemp = userNumbersInput.split(" ");
                        

                        if(userNumbersTemp.length != 6){
                            throw new InputMismatchException("You need to enter 6 Integers between 1 and 40 e.g. \"1 2 39 2 1 27\"");
                        }

                        for(int j = 0; j < userNumbersTemp.length; j++) {
                            playerNumbers[i][j] = Integer.parseInt(userNumbersTemp[j]);
                        }

                        

                    }catch(InputMismatchException e){
                        System.out.println(e.getMessage());
                        inputCheck = false;
                    } catch(NumberFormatException f){
                        System.out.println("You need to enter Integers!");   
                        inputCheck = false;
                    }finally{
                        keyboard = null;
                    }

                }while(!inputCheck);

                if(myLotteryApp.checkForDuplicates(playerNumbers)){
                    throw new InputMismatchException("You have entered a Duplicate Number, none of your lines may include duplicate selections");
                }

                }catch(InputMismatchException e){
                    inputCheck = false;
                    System.out.println(e.getMessage());
                }

            }while(!inputCheck);
        }

        
    }

}