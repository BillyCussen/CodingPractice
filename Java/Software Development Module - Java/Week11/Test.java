/*
Test.java
Billy Cussen
21/07/2020
*/

public class Test extends Assessment {
    
    //Data Members
    private int questions;
    private int duration;

    //Constructors
    public Test(){
        this.questions = 0;
        this.duration = 0;
    }


    public Test(int weighting, String name, String type, int questions, int duration){
        super(weighting, name, type);
        this.questions = questions;
        this.duration = duration;
    }

    //Setters
    public void setQuestions(int questions){
        this.questions = questions;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }
    
    //Getters
    public int getQuestions(){
        return this.questions;
    }

    public int getDuration(){
        return this.duration;
    }

    @Override
    public String toString(){
        return "Name: "+this.name+", Weighting: "+this.weighting+", Type: "+this.type+", Questions: "+this.questions+", Duration: "+this.duration;
    }

}