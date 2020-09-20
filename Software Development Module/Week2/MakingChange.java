/*
MakingChange.java
Billy Cussen
07/07/2020
*/

import java.util.Scanner;

public class MakingChange {
    
    public static void main(String [] args){

        String retry;

        do{

            Scanner keyboard = new Scanner(System.in);
            int fiftyEuro = 0, twentyEuro = 0, tenEuro = 0, fiveEuro = 0, twoEuro = 0, oneEuro = 0, fiftyCent = 0, twentyCent = 0, tenCent = 0, fiveCent = 0, twoCent = 0, oneCent = 0;
            double change = 0, changeTemp = 0;
            boolean checkAmount = false;
            retry = new String();

            do{
                System.out.print("Enter the cost of the Transaction: ");
                double cost = keyboard.nextDouble();
                
                System.out.print("Enter how much the customer has presented: ");
                double customer = keyboard.nextDouble();

                if(customer >= cost){
                    checkAmount = true;  
                    change = (double) Math.round((customer-cost) * 100.0) / 100.0;
                    changeTemp = change;
                }else{
                    System.out.println("The customer has not provided enough money, please ask again");
                }
            }while(!checkAmount);

            System.out.println("The customers total change is: "+change);

            while(changeTemp >= 50){
                changeTemp -= 50;
                fiftyEuro++;
            }

            if(fiftyEuro>0){
                System.out.println("50 notes in change: "+fiftyEuro);
            }

            while(changeTemp >= 20){
                changeTemp -= 20;
                twentyEuro++;
            }

            if(twentyEuro>0){
                System.out.println("20 notes in change: "+twentyEuro);
            }

            while(changeTemp >= 10){
                changeTemp -= 10;
                tenEuro++;
            }

            if(tenEuro>0){
                System.out.println("10 notes in change: "+tenEuro);
            }

            while(changeTemp >= 5){
                changeTemp -= 5;
                fiveEuro++;
            }

            if(fiveEuro>0){
                System.out.println("5 notes in change: "+fiveEuro);
            }

            while(changeTemp >= 2){
                changeTemp -= 2;
                twoEuro++;
            }

            if(twoEuro>0){
                System.out.println("2 euro coins in change: "+twoEuro);
            }

            while(changeTemp >= 1){
                changeTemp -= 1;
                oneEuro++;
            }

            if(oneEuro>0){
                System.out.println("1 euro coins in change: "+oneEuro);
            }

            while(changeTemp >= .5){
                changeTemp -= .5;
                fiftyCent++;
            }

            if(fiftyCent>0){
                System.out.println("50 cent coins in change: "+fiftyCent);
            }

            while(changeTemp >= .2){
                changeTemp -= .2;
                twentyCent++;
            }

            if(twentyCent>0){
                System.out.println("20 cent coins in change: "+twentyCent);
            }

            while(changeTemp >= .1){
                changeTemp -= .1;
                tenCent++;
            }

            if(tenCent>0){
                System.out.println("10 cent coins in change: "+tenCent);
            }

            while(changeTemp >= .05){
                changeTemp -= .05;
                fiveCent++;
            }

            if(fiveCent>0){
                System.out.println("5 cent coins in change: "+fiveCent);
            }

            while(changeTemp >= .02){
                changeTemp -= .02;
                twoCent++;
            }

            if(twoCent>0){
                System.out.println("2 cent coins in change: "+twoCent);
            }

            while(changeTemp >= .01){
                changeTemp -= .01;
                oneCent++;
            }

            if(oneCent>0){
                System.out.println("1 cent coins in change: "+oneCent);
            }
            

            while(!(retry.equalsIgnoreCase("Y")||retry.equalsIgnoreCase("N"))){

                System.out.print("Process another Transaction (Y/N): " );
                retry = keyboard.next();

            }

            keyboard = null;

        }while(retry.equalsIgnoreCase("Y"));
    }

}