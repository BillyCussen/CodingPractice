/*
AverageApp.java
Billy Cussen
18/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class AverageApp {
    
    public static void main(String [] args){

        //Variables
        int[] input;
        int arraySize = 0;
        String output;
        boolean inputCheckAverage;

        //Objects
        Scanner keyboard;
        Average myAverage;

        //Input
        do{
            inputCheckAverage = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter the size of your Array: ");
                arraySize = keyboard.nextInt();

                if(arraySize <= 2 || arraySize > 10){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("You need to enter an integer greater than 2 and less than 11");
                inputCheckAverage = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheckAverage);

        input = new int[arraySize];

        for(int i = 0; i < input.length; i++){

            do{
                inputCheckAverage = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Please enter number "+(i+1)+" of your Array: ");
                    input[i] = keyboard.nextInt();

                    if(input[i] <= 0){
                        throw new InputMismatchException();
                    }

                }catch(InputMismatchException f){
                    System.out.println("You need to enter an Integer that is also greater than 0");
                    inputCheckAverage = false;
                } finally{
                    keyboard = null;
                }

            }while(!inputCheckAverage);

        }

        myAverage = new Average(input);

        //Process & Output
        output = myAverage.computeAverage();
        myAverage = null;
        System.out.println(output);
    }

}