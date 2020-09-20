/*
SchoolSuppliesApp.java
Billy Cussen
10/08/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class SchoolSuppliesApp{

    public static void main(String [] args){

        //Variable
        int supplyTypes = 0;
        int[] supplyQuantity;
        double[] supplyCost;
        String total;
        boolean inputCheck;

        //Objects
        Scanner keyboard;
        SchoolSupplies mySchoolSupplies;

        //Input
        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);
            
            try{
                System.out.print("Please enter the number of Supply Types you will be requesting: ");
                supplyTypes = keyboard.nextInt();

                if(supplyTypes <= 0){
                    throw new InputMismatchException();
                }
            }catch(InputMismatchException | NumberFormatException e){
                inputCheck = false;
                System.out.println("You need to enter a number greater than 0");
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);

        supplyQuantity = new int[supplyTypes];
        supplyCost = new double[supplyTypes];

        do{

            for(int i = 0; i < supplyQuantity.length; i++){

                inputCheck = true;
                keyboard = new Scanner(System.in);

                try{
                    
                    System.out.print("Please enter the quantity of Supply type "+(i+1)+" that you require: ");
                    supplyQuantity[i] = keyboard.nextInt();

                    if(supplyQuantity[i] <= 0){
                        throw new InputMismatchException();
                    }
                }catch(InputMismatchException | NumberFormatException e){
                    inputCheck = false;
                    System.out.println("You need to enter a number greater than 0");
                }finally{
                    keyboard = null;
                }

            }

        }while(!inputCheck);

        do{

            for(int i = 0; i < supplyCost.length; i++){

                inputCheck = true;
                keyboard = new Scanner(System.in);

                try{
                    
                    System.out.print("Please enter the Cost of Supply type "+(i+1)+": ");
                    supplyCost[i] = keyboard.nextDouble();

                    if(supplyCost[i] <= 0){
                        throw new InputMismatchException();
                    }
                }catch(InputMismatchException | NumberFormatException e){
                    inputCheck = false;
                    System.out.println("You need to enter a number greater than 0");
                }finally{
                    keyboard = null;
                }

            }

        }while(!inputCheck);

        //Process
        mySchoolSupplies = new SchoolSupplies();
        total = mySchoolSupplies.calculateSchoolSupplies(supplyQuantity,supplyCost);
        mySchoolSupplies = null;
        System.out.println(total);
    }

}