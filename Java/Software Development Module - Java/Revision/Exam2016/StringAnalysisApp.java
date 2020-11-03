/*
StringAnalysisApp.java
Billy Cussen
15/08/2020
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class StringAnalysisApp{

    public static void main(String [] args){

        //Variables
        String userInput = new String();
        String repeat = new String();
        String output;
        boolean inputCheck;

        //Objects
        ArrayList<String> history = new ArrayList<String>();
        Scanner keyboard;
        StringAnalysis myStringAnalysis;

        do{
           
            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Enter a Sentance: ");
                    userInput = keyboard.nextLine();

                    if(userInput.length() <= 0){
                        throw new InputMismatchException();
                    }

                }catch(InputMismatchException e){
                    inputCheck = false;
                    System.out.println("You need to enter a valid Sentance!");
                }finally{
                    keyboard = null;
                }

            }while(!inputCheck);

            //Process
            myStringAnalysis = new StringAnalysis(userInput);
            myStringAnalysis.computeOutput();
            output = "Output: "+myStringAnalysis.getOutput()+", Word Count: "+myStringAnalysis.getWordCount();
            myStringAnalysis = null;

            System.out.println(output);
            history.add(output);

            //Repeat?
            do{
                keyboard = new Scanner(System.in);

                System.out.print("Please enter \"Y\" or \"N\" to Restart: ");
                repeat = keyboard.nextLine();

                if(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N"))){
                    System.out.println("You need to enter \"Y\" or \"N\"!");
                }

                keyboard = null;

            }while(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N")));

        }while(repeat.equalsIgnoreCase("Y"));

        System.out.println("\n***HISTORY***");

        for(String e: history){
            System.out.println(e);
        }

        history = null;
    }

}