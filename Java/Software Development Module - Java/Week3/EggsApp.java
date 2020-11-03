/*
EggsApp.java
Billy Cussen
08/07/2020
*/

//This is the App Class for Eggs.java. This is the executable class

import java.util.InputMismatchException;
import java.util.Scanner;

public class EggsApp {

    public static void main(String [] args){

        //Variables
        int eggs = 0, remainder, boxes;
        boolean checkInputEggs;

        //Objects
        Scanner keyboard;
        Eggs myEggs = new Eggs();

        //Input
        do{
            keyboard = new Scanner(System.in);
            checkInputEggs = true;

            try{
                System.out.print("Please enter collected eggs for today: ");
                eggs = keyboard.nextInt();
            } catch(InputMismatchException e){
                System.out.println("You need to enter eggs collected as an Integer (e.g. 24)");
                checkInputEggs = false;
            }

        }while(!checkInputEggs);

        //Setter
        myEggs.setEggs(eggs);

        //Compute
        myEggs.computeBoxes();

        //Output
        boxes = myEggs.getBoxes();
        remainder = myEggs.getRemainder();

        System.out.println("You collected "+eggs+" today.");
        System.out.println("There are "+boxes+" boxes, with "+remainder+" eggs remaining");

    }
}