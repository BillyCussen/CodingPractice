/*
MonthsApp.java
Billy Cussen
13/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class MonthsApp {
    
    public static void main(String [] args){

        //Variables
        int input = 0;
        String output;
        boolean inputCheckMonths;

        //Object
        Scanner keyboard;
        Months myMonth;

        //Input
        do{
            inputCheckMonths = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Pleas enter a month numerically (e.g. 1 for January, 12 for December): ");
                input = keyboard.nextInt();

                if(input <= 0 || input > 12){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("You need to enter an integer between 1 and 12, please try again!");
                inputCheckMonths = false;
            }

        }while(!inputCheckMonths);

        keyboard = null;
        myMonth = new Months(input);

        //Process
        myMonth.computeDays();

        //Output
        output = myMonth.getOutput();
        myMonth = null;
        System.out.println(output);

    }


}