/*
Project.java
Billy Cussen
21/07/2020
*/

import java.util.Date;

public class Project extends Assessment{

    //Data Members
    private Date deadline;

    //Constructors
    public Project(){
        this.deadline = new Date();
    }

    public Project(int weighting, String name, String type, Date deadline){
        super(weighting, name, type);
        this.deadline = deadline;
    }



    //Setter
    public void setDate(Date deadline){
        this.deadline = deadline;
    }

    //Getter
    public Date getDate(){
        return this.deadline;
    }

    @Override
    public String toString(){
        return "Name: "+this.name+", Weighting: "+this.weighting+", Type: "+this.type+", Deadline: "+this.deadline;
    }

}