/*
SumDigits.java
Billy Cussen
12/10/2020
*/

// Given a non-negative int n, return the sum of its digits recursively (no loops). Note
// that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
// removes the rightmost digit (126 / 10 is 12).
public class SumDigits{   
   
    public static int sumDigits(int n) {
        int sum = 0, temp = 0;
        while(n > 0){
            temp = n % 10;
            sum += temp;
            n = n / 10;
        }
        return sum;
    }

    public static int sumDigitsRecursion(int n){
        if(n <= 0){
            return 0;
        }

        return (n % 10) + sumDigitsRecursion(n / 10);
    }

    public static void main(String [] args){
        long startTime = System.nanoTime();
        System.out.println("Looped Solution: "+sumDigits(124));
        long endTime = System.nanoTime();
        System.out.println("Looped Solution took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Recursive Solution: "+sumDigitsRecursion(124));
        endTime = System.nanoTime();
        System.out.println("Recursive Solution took "+(endTime-startTime)+" nanoseconds");
    }
}