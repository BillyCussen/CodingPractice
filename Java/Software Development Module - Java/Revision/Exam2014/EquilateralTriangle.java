/*
EquilateralTriangle.java
Billy Cussen
07/08/2020
*/

public class EquilateralTriangle{

    //Data Members
    private double side;
    private double area;
    private double perimeter;

    //Constructor
    public EquilateralTriangle(){
        this.side = 0.0;
    }

    //Setter
    public void setSide(double side){
        this.side = side;
    }

    //Compute
    public void computeArea(){
        this.area = (Math.sqrt(3)/4)*Math.pow(this.side,2);
        this.area = (double) Math.round(this.area * 100.0) / 100.0;
    }

    public void computePerimeter(){
        this.perimeter = this.side * 3;
    }

    //Getters
    public String getArea(){
        return "The Area of the Equilateral Triangle is: "+this.area;
    }

    public String getPerimeter(){
        return "The Perimeter of the Equilateral Triangle is: "+this.perimeter;
    }

}