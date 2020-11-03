/*
SalaryIncreaseApp.java
Billy Cussen
29/08/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class SalaryIncreaseApp{

    public static void main(String [] args){

        //Variables
        boolean inputCheck;
        EmployeeInfo[] employees;
        String[] salaryIncreases;
        int numberOfEmployees = 0;
        String maxSalary;

        //Objects
        SalaryIncrease mySalaries;
        Scanner keyboard;

        //Input
        do{ 
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Please enter the number of Employees to be Checked: ");
                numberOfEmployees = keyboard.nextInt();

                if(numberOfEmployees <= 0 || numberOfEmployees > 5){
                    throw new InputMismatchException();
                }

            }catch(NumberFormatException | InputMismatchException e){
                System.out.println("You need to enter an Integer! Additionally, you can enter between 1 and 5 Employees per turn!");
                inputCheck = false;
            } finally{
                keyboard = null;
            }

        }while(!inputCheck);

        employees = new EmployeeInfo[numberOfEmployees];
        salaryIncreases = new String[numberOfEmployees];

        for(int i = 0; i < employees.length; i++){

            employees[i] = new EmployeeInfo();

            do{ 
                inputCheck = true;
                keyboard = new Scanner(System.in);
            
                try{
                    System.out.print("Please enter Position for Employee "+ (i+1)+" (Manager, Team Leader or Software Developer): ");
                    employees[i].setPosition(keyboard.nextLine());

                    if(!(employees[i].getPosition().equalsIgnoreCase("Manager") || employees[i].getPosition().equalsIgnoreCase("Team Leader") || 
                    employees[i].getPosition().equalsIgnoreCase("Software Developer"))){
                        throw new InputMismatchException("You need to Enter \"Manager\", \"Team Leader\" or \"Software Developer\"");
                    }

                }catch(InputMismatchException e){
                    System.out.println(e.getMessage());
                    inputCheck = false;
                } finally{
                    keyboard = null;
                }

            }while(!inputCheck);  


            do{ 
                inputCheck = true;
                keyboard = new Scanner(System.in);
            
                try{
                    System.out.print("Please enter Salary for Employee "+ (i+1)+": ");
                    employees[i].setSalary(keyboard.nextDouble());

                    if(employees[i].getSalary() <= 0.0){
                        throw new InputMismatchException();
                    }

                }catch(NumberFormatException | InputMismatchException e){
                    System.out.println("You need to enter a Number to represent the Employees Salary!");
                    inputCheck = false;
                } finally{
                    keyboard = null;
                }

            }while(!inputCheck);  

            do{ 
                inputCheck = true;
                keyboard = new Scanner(System.in);

                try{
                    System.out.print("Please enter Number of Years Worked for Employee "+ (i+1)+": ");
                    employees[i].setYears(keyboard.nextInt());

                    if(employees[i].getYears() < 0){
                        throw new InputMismatchException();
                    }

                }catch(NumberFormatException | InputMismatchException e){
                    System.out.println("You need to enter an Integer to represent the Years Worked!");
                    inputCheck = false;
                } finally{
                    keyboard = null;
                }

            }while(!inputCheck); 

        }

        //Process
        mySalaries = new SalaryIncrease(employees);
        salaryIncreases = mySalaries.getSalaryIncreases();
        maxSalary = mySalaries.getMaxSalary();
        mySalaries = null;

        //Output
        for(String e: salaryIncreases){
            System.out.println(e);
        }
        System.out.println(maxSalary);
    }

}