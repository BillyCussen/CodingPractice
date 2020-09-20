/*
DecoderApp.java
Billy Cussen
04/08/2020
*/

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class DecoderApp{

    public static void main(String [] args){

        //Variables
        String inputWord = new String();
        String outputWord = new String();
        String repeatCheck;
        boolean inputCheck;
        
        //Object
        List<String> wordHistory = new LinkedList<String>();
        Scanner keyboard;
        Decoder myDecoder;

        //Input
        do{
        
            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);

                System.out.print("Enter the Word to be Decoded: ");
                inputWord = keyboard.nextLine();

                for(int i = 0; i < inputWord.length(); i++){

                    if(inputWord.charAt(i) == ' '){
                        System.out.println("Please enter a valid Word!");
                        inputCheck = false;
                        keyboard = null;
                        break;
                    }

                }

            }while(!inputCheck);

            //Process
            myDecoder = new Decoder();
            outputWord = myDecoder.getDecodedWord(inputWord);
            wordHistory.add("Input Word "+(wordHistory.size()+1)+": "+inputWord+", Output Word: "+outputWord);
            keyboard = null;
            myDecoder = null;

            //Output
            System.out.println(outputWord+"\n");
            

            do{
                keyboard = new Scanner(System.in);


                System.out.print("Please enter if you would like to Continue(Y or N): ");
                repeatCheck = keyboard.nextLine();

                if(!(repeatCheck.equalsIgnoreCase("Y")||repeatCheck.equalsIgnoreCase("N"))){
                    System.out.println("Please enter Y or N!");
                    keyboard = null;
                }     

            }while(!(repeatCheck.equalsIgnoreCase("Y")||repeatCheck.equalsIgnoreCase("N")));

        }while(repeatCheck.equalsIgnoreCase("Y"));
        
        keyboard = null;

        System.out.println("\n***HISTORY***");
        for(String word: wordHistory){
            System.out.println(word);
        }

        wordHistory = null;

    }

}