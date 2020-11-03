/*
Room.java
Billy Cussen
07/07/2020
*/

//This class will accept the length and width of a room, as well as the cost of carpet per meter, returning the cost of carpeting the room

import java.util.Scanner;

public class Carpet {
    
    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the length of the room: ");
        double length = keyboard.nextDouble();

        System.out.print("Enter the width of the room: ");
        double width = keyboard.nextDouble();

        System.out.print("Enter the cost of carpet per meter: ");
        double costPerMeter = keyboard.nextDouble();
        keyboard = null;

        double costFinal = (length*width)*costPerMeter;

        System.out.println("The cost of carpeting the room is: "+costFinal);

    }

}