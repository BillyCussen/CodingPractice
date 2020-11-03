/*
PlayerApp.java
Billy Cussen
28/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class PlayerApp{
    
    public static void main(String[] args){

        //Variables
        String name = new String();
        String position = new String();
        String result;
        boolean inputCheck;

        //Objects
        Scanner keyboard;
        FootballPlayer myPlayer;

        //Input
        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter your full name: ");
                name = keyboard.nextLine();

                //This regex checks for Alphabetical Characters and Spaces
                //Included for verification purposes in the context of a coding exercise, I'm aware people can have different kinds of names IRL :)
                if(!name.matches("^[a-zA-z ]*$") || name.length() <= 0){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                inputCheck = false;
                System.out.println("Please enter a valid name");
            } finally{
                keyboard = null;
            }
        }while(!inputCheck);

        do{
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter your Position (Defensive, Full Back or Full Forward): ");
                position = keyboard.nextLine();

                if(!(position.equalsIgnoreCase("Defensive")||position.equalsIgnoreCase("Full Forward")||position.equalsIgnoreCase("Full Back"))){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("Please select either Defensive, Full Back or Full Forward");
            } finally{
                keyboard = null;
            }
        }while(!(position.equalsIgnoreCase("Defensive")||position.equalsIgnoreCase("Full Forward")||position.equalsIgnoreCase("Full Back")));

        //Process
        if(position.equalsIgnoreCase("Defensive")){
            myPlayer = new DefensivePlayer(name);
        } else if(position.equalsIgnoreCase("Full Forward")){
            myPlayer = new FullForwardPlayer(name);         
        } else{
            myPlayer = new FullBackPlayer(name);            
        }

        result = myPlayer.role();
        myPlayer = null;
        
        //Output
        System.out.println(result); 
    }

}