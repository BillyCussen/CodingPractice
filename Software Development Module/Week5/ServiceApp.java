/*
ServiceApp.java
Billy Cussen
10/07/2020
*/

import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class ServiceApp {
    public static void main(String [] args){

        //Variables
        String branch = new String();
        String serviceType = new String();
        String day;
        boolean inputCheckService;

        //Objects
        Service myService;

        //Input
        do{
            inputCheckService = true;

            try{
                branch = JOptionPane.showInputDialog("Which Branch will you be visiting for your Service?\n 1. Blanchardstown, 2. Drogheda");
                
                if(!(branch.equalsIgnoreCase("Blanchardstown")||branch.equalsIgnoreCase("Drogheda"))){
                    throw new InputMismatchException("Please enter one of two stated branches!");
                }
            
            }catch(InputMismatchException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                inputCheckService = false;
            }

        }while(!inputCheckService);

        do{
            inputCheckService = true;

            try{
                serviceType = JOptionPane.showInputDialog("What Service Type would you like to visit?\n 1. Full, 2. Interim, 3. Pre-NCT");
                
                if(!(serviceType.equalsIgnoreCase("Full")||serviceType.equalsIgnoreCase("Interim")||serviceType.equalsIgnoreCase("Pre-NCT"))){
                    throw new InputMismatchException("Please enter one of three stated Service Types!");
                }
            
            }catch(InputMismatchException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                inputCheckService = false;
            }

        }while(!inputCheckService);

        //Process
        myService = new Service(branch, serviceType);
        myService.computeDay();

        //Output
        day = myService.getDay();
        myService = null;
        JOptionPane.showMessageDialog(null,"Your service Day is: "+day);

    }

}