/*
Assessment.java
Billy Cussen
21/07/2020
*/

public class Assessment {
  
    //Data Members
    public int weighting;
    public String name;
    public String type;

    //Constructors
    public Assessment(){
        this.weighting = 0;
        this.name = new String();
        this.type = new String();
    }

    public Assessment(int weighting, String name, String type){
        this.weighting = weighting;
        this.name = name;
        this.type = type;
    }

    //Setters
    public void setWeighting(int weighting){
        this.weighting = weighting;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }
}