/*
Palindrome.java
Billy Cussen
18/11/2020
*/
public class Palindrome{

    public static void main(String[]args){

        long startTime = System.nanoTime();
        System.out.println("Palindrome: "+palindrome("moddom"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");
        
        startTime = System.nanoTime();
        System.out.println("Palindrome Recursion: "+palindromeRecursion("moddom"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Palindrome: "+palindrome("hello"));
        endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Palindrome Recursion: "+palindromeRecursion("hello"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");
    }

    public static boolean palindrome(String word){
        if(word.length()%2!=0){
            return false;
        } else{
            int lenTemp = word.length()-1;
            boolean pal = true;
            for(int i = 0; i < word.length()/2;i++){
                if(word.charAt(i)==word.charAt(lenTemp)){
                    lenTemp--;
                } else{
                    pal = false;
                    break;
                }
            }
            return pal;
        }
    }

    public static boolean palindromeRecursion(String word){
        if(word.length()==0){
            return true;
        } else{
            if(word.length()%2!=0){
                return false;
            } else if(word.charAt(0)==word.charAt(word.length()-1)){
                return palindromeRecursion(word.substring(1,word.length()-1));
            } else{
                return false;
            }
        }
    }

}