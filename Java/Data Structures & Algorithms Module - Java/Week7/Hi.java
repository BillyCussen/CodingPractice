/*
Hi.java
Billy Cussen
04/10/2020
*/
public class Hi{
    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.println("Looped Approach Example \"hihihi\": "+hiCount("hihihi"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach for above took "+(endTime-startTime)+" nanoseconds");
        startTime = System.nanoTime();
        System.out.println("Looped Approach Example \"hohohohihohohohi\": "+hiCount("hohohohihohohohi"));
        endTime = System.nanoTime();
        System.out.println("Looped Approach for above took "+(endTime-startTime)+" nanoseconds");
        startTime = System.nanoTime();
        System.out.println("Recursive Approach \"hihihi\": "+hiRecursion("hihihi"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach for above took "+(endTime-startTime)+" nanoseconds");
        startTime = System.nanoTime();
        System.out.println("Recursive Approach \"hohohohihohohohi\": "+hiRecursion("hohohohihohohohi"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach for above took "+(endTime-startTime)+" nanoseconds");
    }

    public static int hiCount(String s){
        int hiCount = 0;
        for(int i = 0; i < s.length()-1;i++){
            if(s.charAt(i)=='h' && s.charAt(i+1)=='i'){
                hiCount++;
            }
        }
        return hiCount;
    }

    public static int hiRecursion(String s){
        int len = s.length();
        int count = 0;
        if(len == 0){
            return 0;
        } else if(s.charAt(0)=='h'&&s.charAt(1)=='i'){
            count++;
        }
        return count + hiRecursion(s.substring(1, len));
    }
}