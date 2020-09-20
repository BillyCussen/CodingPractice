/*
PasswordCheckerApp.java
Billy Cussen
13/08/2020
*/

import java.util.Scanner;

//Write a Java App takes in as a parameter a one-dimensional array of Strings which contains passwords
//The method should search (i.e. traverse) the array of passwords and display all the passwords which are weak.

//Password rules:
//A password must contain at least 10 characters.
//A password must consist of letters, digits & Characters.
//A password should contain at least two Characters.
//A password should contain at least one uppercase letter

import java.util.InputMismatchException;

public class PasswordCheckerApp{

    public static void main(String [] args){

        //Variables
        int passwordAmount = 0;
        String[] passwordsArray;
        String output;
        String specialCharacters = "/*!@#$%^&'*()\"{}_[]|\\?/<>,.";
        boolean inputCheck;

        //Objects
        PasswordChecker myPasswordChecker;
        Scanner keyboard;

        //Input
        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;

            try{    
                System.out.print("Please enter the number of Passwords to be Checked: ");
                passwordAmount = keyboard.nextInt();

                if(passwordAmount <= 0 || passwordAmount > 10){
                    throw new InputMismatchException();
                }

            }catch(NumberFormatException | InputMismatchException e){
                System.out.println("Please enter a Valid number (e.g. 3)\nPlease remember you can only try a maximum of 10 Passwords per Check");
                inputCheck = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);

        passwordsArray = new String[passwordAmount];

        for(int i = 0; i < passwordsArray.length; i++){

            
            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;

                try{    
                    System.out.print("Please enter Password "+(i+1)+": ");
                    passwordsArray[i] = keyboard.nextLine();

                    if(passwordsArray[i].length()<10){
                        throw new InvalidPasswordException();
                    }

                    boolean digitCheck = false;
                    boolean letterCheck = false;
                    boolean characterCheck = false;

                    for(int j = 0; j < passwordsArray[i].length(); j++){

                        if(Character.isDigit(passwordsArray[i].charAt(j))){
                            digitCheck = true;
                        } else if(Character.isLetter(passwordsArray[i].charAt(j))){
                            letterCheck = true;
                        }

                        for(int k = 0; k < specialCharacters.length();k++){

                            if(passwordsArray[i].charAt(j) == specialCharacters.charAt(k)){
                                characterCheck = true;
                                break;
                            }

                        }

                        if(digitCheck&&letterCheck&&characterCheck){
                            break;
                        }
                    }

                    if(!(digitCheck&&letterCheck&&characterCheck)){
                        throw new InvalidPasswordException("Password "+(i+1)+" requires at least 1 Letter, Number & Character!");
                    }

                }catch(InvalidPasswordException f){
                    System.out.println(f.getMessage());
                    inputCheck = false;
                }finally{
                    keyboard = null;
                }

            }while(!inputCheck);

        }

        //Process
        myPasswordChecker = new PasswordChecker(passwordsArray, specialCharacters);
        output = myPasswordChecker.getWeakPasswords();
        myPasswordChecker = null;
        //Output
        System.out.println(output);

    }
}