/*
TestArrayLists.java
Billy Cussen
07/09/2020
*/

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class TestArrayLists{

    public static void main(String[] args){

        //Variables
        boolean inputCheck;
        int wordCount = 0;
        String inputWord = new String();

        //Object
        Scanner keyboard;
        List<String> list1 = new ArrayList<String>();

        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Words to be entered (1 to 5): ");
                wordCount = keyboard.nextInt();

                if(wordCount < 1 || wordCount > 5){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException|NumberFormatException e){
                inputCheck = false;
                System.out.println("Enter a number between 1 and 5");
            }finally{   
                keyboard = null;
            }

        }while(!inputCheck);

        for(int i = 0 ; i < wordCount; i++){
            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Enter Word "+(i+1)+": ");
                    inputWord = keyboard.nextLine();
                }catch(InputMismatchException e){
                    inputCheck = false;
                    System.out.println("Enter a Word!");
                }finally{   
                    keyboard = null;
                }

            }while(!inputCheck);  
            
            list1.add(inputWord);
        }

        TestArrayLists.printList(list1);

        list1.clear();

        for(int i = 0 ; i < wordCount; i++){
            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Enter Word "+(i+1)+": ");
                    inputWord = keyboard.nextLine();
                }catch(InputMismatchException e){
                    inputCheck = false;
                    System.out.println("Enter a Word!");
                }finally{   
                    keyboard = null;
                }

            }while(!inputCheck);  
            
            list1.add(inputWord);
        }

        TestArrayLists.printList(list1);

    }

    public static void printList(List<String> list){
        for(String e: list){
            System.out.println(e);
        }
    }

}

