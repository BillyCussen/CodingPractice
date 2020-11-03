/*
StepsToZero.java
Billy Cussen
22/08/2020
*/

//Given a non-negative integer num, return the number of steps to reduce it to zero. 
//If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

public class StepsToZero{


    public static void main(String [] args){
        //Variables

        //Objects
        StepsToZeroHelper mySteps = new StepsToZeroHelper();

        //Process & Output
        System.out.println(mySteps.numberOfSteps(14));
        System.out.println(mySteps.numberOfSteps(8));
        System.out.println(mySteps.numberOfSteps(123));
        System.out.println(mySteps.numberOfSteps(0));
        mySteps = null;
    }
}

class StepsToZeroHelper{

    //Constructor
    StepsToZeroHelper(){

    }

    //Compute&Getter
    public int numberOfSteps (int num) {       
        int steps = 0;

        while(num > 0){
            if(num % 2 == 0){
                steps++;
                num /= 2;
            } else{
                steps++;
                num -= 1;
            }            
        }
        return steps;
    }

}