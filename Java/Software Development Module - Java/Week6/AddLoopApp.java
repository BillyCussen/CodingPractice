/*
AddLoopApp.java
Billy Cussen
14/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class AddLoopApp {
    
    public static void main(String [] args){

        //Variables
        int input = 0;
        int output;
        boolean inputCheckAddLoop;

        //Object
        Scanner keyboard;
        AddLoop myAddLoop;

        do{
            inputCheckAddLoop = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter a number: ");
                input = keyboard.nextInt();
            }catch(InputMismatchException e){
                inputCheckAddLoop = false;
                System.out.println("You need to enter an integer");
            }finally{
                keyboard = null;
            }

        }while(!inputCheckAddLoop);

        myAddLoop = new AddLoop(input);
        output = myAddLoop.getOutput();
        myAddLoop = null;

        System.out.println("The result is: "+output);

    }

}