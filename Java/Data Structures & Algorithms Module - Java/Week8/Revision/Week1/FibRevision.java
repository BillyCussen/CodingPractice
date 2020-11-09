/*
FibRevision.java
Billy Cussen
09/11/2020
*/

public class FibRevision{

    public static void main(String [] args){

        System.out.println("***FIB LOOPED APPROACH***");
        for(int i = 0; i < 10; i++){
            System.out.println(fib(i));
        }
        System.out.println("***FIB RECURSIVE APPROACH***");
        for(int j = 0; j < 10; j++){
            System.out.println(fibRec(j));
        }

    }

    public static int fib(int num){
        int a = 0, b = 0, c = 1;
        for(int i = 0; i < num; i++){
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }

    public static int fibRec(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return fibRec(num-1)+fibRec(num-2);
    }

}