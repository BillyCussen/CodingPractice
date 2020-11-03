/*
PrinterApp.java
Billy Cussen
15/09/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class PrinterApp{
    public static void main(String [] args){

        String repeat = new String(), printType = new String(), output = new String();
        boolean inputCheck;

        Scanner keyboard;
        PrinterInterface myPrinter;

        do{

            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Print in \"Colour\" or \"None\": ");
                    printType = keyboard.nextLine();

                    if(!(printType.equalsIgnoreCase("Colour")||printType.equalsIgnoreCase("Color")||printType.equalsIgnoreCase("None"))){
                        throw new InputMismatchException("Please enter either \"Colour\" or \"None\"");
                    }

                }catch(InputMismatchException e){
                    inputCheck = false;
                    System.out.println(e.getMessage());
                }finally{
                    keyboard = null;
                }

            }while(!inputCheck);

            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Enter what you would like to Print: ");
                    output = keyboard.nextLine();

                    if(output.length()<=0){
                        throw new InputMismatchException("Please enter a few words or a Sentance!");
                    }

                }catch(InputMismatchException e){
                    inputCheck = false;
                    System.out.println(e.getMessage());
                }finally{
                    keyboard = null;
                }

            }while(!inputCheck);

            myPrinter = new ConcretePrinter();

            if(printType.equalsIgnoreCase("Colour")||printType.equalsIgnoreCase("Color")){
                myPrinter.printColor(output);
            } else{
                myPrinter.printBW(output);
            }

            myPrinter = null;

            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Enter if you would like to Print again or Not (\"Y\" or \"N\"): ");
                    repeat = keyboard.nextLine();

                    if(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N"))){
                        throw new InputMismatchException("You need to enter \"Y\" to repeat, Enter \"N\" to Quit!");
                    }

                }catch(InputMismatchException e){
                    inputCheck = false;
                    System.out.println(e.getMessage());
                }finally{
                    keyboard = null;
                }

            }while(!inputCheck);

            if(repeat.equalsIgnoreCase("N")){
                System.out.println("\u001B[36m"+"Thanks "+"\u001B[35m"+"for "+"\u001B[33m"+"using "+"\u001B[31m"+"the "+"\u001B[30m"+"\u001B[40m"+"\u001B[37m"+"Printer App!"+"\u001B[0m"+" :)");
            }

        }while(repeat.equalsIgnoreCase("Y"));

        
    }
}