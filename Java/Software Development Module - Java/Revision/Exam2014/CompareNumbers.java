/*
CompareNumbers.java
Billy Cussen 
06/08/2020
*/

//Develop a method which compares two double numbers and determine the relationship between the numbers,
//The method returns 0 if n1 and n2 are equal, 1 if n1 is greater than n2, and -1 if n1 is lower than n2.

public class CompareNumbers{

    //Data Members
    private int a;
    private int b;
    
    //Constructor
    public CompareNumbers(){
        this.a = 0;
        this.b = 0;
    }

    //Compute, Setter & Getter
    public int getComparison(int a, int b){
        this.a = a;
        this.b = b;

        if(a == b){
            return 0;
        } else if(a > b){
            return 1;
        } else{
            return -1;
        }

    }
}