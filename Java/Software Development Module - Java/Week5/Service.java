/*
Service.java
Billy Cussen
10/07/2020
*/

public class Service {
    
    //Data Members
    private String branch;
    private String serviceType;
    private String day;

    //Constructor
    public Service(String branch, String serviceType){
        this.branch = branch;
        this.serviceType = serviceType;
        this.day = new String();
    }

    //Compute
    public void computeDay(){

        if(this.branch.equalsIgnoreCase("Blanchardstown")){
            if(this.serviceType.equalsIgnoreCase("Full")){
                this.day = "Monday";
            } else if(this.serviceType.equalsIgnoreCase("Interim")){
                this.day = "Tuesday";
            }else{
                this.day = "Wednesday";
            }
        } else if(this.branch.equalsIgnoreCase("Drogheda")){
            if(this.serviceType.equalsIgnoreCase("Full")){
                this.day = "Thursday";
            } else if(this.serviceType.equalsIgnoreCase("Interim")){
                this.day = "Friday";
            }else{
                this.day = "Saturday";
            }
        } 
    }

    //Getter
    public String getDay(){
        return this.day;
    }
}