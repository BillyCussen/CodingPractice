/*
AirlineApp.java
Billy Cussen
29/07/2020
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class AirlineApp{

    public static void main(String[]args){

        //Variables
        String status = new String();
        int flights = 0;
        String pointsEarned;
        boolean inputCheckStatus;
        boolean inputCheckFlights;

        //Object
        Scanner keyboard;
        Airline myAirline;

        //Input
        do{
            keyboard = new Scanner(System.in);
            inputCheckStatus = true;

            try{
                System.out.print("Please enter your Loyalty Status(Silver, Gold or Platinum): ");
                status = keyboard.nextLine();

                if(!(status.equalsIgnoreCase("Silver")||status.equalsIgnoreCase("Gold")||status.equalsIgnoreCase("Platinum"))){
                    throw new InputMismatchException();
                }

            }catch(InputMismatchException e){
                System.out.println("You need to enter Silver, Gold or Platinum!");
                inputCheckStatus = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheckStatus);

        do{
            keyboard = new Scanner(System.in);
            inputCheckFlights = true;

            try{
                System.out.print("Please enter your Total flights with us this Calender Year: ");
                flights = keyboard.nextInt();

                if(flights<0){
                    throw new InputMismatchException();
                }

            }catch(NumberFormatException | InputMismatchException e){
                System.out.println("You need to enter a number (e.g. 1, 2 3)!");
                inputCheckFlights = false;
            }finally{
                keyboard = null;
            }

        }while(!inputCheckFlights);

        //Compute
        myAirline = new Airline(status, flights);
        pointsEarned = myAirline.getPointsEarned();
        myAirline = null;

        //Output
        System.out.println(pointsEarned);
    }

}