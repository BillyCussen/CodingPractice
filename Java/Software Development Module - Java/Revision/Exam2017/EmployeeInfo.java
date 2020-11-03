/*
EmployeeInfo.java
Billy Cussen
29/08/2020
*/

public class EmployeeInfo{

    private String position;
    private int years;
    private double salary;

    //Constructor
    public EmployeeInfo(String position, int years, double salary){
        this.position = position;
        this.years = years;
        this.salary = salary;
    }

    public EmployeeInfo(){
        this.position = new String();
        this.years = 0;
        this.salary = 0.0;
    }

    //Setters
    public void setPosition(String position){
        this.position = position;
    }

    public void setYears(int years){
        this.years = years;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    //Getters
    public String getPosition(){
        return this.position;
    }

    public int getYears(){
        return this.years;
    }

    public double getSalary(){
        return this.salary;
    }
}