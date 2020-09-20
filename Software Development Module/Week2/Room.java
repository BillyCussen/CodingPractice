/*
Room.java
Billy Cussen
07/07/2020
*/

//This class will accept the length and width of a room, returning it area and perimeter

import java.util.Scanner;

public class Room {
    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the length of the Room: ");
        double length = keyboard.nextDouble();

        System.out.print("Enter the Width of the Room: ");
        double width = keyboard.nextDouble();
        keyboard = null;

        double area = length*width;
        double perimeter = 2 * (length+width);

        System.out.println("The area of the room is: "+area);
        System.out.println("The perimeter of the room is: "+perimeter);

    }

}