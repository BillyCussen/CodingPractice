/*
SentanceEncoderApp.java
Billy Cussen
02/09/2020
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class SentanceEncoderApp{

    public static void main(String [] args){

        //Variables
        String inputSentance = new String();
        boolean inputCheck, spaceCheck, dotCheck;

        //Objects
        Scanner keyboard;
        SentanceEncoder mySentanceEncoder;

        do{
            inputCheck = true;
            spaceCheck = false;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Enter the Sentance to be Encoded: ");
                inputSentance = keyboard.nextLine();

                for(int i = 0; i < inputSentance.length(); i++){
                    if(inputSentance.charAt(i)==' '){
                        spaceCheck = true;
                        break;
                    }
                }

                if(!(spaceCheck && inputSentance.charAt(inputSentance.length()-1)=='.' && inputSentance.length() >= 8)){
                    throw new InputMismatchException("You need to enter a Sentance with a Full Stop at the end and a Character length of 8 or Greater!");
                }

            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
                inputCheck = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);

        //Process & Output
        mySentanceEncoder = new SentanceEncoder();
        long startTime = System.currentTimeMillis();
        mySentanceEncoder.getEncodedSentance(inputSentance);
        long endTime = System.currentTimeMillis();
        System.out.println("This function took: "+(endTime-startTime)+" milliseconds");

        mySentanceEncoder = null;

    }

}