/*
HelloApp.java
Billy Cussen
09/09/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class HelloApp{

    public static void main(String[] args){

        //Variables
        String language = new String();
        long endTime = 0, startTime = 0;
        boolean inputCheck;

        //Objects
        Scanner keyboard;
        HelloInterface myHello;
        System.out.println("***SAY HELLO APP***");
        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);
            try{
                System.out.print("Enter \"English\" or \"French\": ");
                language = keyboard.nextLine();
                if(!(language.equalsIgnoreCase("English")||language.equalsIgnoreCase("French"))){
                    throw new InputMismatchException("You need to enter either \"English\" or \"French\"");
                }
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
                inputCheck = false;
            } finally{
                keyboard = null;
            }
        }while(!inputCheck);

        if(language.equalsIgnoreCase("English")){
            startTime = System.currentTimeMillis();
            myHello = new EnglishHello();
            endTime = System.currentTimeMillis();
            System.out.println(myHello.sayHello());
        } else{
            startTime = System.currentTimeMillis();
            myHello = new FrenchHello();
            endTime = System.currentTimeMillis();
            System.out.println(myHello.sayHello());
        }
        System.out.println("The Hello App took "+(endTime-startTime)+" milliseconds");
        myHello = null;

    }

}