/*
CountingApp.java
Billy Cussen
15/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class CountingApp {
    
    public static void main(String [] args){

        //Variables
        String input = new String();
        String result;
        boolean inputCheckCounting;

        //Objects
        Scanner keyboard;
        Counting myCounting;

        do{
            inputCheckCounting = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter a sentance: ");
                input = keyboard.nextLine();

                if(input.length() < 5){
                    throw new InputMismatchException("Your input needs to be more than 5 characters in length");
                }

            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
                inputCheckCounting = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheckCounting);

        myCounting = new Counting(input);

        result = myCounting.computeAndGetOutput();
        myCounting = null;
        System.out.println(result);
    }

}