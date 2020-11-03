/*
EvenNumberDigits.java
Billy Cussen
01/09/2020
*/

//Given an array nums of integers, return how many of them contain an even number of digits.

public class EvenNumberDigits{

    public static void main(String [] args){

        //Variables
        int[] num = {12,345,2,6,7896};
        int[] num1 = {555,901,482,1771};
        int[] num2 = {437,315,322,431,686,264,442};

        EvenNumberDigitsHelper myEvenNumbers = new EvenNumberDigitsHelper();

        long startTime1 = System.currentTimeMillis();
        System.out.println(myEvenNumbers.findNumbers(num));
        System.out.println(myEvenNumbers.findNumbers(num1));
        System.out.println(myEvenNumbers.findNumbers(num2));
        long endTime1 = System.currentTimeMillis();
        System.out.println("Solution 1 takes: "+(endTime1-startTime1)+" milliseconds");

        long startTime3 = System.currentTimeMillis();
        System.out.println(myEvenNumbers.findNumbers2(num));
        System.out.println(myEvenNumbers.findNumbers2(num1));
        System.out.println(myEvenNumbers.findNumbers2(num2));
        long endTime3 = System.currentTimeMillis();
        System.out.println("Solution 3 takes: "+(endTime3-startTime3)+" milliseconds");

        long startTime4 = System.currentTimeMillis();
        System.out.println(myEvenNumbers.findNumbers3(num));
        System.out.println(myEvenNumbers.findNumbers3(num1));
        System.out.println(myEvenNumbers.findNumbers3(num2));
        long endTime4 = System.currentTimeMillis();
        System.out.println("Solution 4 takes: "+(endTime4-startTime4)+" milliseconds");

        long startTime2 = System.currentTimeMillis();
        System.out.println(myEvenNumbers.findNumbers1(num));
        System.out.println(myEvenNumbers.findNumbers1(num1));
        System.out.println(myEvenNumbers.findNumbers1(num2));
        long endTime2 = System.currentTimeMillis();
        System.out.println("Solution 2 takes: "+(endTime2-startTime2)+" milliseconds");

        myEvenNumbers = null;
    }

}

class EvenNumberDigitsHelper{

    //Constructor
    EvenNumberDigitsHelper(){
    }

    //Solution 1
    //104 / 104 test cases passed.
    //Runtime: 17 ms
    //Memory Usage: 42.4 MB
    public int findNumbers(int[] nums) {
        int evenNumbers = 0;
        int numTempLength;
        for(int i = 0; i < nums.length; i++){
            numTempLength = new String(nums[i]+"").length();
            if(numTempLength % 2 == 0){
                evenNumbers++;
            }
        }
        return evenNumbers;
    }
    
    //Solution 2
    //104 / 104 test cases passed.
    //Runtime: 3 ms
    //Memory Usage: 40.7 MB
    public int findNumbers1(int[] nums) {
        int evenNumbers = 0, numDigits;
        for(int i = 0; i < nums.length; i++){
            numDigits = 0;
            while(nums[i]!=0){
                nums[i] /= 10;
                numDigits++;
            }
            if(numDigits % 2 == 0){
                evenNumbers++;
            }
        }
        return evenNumbers;
    }

    //Solution 3
    //104 / 104 test cases passed.
    //Runtime: 1 ms
    //Memory Usage: 39.3 MB
    public int findNumbers2(int[] nums) {
        int numTemp, count, evenNumber = 0;
        for(int i = 0; i < nums.length; i++){
            count = 0;
            numTemp = nums[i];
            while(numTemp!=0){
                numTemp/=10;
                count++;
            }
            if(count % 2 == 0){
                evenNumber++;
            }
        }
        return evenNumber;
    }

    //Solution 4
    //104 / 104 test cases passed.
    //Runtime: 2 ms
    //Memory Usage: 40.3 MB
    public int findNumbers3(int[] nums) {
        int count, evenNumber = 0;
        for(int i = 0; i < nums.length; i++){
            count = findNumbersHelper(nums[i]);
            if(count % 2 == 0){
                evenNumber++;
            }
        }
        return evenNumber;
    }

    private int findNumbersHelper(int i){
        int count = 0;
        while(i != 0){
            count++;
            i/=10;
        }
        return count;
    }

}