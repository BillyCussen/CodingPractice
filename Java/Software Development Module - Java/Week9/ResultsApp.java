/*
ResultsApp.java
Billy Cussen
18/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class ResultsApp {
    public static void main(String[]args){

        //Variables
        int[][] examResult;
        int numberOfStudents = 0;
        int numberOfExams = 0;
        String result;
        boolean inputCheckResults;

        //Objects
        Scanner keyboard;
        Results myResults;

        //Input
        do{
            inputCheckResults = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter the number of Students to Grade: ");
                numberOfStudents = keyboard.nextInt();

                if(numberOfStudents <= 0){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("You need to enter an Integer (of 1 or greater) to Register how many Student you wish to Grade");
                inputCheckResults = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheckResults);

        do{
            inputCheckResults = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter the number of Exams to Grade: ");
                numberOfExams = keyboard.nextInt();

                if(numberOfExams <= 0){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("You need to enter an Integer (of 1 or greater) to Register how many Exams you wish to Grade");
                inputCheckResults = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheckResults);

        examResult = new int[numberOfStudents][numberOfExams];

        for(int i = 0; i < examResult.length; i++){

            for(int j = 0; j < examResult[0].length; j++){

                do{
                    inputCheckResults = true;
                    keyboard = new Scanner(System.in);
        
                    try{
                        System.out.print("Please enter the Grade for Student "+(i+1)+", Exam "+(j+1)+": ");
                        examResult[i][j] = keyboard.nextInt();

                        if(examResult[i][j] < 0 || examResult[i][j] > 100){
                            throw new InputMismatchException();
                        }
                    }catch(InputMismatchException e){
                        System.out.println("You need to enter an Integer (of 0 or greater and less than 101) to Register these exam results");
                        inputCheckResults = false;      
                    }finally{
                        keyboard = null;
                    }
        
                }while(!inputCheckResults);

            }

        }

        myResults = new Results(examResult);
        
        //Process & Output
        result = myResults.computeAndGetResults();
        myResults = null;
        System.out.println(result);

    }

}