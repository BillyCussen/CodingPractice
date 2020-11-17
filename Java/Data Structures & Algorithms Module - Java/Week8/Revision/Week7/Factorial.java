/*
Factorial.java
Billy Cussen
17/11/2020
*/

public class Factorial{

    public static void main(String[] args){

        System.out.println(factorial(5));
        System.out.println(factorialRecursion(5));
    }

    public static int factorial(int n){
        int res = n;
        while(n>1){
            n-=1;
            res*=n;
        }
        return res;
    }

    public static int factorialRecursion(int n){
        if (n == 1){
            return n;
        }
        return n * factorialRecursion(n-1);
    }
}