/*
PolymorphismApp.java
Billy Cussen
22/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class PolymorphismApp {
    
    public static void main(String[] args){

        //Variables
        String language = new String();
        String output;
        boolean inputCheck;

        //Object
        Scanner keyboard;
        //Language myLanguage = new Language();
        //System.out.println(myLanguage.speak());
        //myLanguage = null;

        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please select a Language (English, French, German): ");
                language = keyboard.nextLine();

                if(!(language.equalsIgnoreCase("English")||language.equalsIgnoreCase("French")||language.equalsIgnoreCase("German"))){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("Enter one of the languages indicated");
                inputCheck = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);

        if(language.equalsIgnoreCase("English")){
            English myLanguage = new English();
            System.out.println(myLanguage.speak());
            myLanguage = null;

        } else if(language.equalsIgnoreCase("French")){
            French myLanguage = new French();
            System.out.println(myLanguage.speak());
            myLanguage = null;
        }else{
            German myLanguage = new German();
            System.out.println(myLanguage.speak());
            myLanguage = null;
        }

    }

}