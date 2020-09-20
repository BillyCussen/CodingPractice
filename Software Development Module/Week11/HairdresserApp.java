/*
HairdresserApp.java
Billy Cussen
21/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class HairdresserApp {
    
    public static void main(String[]args){

        //Variables
        String appointmentType = new String();
        String hairType = new String();
        String appointmentDay;
        boolean inputCheck;

        //Object
        Scanner keyboard;
        Hairdresser myHairdresser;

        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;

            try{
                System.out.print("Please enter your Appointment Type (Style or Cut): ");
                appointmentType = keyboard.nextLine();

                if(!(appointmentType.equalsIgnoreCase("Style")||appointmentType.equals("Cut"))){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                inputCheck = false;
                System.out.println("Please enter Style or Cut");
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);

        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;

            try{
                System.out.print("Please enter your Hair Type (Long, Mid or Short): ");
                hairType = keyboard.nextLine();

                if(!(hairType.equalsIgnoreCase("Long")||hairType.equals("Mid")||hairType.equals("Short"))){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                inputCheck = false;
                System.out.println("Please enter Long, Mid or Short");
            }finally{
                keyboard = null;
            }

        }while(!inputCheck);

        myHairdresser = new Hairdresser(appointmentType,hairType);
        appointmentDay = myHairdresser.computeAndGetAppointmentDay();
        myHairdresser = null;
        System.out.println(appointmentDay);
    }

}