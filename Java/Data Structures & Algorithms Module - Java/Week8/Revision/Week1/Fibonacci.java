/*
Fibonacci.java
Billy Cussen
03/11/2020
*/
public class Fibonacci{
    public static void fib(int num){
        int a = 0, b = 1, c = 0;
        System.out.println("The number is "+a+" at position 1");
        System.out.println("The number is "+b+" at position 2");
        for(int i = 2; i <= num; i++){
            c = a + b;
            System.out.println("The number is "+c+" at position "+(i+1));
            a = b;
            b = c;
        }
    }

    public static int fibRecur(int num){
        if(num==0||num==1){
            return 1;
        }
        return fibRecur(num-1)+fibRecur(num-2);
    }
    
    public static void main(String[]args){
        fibA(10);

        for(int i = 0; i < 10; i++){
            System.out.println("The number is "+fibRecA(i)+" at position "+(i+1));
        }
    }

    public static void fibA(int n){
        int a = 0, b = 1, c = 0;
        System.out.println("The number is "+a+" at position 1");
        System.out.println("The number is "+b+" at position 2");
        for(int i = 2; i <= n; i++){
            c = a + b;
            System.out.println("The number is "+c+" at position "+i);
            a = b;
            b = c;
        }
    }

    public static int fibRecA(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return fibRecA(n-1)+fibRecA(n-2);
    }
}