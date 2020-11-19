/*
Power.java
Billy Cussen
19/11/2020
*/
public class Power{

    public static void main(String [] args){

        System.out.println("Power: "+power(2,5));
        System.out.println("Power Recursion: "+powerRecursion(2,5));

    }

    public static int power(int a, int b){
        int answer = 1;
        for(int i = 0; i < b; i++){
            answer*=a;
        }
        return answer;
    }

    public static int powerRecursion(int a, int b){
        if(b <= 1){
            return a;
        }
        return a * powerRecursion(a,b-1);
    }

}