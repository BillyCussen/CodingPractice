/*
DecryptApp.java
Billy Cussen
16/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class DecryptApp {
    public static void main(String [] args){

        //Variables
        String input = new String();
        String output;
        boolean inputCheck;

        //Objects
        Decrypt myDecrypt = new Decrypt();
        Scanner keyboard;

        //Input
        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter the String you want Decoded: ");
                input = keyboard.nextLine();

                if(input.length() < 5){
                    throw new InputMismatchException("You need to enter a String of a greater length than 5 characters");
                }
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
                inputCheck = false;
            } finally{
                keyboard = null;
            }

        }while(!inputCheck);

        output = myDecrypt.computeAndGetDecryption(input);
        myDecrypt = null;
        System.out.println(output);

    }

}