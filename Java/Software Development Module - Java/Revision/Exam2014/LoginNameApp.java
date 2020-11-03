/*
LoginNameApp.java
Billy Cussen
06/08/2020
*/

import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;

public class LoginNameApp{

    public static void main(String [] args){

        //Variables
        String fullName = new String();
        String userName;
        String repeat = new String();
        boolean inputCheck;

        //Object
        LinkedList<String> usernameHistory = new LinkedList<String>();
        Scanner keyboard;
        LoginName myLogin;

        //Input
        do{
        
            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Please enter your full name: ");
                    fullName = keyboard.nextLine();

                    //This regex checks for Alphabetical Characters and Spaces
                    //Included for verification purposes in the context of a coding exercise, I'm aware people can have different kinds of names IRL :)
                    if(!fullName.matches("^[a-zA-z ]*$") || fullName.length() <= 0){
                        throw new InputMismatchException();
                    }

                }catch(InputMismatchException e){
                    inputCheck = false;
                    System.out.println("Please enter a valid name");
                } finally{
                    keyboard = null;
                }

            }while(!inputCheck);

            myLogin = new LoginName();
            userName = myLogin.computeLoginName(fullName);
            myLogin = null;
            System.out.println(fullName+"'s username is: "+userName);
            usernameHistory.add("Full Name: "+fullName+", Username: "+userName);

            do{
                keyboard = new Scanner(System.in);

                System.out.print("Please enter if you would like to enter more (Y or N): ");
                repeat = keyboard.nextLine();

                if(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N")){
                    System.out.println("Please enter either Y or N");
                }

                keyboard = null;

            }while(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N")));

        }while(repeat.equalsIgnoreCase("Y"));

        System.out.println("\n***HISTORY***");

        for(String e: usernameHistory){
            System.out.println(e);
        }

        usernameHistory = null;

    }

}