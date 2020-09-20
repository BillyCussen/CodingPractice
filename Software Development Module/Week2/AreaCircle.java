/*
AreaCircle.java
Billy Cussen
07/07/2020
*/

//This class will ask the user for the Radius of a Circle and produce its Area


import java.util.Scanner;

public class AreaCircle {
    public static void main(final String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the radius of the Circle: ");
        double radius = keyboard.nextDouble();
        keyboard = null;
        
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of the Circle is: "+area);


    }
}