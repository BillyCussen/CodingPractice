/*
NumbersApp.java
Billy Cussen 
08/07/2020
*/

//This is the App Class for Numbers.java. This is the executable class

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersApp {
    
    public static void main(String[]args){

        //Variables
        int a = 0, b = 0, sum;
        boolean checkInputA, checkInputB;

        //Objects
        Scanner keyboard;
        Numbers myNumbers = new Numbers();

        //Input
        do{

            checkInputA = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter number A: ");
                a = keyboard.nextInt();

            }catch(InputMismatchException e){
                System.out.println("This is not an Integer, please try again");
                checkInputA = false;
            }

        }while(!checkInputA);

        do{

            checkInputB = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter number B: ");
                b = keyboard.nextInt();

            }catch(InputMismatchException e){
                System.out.println("This is not an Integer, please try again");
                checkInputB = false;
            }

        }while(!checkInputB);

        //Setters
        myNumbers.setA(a);
        myNumbers.setB(b);

        //Compute
        myNumbers.computeSum();

        //Output
        sum = myNumbers.getSum();

        System.out.println("The sum of "+a+" and "+b+" is: "+sum);

    }
}