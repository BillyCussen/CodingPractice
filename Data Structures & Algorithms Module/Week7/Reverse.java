/*
Reverse.java
Billy Cussen
03/10/2020
*/
public class Reverse{

    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.println("Reverse String Looped Approach: "+reverseStringLooped("Hello"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Reverse String Buffer Approach: "+reverseStringBuffer("Hello"));
        endTime = System.nanoTime();
        System.out.println("String Buffer Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Reverse String Recursive Approach: "+reverseStringRecursion("Hello"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");
    }

    public static String reverseStringLooped(String s){
        String newWord = new String();
        for(int i = s.length() - 1; i >= 0; i--){
            newWord += s.charAt(i);
        }
        return newWord;
    }

    public static String reverseStringBuffer(String s){
        StringBuffer sb = new StringBuffer();
        for(int i = s.length()-1; i >=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseStringRecursion(String s){
        int len = s.length();
        if (len == 1){
            return s;
        }
        return s.charAt(len-1) + reverseStringRecursion(s.substring(0,len-1));
    }
}