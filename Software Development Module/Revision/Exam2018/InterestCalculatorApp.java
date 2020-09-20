/*
InterestCalculatorApp.java
Billy Cussen
03/09/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class InterestCalculatorApp{

    public static void main(String [] args){

        //Variables
        boolean inputCheck;
        boolean accessMoney = true;
        double amount = 0.0; 
        double[] allInterest;
        int allInterestLength = 0;
        int months = 0;
        String retry = new String();

        //Objects
        InterestCalculator myInterestCalculator = new InterestCalculator();
        Scanner keyboard;
        
        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);
            try{
                System.out.print("Please enter the number of Deposits to be Checked: ");
                allInterestLength = keyboard.nextInt();
                if(allInterestLength <= 0 || allInterestLength > 10){
                    throw new InputMismatchException();
                }
            }catch(InputMismatchException e){
                System.out.println("You can check between 1 and 10 Deposits at a Time");
                inputCheck = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);

        allInterest = new double[allInterestLength];

        for(int i = 0; i < allInterest.length; i++){

            //Input
            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);
                try{
                    System.out.print("Please enter amount to be Deposited (Minimum is 1000/Max is 100000): ");
                    amount = keyboard.nextDouble();
                    if(amount < 1000 || amount > 100000){
                        throw new InputMismatchException();
                    }
                }catch(InputMismatchException e){
                    System.out.println("You need to enter a number to Note the amount to be Deposit");
                    inputCheck = false;
                }finally{
                    keyboard = null;
                }
            }while(!inputCheck);

            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);
                try{
                    System.out.print("Please enter Months for Fixed Term Account Type (6,12 or 18): ");
                    months = keyboard.nextInt();
                    if(!(months == 6 || months == 12 || months == 18)){
                        throw new InputMismatchException();
                    }
                }catch(InputMismatchException | NumberFormatException e){
                    System.out.println("You need to enter 6, 8 or 12.");
                    inputCheck = false;
                } finally{
                    keyboard = null;
                }
            }while(!inputCheck);

            do{
                String answer = new String();
                inputCheck = true;
                keyboard = new Scanner(System.in);
                try{
                    System.out.print("Please enter Months for Fixed Term Account Type (\"Y\" or \"N\"): ");
                    answer = keyboard.nextLine();
                    if(!(answer.equalsIgnoreCase("Y")||answer.equalsIgnoreCase("N"))){
                        throw new InputMismatchException();
                    }

                    if(answer.equalsIgnoreCase("Y")){
                        accessMoney = true;
                    }else{
                        accessMoney = false;
                    }

                }catch(InputMismatchException | NumberFormatException e){
                    System.out.println("You need to enter \"Y\" or \"N\"");
                    inputCheck = false;
                } finally{
                    keyboard = null;
                }
            }while(!inputCheck);

            //Process & Output
            myInterestCalculator = new InterestCalculator();
            
            try{
                System.out.println("Total Interest based on the above is: "+myInterestCalculator.getInterest(amount,months,accessMoney));
            }catch(InputMismatchException e){
                System.out.println(e);
            } finally{
                allInterest[i] = myInterestCalculator.getInterest(amount,months,accessMoney);
            }
        }

        System.out.println("The Highest Interest to be paid is: "+myInterestCalculator.getHighestInterest(allInterest));
        myInterestCalculator = null;

    }

}