/*
PayApp.java
Billy Cussen 
09/07/2020
*/

//This is the executable class that invokes Pay.java

import java.util.Scanner;
import java.util.InputMismatchException;

public class PayApp {
    
    public static void main(String[]args){

        //Variables
        double payRatePerHour = 0.0;
        double hoursPerWeek = 0;
        double overtimeHoursPerWeek = 0;
        double totalPayPerWeek;
        boolean inputCheck;

        //Objects
        Pay myPay;
        Scanner keyboard;

        //Input
        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter your Pay Rate Per Hour: ");
                payRatePerHour = keyboard.nextDouble();
            } catch(InputMismatchException e){
                System.out.println("Please enter a Number");
                inputCheck = false;
            }
        }while(!inputCheck);

        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter How many Hours you have worked this week: ");
                hoursPerWeek = keyboard.nextDouble();
            } catch(InputMismatchException e){
                System.out.println("Please enter a Number");
                inputCheck = false;
            }
        }while(!inputCheck);

        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter How many Overtime Hours you have worked this week: ");
                overtimeHoursPerWeek = keyboard.nextDouble();
            } catch(InputMismatchException e){
                System.out.println("Please enter a Number");
                inputCheck = false;
            }
        }while(!inputCheck);

        keyboard = null;
        //Process
        myPay = new Pay(payRatePerHour,hoursPerWeek,overtimeHoursPerWeek);
        myPay.computeTotalPay();

        //Output
        totalPayPerWeek = myPay.getTotalPay();
        myPay = null;
        System.out.println("Your total Pay for the week is: "+totalPayPerWeek);
    }

}