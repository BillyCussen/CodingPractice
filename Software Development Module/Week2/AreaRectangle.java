/*
AreaRectangle.java
Billy Cussen
07/07/2020
*/

//This class will ask the user for the length and width of a Rectangle and produce its Area

import java.util.Scanner;

public class AreaRectangle{

    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle: ");
        double length = keyboard.nextDouble();

        System.out.print("Enter the width of the Rectangle: ");
        double width = keyboard.nextDouble();
        keyboard = null;

        double area = length*width;

        System.out.println("The area of the Rectangle is: "+area);
    }

}