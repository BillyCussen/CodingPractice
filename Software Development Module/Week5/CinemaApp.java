/*
CinemaApp.java
Billy Cussen
13/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class CinemaApp {
    
    public static void main(String [] args){

        //Variables
        int age = 0;
        String result;
        boolean inputCheckCinema;

        //Object
        Scanner keyboard;
        Cinema myCinema;

        //Input
        do{

            inputCheckCinema = true;
            keyboard = new Scanner(System.in);

            try{

                System.out.print("Please enter your age: ");
                age = keyboard.nextInt();

                if(age < 0 || age > 117){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("You need to enter a number to denote your age!");
                inputCheckCinema = false;
            }

        }while(!inputCheckCinema);

        keyboard = null;

        //Process
        myCinema = new Cinema(age);
        myCinema.computePrice();

        //Output
        result = myCinema.getPrice();
        myCinema = null;
        System.out.println(result);
    }

}