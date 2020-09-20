/*
Pay.java
Billy Cussen
09/07/2020
*/

//This App will calculate an Employees wages for the week taking total hours, total overtime hours and rate of pay per hour into account

public class Pay {

    //Data Members
    private double payRatePerHour;
    private double hoursPerWeek;
    private double overtimeHoursPerWeek;
    private final double OVERTIMERATE;
    private double totalPayPerWeek;


    //Constructor
    public Pay(double payRatePerHour, double hoursPerWeek, double overtimeHoursPerWeek){
        this.payRatePerHour=payRatePerHour;
        this.hoursPerWeek=hoursPerWeek;
        this.overtimeHoursPerWeek=overtimeHoursPerWeek;
        this.OVERTIMERATE=1.5;
        this.totalPayPerWeek=0;
    }

    //Compute
    public void computeTotalPay(){
        this.totalPayPerWeek = this.hoursPerWeek*this.payRatePerHour;
        this.totalPayPerWeek = this.totalPayPerWeek + ((this.overtimeHoursPerWeek*this.payRatePerHour)*this.OVERTIMERATE);
    }

    public double getTotalPay(){
        return this.totalPayPerWeek;
    }
}