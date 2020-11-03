/*
EquilateralTriangleApp.java
Billy Cussen
07/08/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class EquilateralTriangleApp{

    public static void main(String[] args){

        //Variable
        double side = 0.0;
        String selection = new String();
        String result;
        boolean inputCheck;

        //Object
        Scanner keyboard;
        EquilateralTriangle myTriangle = new EquilateralTriangle();

        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;

            System.out.print("Enter either \"Area\" or \"Perimeter\": ");
            selection = keyboard.nextLine();

            if(!(selection.equalsIgnoreCase("Area")||selection.equalsIgnoreCase("Perimeter"))){
                System.out.println("Please make a valid selection!");
                inputCheck = false;
            }

            keyboard = null;

        }while(!inputCheck);

        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;

            try{
                System.out.print("Enter enter the Length of (each of) the Triangles Side(s): ");
                side = keyboard.nextDouble();

                if(side <= 0.0){
                    throw new InputMismatchException();
                }

            }catch(NumberFormatException | InputMismatchException e){
                System.out.println("Please enter a valid Length (i.e. a Number greater than 0)!");
                inputCheck = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);

        //Compute
        myTriangle.setSide(side);

        if(selection.equalsIgnoreCase("Area")){
            myTriangle.computeArea();
            result = myTriangle.getArea();
        } else{
            myTriangle.computePerimeter();
            result = myTriangle.getPerimeter();
        }

        myTriangle = null;
        System.out.println(result);

    }


}