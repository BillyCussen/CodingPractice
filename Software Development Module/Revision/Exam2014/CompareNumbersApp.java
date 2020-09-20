/*
CompareNumbersApp.java
Billy Cussen
06/08/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class CompareNumbersApp{

    public static void main(String [] args){

        //Variables
        int a = 0;
        int b = 0;
        int result;
        boolean inputCheck;

        //Objects
        Scanner keyboard;
        CompareNumbers myNumbers;

        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter the Value of Number A: ");
                a = keyboard.nextInt();
            }catch(NumberFormatException | InputMismatchException e){
                inputCheck = false;
                System.out.println("You need to enter an Integer!");
            } finally{
                keyboard = null;
            }

        }while(!inputCheck);

        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter the Value of Number B: ");
                b = keyboard.nextInt();
            }catch(NumberFormatException | InputMismatchException e){
                inputCheck = false;
                System.out.println("You need to enter an Integer!");
            } finally{
                keyboard = null;
            }

        }while(!inputCheck);

        myNumbers = new CompareNumbers();
        result = myNumbers.getComparison(a, b);
        System.out.println(result);
    }

}