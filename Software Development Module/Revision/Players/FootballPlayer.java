/*
FootballPlayer.java
Billy Cussen
28/07/2020
*/

public class FootballPlayer{

    //Data Members
    public String name;

    public FootballPlayer(String name){
        this.name=name;
    }

    public String role(){
        return "Hi, I'm "+this.name+", I'm a Football Player!";
    }

}