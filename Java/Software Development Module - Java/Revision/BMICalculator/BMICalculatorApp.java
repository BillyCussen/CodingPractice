/*
BMICalculatorApp.java
Billy Cussen
30/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigDecimal;

public class BMICalculatorApp{

    public static void main(String[]args){

        //Variables
        double height = 0.0;
        double weight = 0.0;
        String BMI;
        boolean inputCheck;

        //Object
        Scanner keyboard;
        BMICalculator myBMI;

        //Input
        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter your height in Metres (e.g. 1.56): ");
                height = keyboard.nextDouble();

                if((BigDecimal.valueOf(height).scale() > 2)){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException | NumberFormatException e){
                inputCheck = false;
                System.out.println("Please enter your Height in Metres with up to 2 Decimal Places please (e.g. 1.53)");
            } finally{
                keyboard = null;
            }

        }while(!inputCheck);

        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter your Weight in KG (e.g. 70.5): ");
                weight = keyboard.nextDouble();

                if((BigDecimal.valueOf(weight).scale() > 2)){
                    throw new InputMismatchException();
                }


            }catch(InputMismatchException | NumberFormatException e){
                inputCheck = false;
                System.out.println("Please enter your Weight in KG with up to 2 Decimal Places please (e.g. 70.50)");
            }

        }while(!inputCheck);

        myBMI = new BMICalculator(weight, height);
        BMI = myBMI.getBMI();
        myBMI = null;
        System.out.println(BMI);
    }

}