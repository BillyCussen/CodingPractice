/*
QueueApp.java
Billy Cussen
29/09/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class QueueApp{
    public static void main(String[]args){

        //Variables
        String repeat = "y";
        boolean inputCheck;
        int inputNumber = 0;

        //Objects
        Scanner keyboard;
        Queue<Integer> myQueue = new Queue<Integer>();

        System.out.println("***LINKED QUEUE APP***");

        //Input
        while(repeat.equalsIgnoreCase("Y")){

            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;
                try{
                    System.out.print("Please enter a Number: ");
                    inputNumber = keyboard.nextInt();

                    if(inputNumber <= 0){
                        throw new InputMismatchException();
                    }
                }catch(InputMismatchException | NumberFormatException e){
                    System.out.println("Please enter a Number (Integer e.g. 1, 2, 15) greater than 0");
                    inputCheck = false;
                } finally{
                    keyboard = null;
                }
            }while(!inputCheck);

            //Process
            myQueue.enQueue(inputNumber);

            repeat = "";

            while(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("E"))){
                keyboard = new Scanner(System.in);
                System.out.print("Please enter \"Y\" to Add another Number or \"E\" to Exit: ");
                repeat = keyboard.nextLine();
                if(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("E"))){
                    System.out.println("You need to enter \"Y\" or \"E\"");
                } 
                keyboard = null;
            }
        }

        //Output
        try{
            System.out.println("The First Element is (Using Peek Method): "+myQueue.peek());
            System.out.println("We are going to Test Removing an Item(Using deQueue Method): "+myQueue.deQueue()+"\n");
            System.out.println(myQueue.toString());
        }catch(QueueEmptyException e){
            System.out.println(e.getMessage());
        } finally{
            myQueue = null;
            System.gc();
        }
    }
}