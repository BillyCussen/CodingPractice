/*
Hairdresser.java
Billy Cussen
21/07/2020
*/

public class Hairdresser {
    
    //Data Members
    private String appointmentType;
    private String hairType;
    private String appointmentDay;

    //Constructor & Setter
    public Hairdresser(String appointmentType, String hairType){
        this.appointmentType = appointmentType;
        this.hairType = hairType;
        this.appointmentDay = "Your Appointment Day is: ";
    }

    //Compute & Getter
    public String computeAndGetAppointmentDay(){

        if(this.appointmentType.equalsIgnoreCase("Style")){
            if(this.hairType.equalsIgnoreCase("Long")){
                this.appointmentDay += "Monday";
            }else if(this.hairType.equalsIgnoreCase("Mid")){
                this.appointmentDay += "Tuesday";
            }else{
                this.appointmentDay += "Wednesday";
            }
        }else{
            if(this.hairType.equalsIgnoreCase("Long")){
                this.appointmentDay += "Thursday";
            }else if(this.hairType.equalsIgnoreCase("Mid")){
                this.appointmentDay += "Friday";
            }else{
                this.appointmentDay += "Saturday";
            }
        }

        return this.appointmentDay;
    }

}