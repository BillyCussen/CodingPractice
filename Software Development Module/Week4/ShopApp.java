/*
ShopApp.java
Billy Cussen
10/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class ShopApp {
    
    public static void main(String[]args){

        //Variables
        int hoodies = 0;
        int tshirts = 0;
        int caps = 0;
        double total;
        boolean inputCheckShop;

        //Objects
        Shop myShop;
        Scanner keyboard;

        //Input
        do{
            try{
                inputCheckShop = true;
                keyboard = new Scanner(System.in);
                System.out.print("How many hoodies would you like: ");
                hoodies = keyboard.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Please enter the number of Hoodies you would like(e.g. 1)");
                inputCheckShop = false;
            }
        }while(!inputCheckShop);

        do{
            try{
                inputCheckShop = true;
                keyboard = new Scanner(System.in);
                System.out.print("How many tshirts would you like: ");
                tshirts = keyboard.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Please enter the number of Tshirts you would like(e.g. 1)");
                inputCheckShop = false;
            }
        }while(!inputCheckShop);

        do{
            try{
                inputCheckShop = true;
                keyboard = new Scanner(System.in);
                System.out.print("How many caps would you like: ");
                caps = keyboard.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Please enter the number of Caps you would like(e.g. 1)");
                inputCheckShop = false;
            }
        }while(!inputCheckShop);

        //Compute
        keyboard = null;
        myShop = new Shop(hoodies,tshirts,caps);
        myShop.computeTotal();

        //Output
        total = myShop.getTotal();
        System.out.println("The total of your purchase is: "+total);
    }

}