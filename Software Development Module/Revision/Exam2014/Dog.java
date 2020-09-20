/*
Dog.java
Billy Cussen 
07/08/2020
*/

public class Dog extends Animal{

    //Data Member
    private String speak;

    //Constructor
    public Dog(){
        this.speak = "Bark";
    }

    //Getter
    public String speak(){
        return this.speak;
    }

}