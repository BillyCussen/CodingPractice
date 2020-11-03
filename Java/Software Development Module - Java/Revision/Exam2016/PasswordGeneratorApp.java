/*
PasswordGeneratorApp.java
Billy Cussen
11/08/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class PasswordGeneratorApp{

    public static void main(String [] args){

        //Variables
        String input = new String();
        String output;
        String retry;
        boolean inputCheck;

        //Objects
        Scanner keyboard;
        PasswordGenerator myPassword;
        LinkedList<String> passwordHistory = new LinkedList<String>();

        do{
            
            retry = new String();

            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;

                try{
                    System.out.print("Please enter your full name: ");
                    input = keyboard.nextLine();

                        //This regex checks for Alphabetical Characters and Spaces
                        //Included for verification purposes in the context of a coding exercise, I'm aware people can have different kinds of names IRL :)
                        if(!input.matches("^[a-zA-z ]*$") || input.length() <= 0){
                            throw new InputMismatchException("You need to enter a full name");
                        }

                }catch(InputMismatchException e){
                    System.out.println(e.getMessage());
                    inputCheck = false;
                }finally{
                    keyboard = null;
                }

            }while(!inputCheck);

            myPassword = new PasswordGenerator();
            output = myPassword.getPassword(input);
            myPassword = null;
            System.out.println(output);
            passwordHistory.add("Name: "+input+", Password: "+output);
            
            do{
                System.out.print("Try Again (Y/N): ");
                keyboard = new Scanner(System.in);
                retry = keyboard.nextLine();

                if(!(retry.equalsIgnoreCase("Y")||retry.equalsIgnoreCase("N"))){
                    System.out.println("You need to enter either yes or no!");
                }

                keyboard = null;

            }while(!(retry.equalsIgnoreCase("Y")||retry.equalsIgnoreCase("N")));


        }while(retry.equalsIgnoreCase("Y"));

        System.out.println("\n***HISTORY***");
        for(String e : passwordHistory){
            System.out.println(e);
        }

        passwordHistory = null;

    }

}