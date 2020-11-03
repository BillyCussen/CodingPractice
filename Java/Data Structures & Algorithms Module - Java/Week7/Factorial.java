/*
Factorial.java
Billy Cussen
03/10/2020
*/

public class Factorial{

    public static void main(String[] args){
        System.out.println("Factorial Looped: "+factorialLooped(5)+", Factorial Recursion: "+factorialRecursion(5));
    }

    public static int factorialLooped(int n){
        int a = n;
        while(n != 1){
            n-=1;
            a*=n;
        }
        return a;
    }

    public static int factorialRecursion(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return n * factorialRecursion(n - 1);
    }
}