/*
TemperatureApp.java
Billy Cussen
27/07/2020
*/

import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class TemperatureApp{

    public static void main(String [] args){

        //Variables
        String[] temperatureWeek = new String[3];
        String restart;
        String result;
        boolean inputCheckTemperature;
        
        //Object
        Temperature myTemperature;

        //Input
        do{
            restart = new String();

            for(int i = 0; i < temperatureWeek.length; i++){

                do{
                    inputCheckTemperature = true;
                    int commaCheck = 0;

                    try{
                        temperatureWeek[i] = JOptionPane.showInputDialog("Please enter Temperature for Week "+(i+1)+" in the following format:\n1,2,3,4,5,6,7");
                        temperatureWeek[i] = temperatureWeek[i].replaceAll("\\s+","");

                        for(int j = 0; j < temperatureWeek[i].length();j++){
                            if(temperatureWeek[i].charAt(j) == ','){
                                commaCheck++;
                            }
                        }

                        //https://stackoverflow.com/questions/37047386/check-if-string-contain-only-numbers-and-comma-in-java
                        if(!(temperatureWeek[i].matches("[0-9, /,]+")&&commaCheck == 6)){
                            throw new InputMismatchException();
                        }

                        //https://www.geeksforgeeks.org/split-string-java-examples/
                        String[] weekCheck = temperatureWeek[i].split(",");

                        for(String day : weekCheck){
                            if(day.equals("")){
                                throw new InputMismatchException();
                            }
                        }

                        //System.out.println("Comma Count, Week "+(i+1)+": "+commaCheck);
                        //System.out.println("Correct Format, Week "+(i+1)+": "+temperatureWeek[i].matches("[0-9, /,]+"));

                    }catch(InputMismatchException e){
                        JOptionPane.showMessageDialog(null,"Please enter this Weeks Temperatures in the following Format\n1,2,3,4,5,6,7");
                        inputCheckTemperature = false;
                    }

                }while(!inputCheckTemperature);

            }

            //Process
            myTemperature = new Temperature(temperatureWeek);
            result = myTemperature.getResult();
            myTemperature = null;
            
            //Output
            JOptionPane.showMessageDialog(null,result);

            //Check if the User wants to Retry
            do{

                try{
                    restart = JOptionPane.showInputDialog("Would you like to retry?\nY to Retry\nN to Exit");

                    if(!(restart.equalsIgnoreCase("Y")||restart.equalsIgnoreCase("N"))){
                        throw new InputMismatchException();
                    }

                } catch(InputMismatchException e){
                    JOptionPane.showMessageDialog(null,"You need to enter Y or N");
                }

            }while(!(restart.equalsIgnoreCase("Y")||restart.equalsIgnoreCase("N")));

        }while(restart.equalsIgnoreCase("Y"));

    }

}