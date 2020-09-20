/*
LinkedListApp.java
Billy Cussen
09/09/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class LinkedListApp{

    public static void main(String [] args){

        //Variables
        int size = 0, selection = 0, menuSelection = 0, linkedListIndex = 0;
        boolean inputCheck;

        //Object
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        Scanner keyboard;

        System.out.println("***LINKED LIST APP***");

        //Input
        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);
            try{
                System.out.print("Enter the Total Size of the LinkedList: ");
                size = keyboard.nextInt();
                if(size<0||size>10){
                    throw new InputMismatchException();
                }
            }catch(InputMismatchException|NumberFormatException e){
                System.out.println("Please pick a number between 1 and 10!");
                inputCheck = false;
            } finally{
                keyboard = null;
            }
        }while(!inputCheck);

        for(int i = 0; i < size; i++){
            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);
                try{
                    System.out.print("Please enter Integer "+(i+1)+": ");
                    selection = keyboard.nextInt();
                    myLinkedList.add(selection);
                    if(selection<0){
                        throw new InputMismatchException();
                    }
                }catch(InputMismatchException|NumberFormatException e){
                    System.out.println("Please enter any Integer of 1 or greater!");
                    inputCheck = false;
                } finally{
                    keyboard = null;
                }
            }while(!inputCheck);
        }
        do{

            do{
                inputCheck = true;
                keyboard = new Scanner(System.in);
                try{
                    System.out.print("\n***MENU***\nCheck Size of the LinkedList: 1\nAdd An Element to the End of the LinkedList: 2\nAdd an element to a Specific Index of the LinkedList: 3\nRemove an Element by Its Index: 4\nPrint Each Element of the LinkedList: 5\nExit: 6\nPlease select Function: ");
                    menuSelection = keyboard.nextInt();
                    if(menuSelection<=0||menuSelection>=7){
                        throw new InputMismatchException();
                    }
                }catch(InputMismatchException|NumberFormatException e){
                    System.out.println("Please Select a Number between 1 and 6!");
                    inputCheck = false;
                } finally{
                    keyboard = null;
                }
            }while(!inputCheck);

            if(menuSelection==1){
                System.out.println("\nLinkedList Size: "+myLinkedList.size());  
            } else if(menuSelection==2){
                do{
                    inputCheck = true;
                    keyboard = new Scanner(System.in);
                    try{
                        System.out.print("Enter the New Number: ");
                        selection = keyboard.nextInt();
                        if(selection<0){
                            throw new InputMismatchException();
                        }
                    }catch(InputMismatchException|NumberFormatException e){
                        System.out.println("Please enter any Integer of 1 or greater!");
                        inputCheck = false;
                    } finally{
                        keyboard = null;
                    }
                }while(!inputCheck);  
                myLinkedList.add(selection);              
            } else if(menuSelection==3){
                do{
                    inputCheck = true;
                    keyboard = new Scanner(System.in);
                    try{
                        System.out.print("Enter the New Number: ");
                        selection = keyboard.nextInt();
                        if(selection<0){
                            throw new InputMismatchException();
                        }
                    }catch(InputMismatchException|NumberFormatException e){
                        System.out.println("Please enter any Integer of 1 or greater!");
                        inputCheck = false;
                    } finally{
                        keyboard = null;
                    }
                }while(!inputCheck); 
                do{
                    inputCheck = true;
                    keyboard = new Scanner(System.in);
                    try{
                        System.out.print("Enter the New Numbers Preferred Index: ");
                        linkedListIndex = keyboard.nextInt();
                        myLinkedList.add(selection, linkedListIndex);
                    }catch(NumberFormatException|IndexOutOfBoundsException e){
                        System.out.println("Please ensure the Index Actually Exists (e.g. not bigger than current LinkedList or below 0!)");
                        inputCheck = false;
                    } finally{
                        keyboard = null;
                    }
                }while(!inputCheck);                    
            } else if(menuSelection == 4){
                do{
                    inputCheck = true;
                    keyboard = new Scanner(System.in);
                    try{
                        System.out.print("Enter the Index you wish to Remove: ");
                        linkedListIndex = keyboard.nextInt();
                        myLinkedList.remove(linkedListIndex);
                    }catch(NumberFormatException|IndexOutOfBoundsException e){
                        System.out.println("Please ensure the Index Actually Exists (e.g. not bigger than current LinkedList or below 0!)");
                        inputCheck = false;
                    } finally{
                        keyboard = null;
                    }
                }while(!inputCheck);                   
            } else if(menuSelection == 5){
                System.out.println("\nLinkedList Elements:\n"+myLinkedList.toString());
            } else{
                myLinkedList = null;
                System.out.println("\nThank you for using my App, I appreciate it! :)");
            }

        }while(menuSelection!=6);
    }
}