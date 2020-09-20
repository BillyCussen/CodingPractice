/*
EncoderApp.java
Billy Cussen
03/08/2020
*/

import java.util.Scanner;
import java.util.LinkedList;

public class EncoderApp{

    public static void main(String [] args){

        //Variables
        String inputWord = new String();
        String encodedWord;
        String repeatCheck = new String();
        boolean inputCheck;

        //Object
        Scanner keyboard;
        Encoder myEncoder;
        LinkedList<String> encodeHistory = new LinkedList<String>();

        do{
            repeatCheck = new String();
            keyboard = new Scanner(System.in);

            //Input
            do{
                inputCheck = true;

                System.out.print("Please enter the word to be encoded: ");
                inputWord = keyboard.nextLine();

                for(int i = 0; i < inputWord.length();i++){
                    if(inputWord.charAt(i)==' '){
                        System.out.println("You need to enter a valid word (No Spaces)");
                        inputCheck = false;
                        break;
                    }
                }

            }while(!inputCheck);

            //Process
            myEncoder = new Encoder();
            encodedWord = myEncoder.getEncodedWord(inputWord);
            encodeHistory.add("Input Word: "+inputWord+", Encoded Word: "+encodedWord);
            myEncoder = null;

            //Output
            System.out.println(encodedWord);

            do{
                inputCheck = true;
                System.out.print("Would you like to retry (Enter Y or N)");
                repeatCheck = keyboard.nextLine();

                if(!(repeatCheck.equalsIgnoreCase("Y")||repeatCheck.equalsIgnoreCase("N"))){
                    System.out.println("You need to enter Y or N!");
                    inputCheck = false;
                }

            }while(!inputCheck);

            keyboard = null;

        }while(repeatCheck.equalsIgnoreCase("Y"));

        System.out.println("\nHISTORY");
        for(String s : encodeHistory){
            System.out.println(s);
        }

        encodeHistory = null;
    }

}