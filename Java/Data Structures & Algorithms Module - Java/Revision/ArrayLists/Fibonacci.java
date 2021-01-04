/*
Fibonacci.java
Billy Cussen
04/01/2020
*/

public class Fibonacci {
    
    public static String fib(int n){
        String result = "***FIBONACCI SEQUENCE***\n";
        int a = 0, b = 1, c = 0;
        for(int i = 0; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
            result+=b + "\n";
        }
        return result;
    }

    public static String fibRec(int n){
        String result = "***FIB RECURSION***\n";
        if(n < 0){
            return result;
        } else{
            for(int i = 1; i <= n; i++){
                result+= fibRecHelper(i)+"\n";
            }
            return result;
        }
    }

    public static int fibRecHelper(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return fibRecHelper(n-1)+fibRecHelper(n-2);
    }

    public static void main(String [] args){


        long startTime = System.nanoTime();
        System.out.println(fib(10));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach: "+(endTime-startTime));

        startTime = System.nanoTime();
        System.out.println(fibRec(10));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach: "+(endTime-startTime));
    }
}
