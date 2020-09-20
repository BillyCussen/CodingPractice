/*
EncryptApp.java
15/07/2020
Billy Cussen
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class EncryptApp {
    public static void main(String[]args){

        //Variables
        String input = new String();
        String output;
        boolean inputCheckEncrypt;

        //Object
        Scanner keyboard;
        Encrypt myEncryption;

        //Input;
        do{
            inputCheckEncrypt = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter a sentance: ");
                input = keyboard.nextLine();

                if(input.length() < 5){
                    throw new InputMismatchException("Please enter an input with a length of longer than 5");
                }

            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
                inputCheckEncrypt = false;
            } finally{
                keyboard = null;
            }

        }while(!inputCheckEncrypt);

        myEncryption = new Encrypt();
        myEncryption.setInput(input);

        //Compute
        myEncryption.encryptInput();

        //Ouput
        output = myEncryption.getOutput();
        myEncryption = null;
        System.out.println(output);

    }
}