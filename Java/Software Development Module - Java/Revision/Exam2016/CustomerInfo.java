/*
CustomerInfo.java
Billy Cussen
14/08/2020
*/

public class CustomerInfo{

    //Variables
    private String person;
    private int zones;

    //Constructors

    public CustomerInfo(){
        this.person = new String();
        this.zones = 0;
    }

    public CustomerInfo(String person, int zones){
        this.person = person;
        this.zones = zones;
    }

    //Setters
    public void setPerson(String person){
        this.person = person;
    }

    public void setZones(int zones){
        this.zones = zones;
    }

    //Getters
    public String getPerson(){
        return this.person;
    }

    public int getZones(){
        return this.zones;
    }
}