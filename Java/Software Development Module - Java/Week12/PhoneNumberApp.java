/*
PhoneNumberApp.java
Billy Cussen
23/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class PhoneNumberApp{

    public static void main(String[]args){

        //Variables
        String input = new String();
        String output;
        String retry;
        boolean inputCheck;

        //Object
        Scanner keyboard;
        PhoneNumber myPhoneNumber;

        do{

            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;

                try{
                    System.out.print("Please enter your phone number: ");
                    input = keyboard.nextLine();

                    if(input.length()!=11){
                        throw new InputMismatchException("Your Phone number is not the correct length");
                    }

                    int checkDash = 0;

                    for(int k = 0; k < input.length(); k++){
                        if(input.charAt(k)=='-'){
                            checkDash++;
                        }
                    }

                    if(checkDash==1){
                        checkDash = input.indexOf("-");
                    }else{
                        throw new InputMismatchException("You need to have one Dash between the Prefix and Main Number: 000-0000000");
                    }

                    if(input.charAt(checkDash)!='-'){
                        throw new InputMismatchException("You need to have one Dash between the Prefix and Main Number: 000-0000000");
                    }

                    for(int i = 0; i < checkDash;i++){
                        if(!(Character.isDigit(input.charAt(i)))){
                            throw new InputMismatchException("Your phone number needs to be in the following format: 000-0000000");
                        }
                    }

                    for(int j=checkDash+1;j<input.length();j++){
                        if(!(Character.isDigit(input.charAt(j)))){
                            throw new InputMismatchException("Your phone number needs to be in the following format: 000-0000000");
                        }
                    }

                }catch(InputMismatchException e){
                    System.out.println(e.getMessage());
                    inputCheck = false;
                }finally{
                    keyboard = null;
                }

            }while(!inputCheck);

            myPhoneNumber = new PhoneNumber(input);
            output = myPhoneNumber.computeAndGetResult();
            myPhoneNumber = null;
            System.out.println(output);

            do{
                keyboard = new Scanner(System.in);
                retry = new String();

                try{
                    System.out.print("Retry (Y/N): ");
                    retry = keyboard.nextLine();

                    if(!(retry.equalsIgnoreCase("Y")||retry.equalsIgnoreCase("N"))){
                        throw new InputMismatchException();
                    }

                }catch(InputMismatchException e){
                    System.out.println("You need to enter Y or N. ");
                }finally{
                    keyboard = null;
                }   
            }while(!(retry.equalsIgnoreCase("Y")||retry.equalsIgnoreCase("N")));

        }while(retry.equalsIgnoreCase("Y"));
    }

}