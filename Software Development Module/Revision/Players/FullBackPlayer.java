/*
FullBackPlayer.java
Billy Cussen
28/07/2020
*/

public class FullBackPlayer extends DefensivePlayer{

    //Constructor
    public FullBackPlayer(String name){
        super(name);
    }

    @Override
    public String role(){
        return "Hi, I'm "+name+". I am a Full Back.";
    }

}