/*
SalaryIncrease.java
Billy Cussen
29/08/2020
*/

public class SalaryIncrease{

    //Data Members
    private EmployeeInfo[] employees;
    private String[] salaryIncreases;
    private double maxSalary;

    //Constructor
    public SalaryIncrease(EmployeeInfo[] employees){
        this.employees = employees;
        this.salaryIncreases = new String[this.employees.length];
        this.maxSalary = 0.0;
    }

    //Compute & Getter
    public String[] getSalaryIncreases(){

        double newSalary = 0;
        this.maxSalary = this.employees[0].getSalary();

        for(int i = 0; i < this.employees.length; i++){

            if(this.employees[i].getYears() <= 5){
                if(this.employees[i].getPosition().equalsIgnoreCase("Manager")){
                    newSalary = this.employees[i].getSalary() * 1.02;
                } else if(this.employees[i].getPosition().equalsIgnoreCase("Team Leader")){
                    newSalary = this.employees[i].getSalary() * 1.025;
                }else{
                    newSalary = this.employees[i].getSalary() * 1.03;
                }
            } else{
                if(this.employees[i].getPosition().equalsIgnoreCase("Manager")){
                    newSalary = this.employees[i].getSalary() * 1.03;
                } else if(this.employees[i].getPosition().equalsIgnoreCase("Team Leader")){
                    newSalary = this.employees[i].getSalary() * 1.04;
                }else{
                    newSalary = this.employees[i].getSalary() * 1.04;
                }
            }

            this.salaryIncreases[i] = "Employee "+(i+1)+"'s new Salary is: "+newSalary;
            if(newSalary > this.maxSalary){
                this.maxSalary = newSalary;
            }

        }
        return this.salaryIncreases;
    }

    public String getMaxSalary(){
        return "Max Salary is: "+this.maxSalary;
    }

}