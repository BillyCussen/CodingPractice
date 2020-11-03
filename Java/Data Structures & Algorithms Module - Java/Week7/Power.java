/*
Power.java
Billy Cussen
03/10/2020
*/

public class Power{

    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.println("Power Looped Approach: "+powerLooped(2, 3));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Power Recursive Approach: "+powerRecursion(2, 3));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");
    }

    public static int powerLooped(int n, int e){
        int answer = 1;
        for(int i = 0; i < e;i++){
            answer*=n;
        }
        return answer;
    }

    public static int powerRecursion(int n, int e){
        if(e == 1){
            return n;
        }
        return n * powerRecursion(n, e-1);
    }
}