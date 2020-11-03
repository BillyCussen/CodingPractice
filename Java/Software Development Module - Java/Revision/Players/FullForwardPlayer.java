/*
FullForwardPlayer.java
Billy Cussen
28/07/2020
*/

public class FullForwardPlayer extends FootballPlayer{

    //Constructor
    public FullForwardPlayer(String name){
        super(name);
    }

    @Override
    public String role(){
        return "Hi, I'm "+name+". I play as a Full Forward.";
    }

}