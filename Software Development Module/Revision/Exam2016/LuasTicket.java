/*
LuasTicket.java
Billy Cussen
14/08/2020
*/

import java.util.Scanner;

public class LuasTicket{

    //Data Members
    private CustomerInfo myCustomer;
    private String result;
    private double cost;

    //Constructor
    public LuasTicket(CustomerInfo myCustomer){
        this.myCustomer = myCustomer;
        this.result = new String();
        this.cost = 0.0;
    }

    //Compute & Getter
    public double getLuasTicket(){

        String person = this.myCustomer.getPerson().toLowerCase();
        int zones = this.myCustomer.getZones();

        switch (person) {

            case "adult":
                if(zones == 1){
                    this.cost = 1.50;
                } else if(zones == 2){
                    this.cost = 2.30;
                } else{
                    this.cost = 2.90;
                }
                break;
            case "child":
                if(zones == 1){
                    this.cost = 1.00;
                } else if(zones == 2){
                    this.cost = 1.00;
                } else{
                    this.cost = 1.20;
                }     
                break;
            default:
                System.out.println("Apologies, an error has occured!");
                this.cost = 0.0;      
        }

        return this.cost;
    }
}