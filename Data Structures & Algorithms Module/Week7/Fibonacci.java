/*
Fibonacci.java
Billy Cussen
03/10/2020
*/
public class Fibonacci{

    public static void main(String[]args){

        for(int i = 0; i < 10; i++){
            System.out.println("Fibonnaci Sequence Looped: "+fibonacciLooped(i)+", Fibonnaci Sequence Recursive Approach: "+fibonacciRecursion(i));
        }

    }

    public static int fibonacciLooped(int n){
        int a = 0, b = 1, c = 0;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int fibonacciRecursion(int n){
        if(n < 0){
            throw new NullPointerException();
        } else if(n == 0 || n == 1){
            return 1;
        } 

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}