/*
PPSApp.java
Billy Cussen
22/07/2020
*/

import java.util.Scanner;

public class PPSApp {
    
    public static void main(String[]args){

        //Variable
        String pps = new String();
        String repeat = new String();
        boolean inputCheck;
        //Object
        Scanner keyboard;
        PPS myPPS;

        do{
            do{
                keyboard = new Scanner(System.in);
                inputCheck = true;

                try{
                    System.out.print("Please enter your PPS Number:");
                    pps = keyboard.nextLine();

                    if(pps.length()==0){
                        throw new Exception();
                    }

                }catch(Exception e){
                    inputCheck = false;
                    System.out.println("Please enter your PPS Number correctly (ie. Not Blank)");
                }finally{
                    keyboard = null;
                }

            }while(!inputCheck);

            myPPS = new PPS(pps);
            System.out.println(myPPS.computeAndGetVaidity());
            myPPS = null;

            do{
                keyboard = new Scanner(System.in);
                System.out.print("Please enter Y or N to retry: ");
                repeat = keyboard.nextLine();

                if(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N"))){
                    System.out.println("You need to enter Y or N");
                }

                keyboard = null;

            }while(!(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("N")));
            

        }while(repeat.equalsIgnoreCase("Y"));

    }

}