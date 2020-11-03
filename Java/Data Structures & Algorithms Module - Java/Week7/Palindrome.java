/*
Palindrome.java
Billy Cussen
03/10/2020
*/

public class Palindrome{

    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.println("Palindrome Looped Approach: "+palindrome("madam"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Palindrome Recursive Approach: "+palindromeRecursion("madam"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");
    }

    public static boolean palindrome(String s){
        String sTemp = new String();
        for(int i = s.length()-1; i >= 0; i--){
            sTemp+=s.charAt(i);
        }
        return s.equals(sTemp);
    }

    public static boolean palindromeRecursion(String s){
        int len = s.length();
        if(len <= 1){
            return true;
        }
        boolean answer = s.charAt(0) == s.charAt(len-1);
        return answer && palindromeRecursion(s.substring(1,len-1));
    }
}