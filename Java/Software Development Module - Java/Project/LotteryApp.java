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
        String repeat = new String();
        String result;
        boolean inputCheck;
        int gameNumber = 1;
        int linesToBePlayed = 0;
        final int LENGTH = 6;
        int[][] playerNumbers;

        //Objects
        Scanner keyboard;
        Lottery myLotteryApp = new Lottery();
        
        //Description
        myLotteryApp.greetings();
        
        do{

            //Input - How Many Numbers
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

            //Input - The Players Numbers
            do{

                try{

                    for(int i = 0; i < linesToBePlayed; i++){

                        do{
                            inputCheck = true;
                            keyboard = new Scanner(System.in);
                            String userNumbersInput = new String();
                            
                            try{
                                System.out.print("Please enter your 6 numbers for line "+(i+1)+": ");
                                userNumbersInput = keyboard.nextLine();
                                String[] userNumbersTemp = userNumbersInput.split(" ");

                                if(userNumbersTemp.length != 6){
                                    throw new InputMismatchException();
                                }

                                for(int j = 0; j < userNumbersTemp.length; j++) {
                                    if(Integer.parseInt(userNumbersTemp[j])<1||Integer.parseInt(userNumbersTemp[j])>40){
                                        throw new InputMismatchException();
                                    } else{
                                        playerNumbers[i][j] = Integer.parseInt(userNumbersTemp[j]);
                                    }
                                }

                            }catch(InputMismatchException e){
                                System.out.println("You need to enter 6 Integers between 1 and 40 e.g. \"1 2 39 2 1 27\"");
                                inputCheck = false;
                            } catch(NumberFormatException f){
                                System.out.println("You need to enter Integers!");   
                                inputCheck = false;
                            }finally{
                                keyboard = null;
                            }

                        }while(!inputCheck);
                    }

                    if(myLotteryApp.checkForDuplicates(playerNumbers)){
                        throw new InputMismatchException("You have entered a Duplicate Number, none of your lines may include duplicate selections");
                    }

                }catch(InputMismatchException e){
                    inputCheck = false;
                    System.out.println(e.getMessage());
                }

            }while(!inputCheck);

            //Process & Output for Game
            System.out.println(myLotteryApp.getResult(playerNumbers, gameNumber));
            gameNumber++;
            
            //Input - Ask the Player if they want to Play Again!
            do{
                keyboard = new Scanner(System.in);
                try{
                    System.out.print("Would you like to replay(\"Y\" or \"N\"): ");
                    repeat = keyboard.nextLine();

                    if(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N"))){
                        throw new InputMismatchException("You need to enter Y or N!");
                    }

                }catch(InputMismatchException e){
                    System.out.println(e.getMessage());
                }finally{
                    keyboard = null;
                }

            }while(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N")));

        }while(repeat.equalsIgnoreCase("Y"));

        System.out.println(myLotteryApp.getHistory());
        myLotteryApp = null;
    }

}