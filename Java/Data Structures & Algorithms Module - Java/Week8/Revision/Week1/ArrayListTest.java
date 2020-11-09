/*
ArrayListTest.java
Billy Cussen
09/11/2020
*/
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest<T>{

    public static void main(String[]args){

        //Variables
        boolean inputCheck;
        int words = 0;
        String word = new String();
        //Objects
        Scanner keyboard;
        List<String> myList = new ArrayList<String>();
        ArrayListTest myArrayListTest = new ArrayListTest();

        do{
            inputCheck = false;
            keyboard = new Scanner(System.in);
            try{
                System.out.print("Please enter words to be entered(1 min, 5 max): ");
                words = keyboard.nextInt();
                if(words < 1 || words > 5){
                    throw new Exception();
                }
            }catch(Exception e){
                inputCheck = true;
                System.out.println("You need to enter a valid Number between 1 and 5!");
            }finally{
                keyboard = null;
            }
        }while(inputCheck);
        
        for(int i = 0; i < words; i++){
            do{
                inputCheck = false;
                keyboard = new Scanner(System.in);
                try{
                    System.out.print("Please enter word "+(i+1)+": ");
                    word = keyboard.nextLine();
                    if(word.equals("")){
                        throw new Exception();
                    }
                }catch(Exception e){
                    inputCheck = true;
                    System.out.println("You need to enter a valid word");
                }finally{
                    keyboard = null;
                }
            }while(inputCheck);
            myList.add(word);
        }

        myArrayListTest.printList(myList);
    }

    public void printList(List<T> myList){
        for(T e: myList){
            System.out.println(e);
        }
    }

}