/*
BinApp.java
Billy Cussen
20/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class BinApp {

    public static void main(String[]args){

        //Variables
        String binColor = new String();
        int apartmentNumber = 0;
        String result;
        String restart;
        boolean inputCheckColor;
        boolean inputCheckApartmentNumber;

        //Objects
        Scanner keyboard;
        Bin myBin;

        //Input
        do{
            restart = new String();
            keyboard = new Scanner(System.in);

            do{
                inputCheckColor = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Please enter your Bin Color(Green, Black or Brown): ");
                    binColor = keyboard.nextLine();

                    if(!(binColor.equalsIgnoreCase("Green") || binColor.equalsIgnoreCase("Black") || binColor.equalsIgnoreCase("Brown"))){
                        throw new InputMismatchException();
                    }

                }catch(InputMismatchException e){
                    System.out.println("Please enter Either Green, Black or Brown");
                    inputCheckColor = false;
                } finally{
                    keyboard = null;
                }
                
            }while(!inputCheckColor);

            do{
                inputCheckApartmentNumber = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Please enter your Apartment Number: ");
                    apartmentNumber = keyboard.nextInt();

                    if(apartmentNumber <= 0){
                        throw new InputMismatchException();
                    }

                }catch(InputMismatchException e){
                    System.out.println("Please enter a valid Apartment Number (e.g. 1, 12)");
                    inputCheckApartmentNumber = false;
                } finally{
                    keyboard = null;
                }
                
            }while(!inputCheckApartmentNumber);

            //Process
            myBin = new Bin(binColor,apartmentNumber);
            result = myBin.computeAndGetDay();
            myBin = null;
            //Output
            System.out.println(result);

            do{
                
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Would you like to Retry (Y or N)?: ");
                    restart = keyboard.nextLine();

                    if(!(restart.equalsIgnoreCase("Y") || restart.equalsIgnoreCase("N"))){
                        throw new InputMismatchException();
                    }

                }catch(InputMismatchException e){
                    System.out.println("Please enter either Y or N");
                } finally{
                    keyboard = null;
                }

            }while(!(restart.equalsIgnoreCase("Y") || restart.equalsIgnoreCase("N")));

        }while(restart.equalsIgnoreCase("Y"));

    }

}