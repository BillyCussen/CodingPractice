/*
Fibonacci.java
Billy Cussen
17/11/2020
*/
public class Fibonacci{

    public static void main(String [] args){

        for(int i = 0; i < 10; i++){
            System.out.println("Fib Looped: "+fib(i)+", Fib Recursion: "+fibRecursion(i));
        }
    }

    public static int fib(int n){
        int a = 0, b = 1, c = 1;
        for(int i = 0; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int fibRecursion(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return fibRecursion(n-1)+fibRecursion(n-2);
    }
}