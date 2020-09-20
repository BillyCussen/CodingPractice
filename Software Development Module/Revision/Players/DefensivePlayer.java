/*
DefensivePlayer.java
Billy Cussen
28/07/2020
*/

public class DefensivePlayer extends FootballPlayer{

    //Constructor
    public DefensivePlayer(String name){
        super(name);
    }

    @Override
    public String role(){
        return "Hi, I'm "+name+". I play in Defense.";
    }

}