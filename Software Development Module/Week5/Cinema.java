/*
Cinema.java
Billy Cussen
13/07/2020
*/

public class Cinema {
    
    //Data Members
    private int age;
    private String result;

    //Constructor
    public Cinema(int age){
        this.age = age;
        this.result = new String();
    }

    //Compute
    public void computePrice(){

        if(this.age <= 5 || this.age >= 65){
            this.result = "You get in for Free!";
        } else if(this.age > 5 || this.age <= 14){
            this.result = "Your ticket costs 10";
        } else{
            this.result = "Your ticket costs 15";
        }

    }

    //Getter
    public String getPrice(){
        return this.result;
    }

}