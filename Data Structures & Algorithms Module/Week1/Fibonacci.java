/*
Fibonacci.java
Billy Cussen
09/09/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Fibonacci{

    public static void fib(int num){
        int a = 0, b = 1;
        System.out.println("The Number is "+a+" at position "+1);
        System.out.println("The Number is "+b+" at position "+2);
        for(int i = 2; i <= num ; i++){
            int c = a + b;
            System.out.println("The Number is "+c+" at position "+(i+1));
            a = b; 
            b = c;
        }
    }

    public static void main(String [] args){

        //Variables
        int input = 0;
        boolean inputCheck;

        //Object
        Scanner keyboard;
        System.out.println("***FIBONACCI SEQUENCE APP***");

        //Input
        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;
            try{
                System.out.print("Please enter a Number: ");
                input = keyboard.nextInt();
                if(input < 2){
                    throw new InputMismatchException();
                }
            }catch(InputMismatchException|NumberFormatException e){
                System.out.println("Please enter an Integer that is greater than 2");
                inputCheck = false;
            }
        }while(!inputCheck);

        //Process & Output
        long startTime = System.currentTimeMillis();
        fib(input);
        long endTime = System.currentTimeMillis();
        System.out.println("This Function took "+(endTime-startTime)+" milliseconds");
    }
}