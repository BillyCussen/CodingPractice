/*
BakeryApp.java
Billy Cussen 
09/07/2020
*/

//This is the App Class for Bakery.java. This is the executable class

import java.util.InputMismatchException;
import java.util.Scanner;

public class BakeryApp {
    
    public static void main(String[]args){

        //Variables
        int items = 0;
        int boxes;
        int trips;
        boolean inputCheckItems;

        //Objects
        Bakery myBakery;
        Scanner keyboard;

        //Input
        do{

            keyboard = new Scanner(System.in);
            inputCheckItems = true;

            try{
                System.out.print("Please enter how many Items there are today: ");
                items = keyboard.nextInt();
            }catch(InputMismatchException e){
                System.out.println("You need to enter an Integer (e.g. 4). Please try again: ");
                inputCheckItems = false;
            }

        }while(!inputCheckItems);

        keyboard = null;

        //Process
        myBakery = new Bakery(items);
        myBakery.computeBoxesAndTrips();
        
        //Output
        boxes = myBakery.getBoxes();
        trips = myBakery.getTrips();
        myBakery = null;

        System.out.println("Total Items: "+items+"\nTotal Boxes: "+boxes+"\nTotal Trips: "+trips);
    }
}