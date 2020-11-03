/*
AssessmentApp.java
Billy Cussen
21/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AssessmentApp {
    
    public static void main(String[]args){

        //Variables
        int weighting = 0, questions = 0, duration = 0;
        String name = new String(), type = new String();
        Date deadline = new Date();
        String output;
        boolean inputCheck;

        //Objects
        Scanner keyboard;
        Assessment myAssessment;
        Test myTest;
        Project myProject;

        do{
            keyboard = new Scanner(System.in);
            
            try{
                System.out.print("Please enter Assessment Type (Test or Project): ");
                type = keyboard.nextLine();

                if(!(type.equalsIgnoreCase("Test")||type.equalsIgnoreCase("Project"))){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("Please enter either Test or Project!");
            }finally{
                keyboard = null;
            }

        }while(!(type.equalsIgnoreCase("Test")||type.equalsIgnoreCase("Project")));

        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;

            try{
                System.out.print("Enter the weighting of this "+type+" (e.g. 60): ");
                weighting = keyboard.nextInt();

                if(weighting <= 0 || weighting > 100){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("Please enter a number between 1 and 100 to denote weighting");
                inputCheck = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);           

        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;

            try{
                System.out.print("Enter the Name of this "+type+" (e.g. OOP Project): ");
                name = keyboard.nextLine();

                if(name.length() <= 0){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("Please enter a valid name for this "+type);
                inputCheck = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);       

        if(type.equalsIgnoreCase("Test")){

            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;
    
                try{
                    System.out.print("Enter the number of questions in this "+type+": ");
                    questions = keyboard.nextInt();
    
                    if(questions <= 0){
                        throw new InputMismatchException();
                    }
    
                }catch(InputMismatchException e){
                    System.out.println("Please enter a valid number of questions for this "+type);
                    inputCheck = false;
                }finally{
                    keyboard = null;
                }
    
            }while(!inputCheck);

            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;
    
                try{
                    System.out.print("Enter the Duration of this "+type+" in minutes (e.g. 60): ");
                    duration = keyboard.nextInt();
    
                    if(duration <= 0){
                        throw new InputMismatchException();
                    }
    
                }catch(InputMismatchException e){
                    System.out.println("Please enter a valid duration for this "+type);
                    inputCheck = false;
                }finally{
                    keyboard = null;
                }
    
            }while(!inputCheck);

            myTest = new Test(weighting,name,type,questions,duration);
            System.out.println(myTest.toString());
            myTest = null;

        } else{

            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;
    
                try{
                    System.out.print("Enter the Deadline Date of this "+type+" (In the format DD/MM/YYYY): ");
                    String dateTemp = keyboard.nextLine();
                    deadline = new SimpleDateFormat("dd/MM/yyyy").parse(dateTemp);
                    
                    if(dateTemp.length() < 8){
                        throw new InputMismatchException();
                    }

                }catch(InputMismatchException | ParseException e){
                    System.out.println("Please enter a valid DeadlineDate for this "+type);
                    inputCheck = false;
                }finally{
                    keyboard = null;
                }
    
            }while(!inputCheck);

            myProject = new Project(weighting,name,type,deadline);
            System.out.println(myProject.toString());
            myProject = null;

        }


    }

}