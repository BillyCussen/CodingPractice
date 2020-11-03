/*
EncoderApp.java
Billy Cussen
10/08/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class EncoderApp{

    public static void main(String [] args){

        //Variables
        String input;
        String output;
        boolean inputCheck;

        //Objects
        Scanner keyboard;
        Encoder myEncoder;

        do{
            input = new String();
            keyboard = new Scanner(System.in);
            inputCheck = true;

            try{
                System.out.print("Please enter your Input Sentance: ");
                input = keyboard.nextLine();

                if(input.length() <= 5){
                    throw new InputMismatchException("Your Sentance is too Short to Encode!");
                }

                for(int i = 0; i < input.length(); i++){

                    char ch = Character.toLowerCase(input.charAt(i));
                    if(!((ch >= 'a' || ch <= 'z') || ch == ' ' || ch == '.')|| Character.isDigit(ch)){
                        throw new InputMismatchException("Your Sentance can only contain Letters, Spaces and Full Stops!");
                    }

                }

            }catch(InputMismatchException e){
                inputCheck = false;
                System.out.println(e.getMessage());
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);

        myEncoder = new Encoder();
        output = myEncoder.getEncodedSentance(input);
        myEncoder = null;
        System.out.println(output);

    }

}