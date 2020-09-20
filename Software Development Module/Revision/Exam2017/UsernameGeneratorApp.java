/*
UsernameGeneratorApp.java
Billy Cussen
25/08/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class UsernameGeneratorApp{

    public static void main(String [] args){

        //Variables
        String fullname = new String();
        String[] fullNames;
        int amount = 0;
        boolean inputCheck;
        long startTime;
        long endTime;

        //Object
        Scanner keyboard; 
        UsernameGenerator myUsername;

        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;

            try{
                System.out.print("Enter how many Usernames you will Generate: ");
                amount = keyboard.nextInt();

                if(amount <= 0){
                    throw new InputMismatchException();
                }

            }catch(NumberFormatException | InputMismatchException e){
                System.out.println("You need to enter an Integer!");
                inputCheck = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);
        fullNames = new String[amount];

        //Input
        for(int i = 0; i < fullNames.length; i++){
            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;

                try{
                    System.out.print("Please enter your Full Name: ");
                    fullNames[i] = keyboard.nextLine();

                    if(fullNames[i].length() <= 0 || !fullNames[i].matches("^[a-zA-z ]*$")){
                        throw new InputMismatchException("You need to enter a full name, eg. John Doe");
                    }

                }catch(InputMismatchException e){
                    System.out.println(e.getMessage());
                    inputCheck = false;
                }finally{
                    keyboard = null;
                }

            }while(!inputCheck);
        }
        //Process & Output
        myUsername = new UsernameGenerator(fullNames);

        startTime = System.nanoTime();
        for(String e: myUsername.getUserName()){
            System.out.println(e);
        }
        endTime = System.nanoTime();
        System.out.println ("The function getUserName() (using a CharArray) took " + ((double)(endTime-startTime))+" nanoseconds\n");
        
        long startTime1 = System.nanoTime();
        for(String e: myUsername.getUserName1()){
            System.out.println(e);
        }
        long endTime1 = System.nanoTime();
        System.out.println ("The function getUserName1() (Using a StringBuffer) took " + ((double)(endTime1-startTime1))+" nanoseconds\n");

        long startTime2 = System.nanoTime();
        for(String e: myUsername.getUserName2()){
            System.out.println(e);
        }
        long endTime2 = System.nanoTime();
        System.out.println ("The function getUserName2() (Using a String) took " + ((double)(endTime2-startTime2))+" nanoseconds");

        myUsername = null;
    }

}