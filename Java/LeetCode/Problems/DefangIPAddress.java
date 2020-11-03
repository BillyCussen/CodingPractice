/*
DefangIPAddress.java
Billy Cussen
22/08/2020
*/

//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//A defanged IP address replaces every period "." with "[.]".

import java.util.Scanner;
import java.util.InputMismatchException;

public class DefangIPAddress{

    public static void main(String [] args){

        //Variables
        String address = new String();
        String result;
        boolean inputCheck;
        //Object
        Defang one = new Defang();
        Scanner keyboard;

        //Input
        do{
            keyboard = new Scanner(System.in);
            inputCheck = true;

            try{
                System.out.print("Please enter an IPv4 address: ");
                address = keyboard.nextLine();

                if(address.equalsIgnoreCase("") || address.endsWith(".")){
                    throw new InputMismatchException();
                }

                inputCheck = one.checkValidIP(address);

            }catch(InputMismatchException | NumberFormatException e){
                inputCheck = false;
            } finally{
                if(inputCheck == false){
                    System.out.println("You need to enter a valid IPV4 address!");
                }

                keyboard = null;
            }

        }while(!inputCheck);

        //Process & Output
        result = one.defangIPaddr(address);
        one = null;
        System.out.println(result);
    }


}

class Defang{

    public String defangIPaddr(String address) {
        StringBuffer result = new StringBuffer();

        for(int i = 0; i < address.length(); i++){

            if(address.charAt(i) == '.'){
                result.append("[.]");
            } else{
                result.append(address.charAt(i));
            }

        }

        return result.toString();
        
    }

    public boolean checkValidIP(String address){

        boolean addressCheck = true;

        try{
            String[] parts = address.split("\\.");
            
            if(parts.length != 4){
                addressCheck = false;
            }

            for(String e: parts){
                int part = Integer.parseInt(e);
                if(part<1 || part > 255){
                    addressCheck = false;
                }

            }
        }catch(NumberFormatException e){
            addressCheck = false;
        }

        return addressCheck;
    }

}