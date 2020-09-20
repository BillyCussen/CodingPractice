/*
LuasTicketApp.java
Billy Cussen
14/08/2020
*/

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class LuasTicketApp{

    public static void main(String [] args){

        //Variables
        String repeat = new String();
        String result;
        double total = 0.0;
        boolean inputCheck;

        //Objects
        ArrayList<Double> ticketHistory = new ArrayList<Double>();
        Scanner keyboard;
        CustomerInfo myCustomerInfo; 
        LuasTicket myLuasTicket;

        do{
            myCustomerInfo = new CustomerInfo(); 

            //Input
            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;

                try{
                    System.out.print("Please enter ticket Type (\"Adult\" or \"Child\"): ");
                    myCustomerInfo.setPerson(keyboard.nextLine());

                    if(!(myCustomerInfo.getPerson().equalsIgnoreCase("Adult")||myCustomerInfo.getPerson().equalsIgnoreCase("Child"))){
                        throw new InputMismatchException("You need to enter either \"Adult\" or \"Child\"!");
                    }

                }catch(InputMismatchException e){
                    System.out.println(e.getMessage());
                    inputCheck = false;
                } finally{
                    keyboard = null;
                }

            }while(!inputCheck);

            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;

                try{
                    System.out.print("Please enter the number of Zones you will Travel through: ");
                    myCustomerInfo.setZones(keyboard.nextInt());

                    if(myCustomerInfo.getZones() <= 0 || myCustomerInfo.getZones() > 8){
                        throw new NumberFormatException();
                    }

                }catch(InputMismatchException | NumberFormatException e){
                    System.out.println("You can travel to between 1 and 8 Zones, please enter a number!");
                    inputCheck = false;
                } finally{
                    keyboard = null;
                }

            }while(!inputCheck);

            //Process
            myLuasTicket = new LuasTicket(myCustomerInfo);
            myCustomerInfo = null;
            result = "The Cost of your Ticket is: "+myLuasTicket.getLuasTicket();
            ticketHistory.add(myLuasTicket.getLuasTicket());
            myLuasTicket = null;

            //Output
            System.out.println(result);

            do{
                keyboard = new Scanner(System.in);
                System.out.print("Enter \"Y\" or \"N\" if you would or wouldn't like another ticket: ");
                repeat = keyboard.nextLine();

                if(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N"))){
                    System.out.println("You need to enter \"Y\" or \"N\"!");
                }

            }while(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N")));

        }while(repeat.equalsIgnoreCase("Y"));

        for(double e: ticketHistory){
            total += e;
        }

        ticketHistory = null;
        System.out.println("The Total for all of your Tickets is: "+total);
    }
}