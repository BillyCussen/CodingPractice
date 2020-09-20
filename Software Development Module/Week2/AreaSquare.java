/*
AreaSquare.java
Billy Cussen
07/07/2020
*/

import java.util.Scanner;

public class AreaSquare {
    
    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the length of the Squares sides: ");
        double side = keyboard.nextDouble();
        keyboard = null;

        double area = Math.pow(side,2);
        System.out.println("The area of the Square is: "+area);
    }
}