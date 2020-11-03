/*
ReplaceApp.java
Billy Cussen
20/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class ReplaceApp {
    public static void main(String[]args){

        //Variables
        String input = new String();
        String output;
        boolean inputCheck;

        //Objects
        Replace myReplace;
        Scanner keyboard;

        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Enter a String with more than 5 characters: ");
                input = keyboard.nextLine();

                if(input.length() <= 5){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("You need to input a String of length greater than 5 characters");
                inputCheck = false;
            } finally{
                keyboard = null;
            }

        }while(!inputCheck);

        //Process
        myReplace = new Replace(input);
        output = myReplace.getOutput();
        myReplace = null;

        //Output
        System.out.println(output);

    }
}