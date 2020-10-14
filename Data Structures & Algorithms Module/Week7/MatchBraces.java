/*
MacthBraces.java
Billy Cussen
14/10/2020
*/
public class MatchBraces{

    public static boolean matchBraces(String s){
        if(s.length()%2!=0){
            return false;
        } else{
            boolean result = true;
            int j = s.length()-1;
            for(int i = 0 ; i < s.length()/2;i++){
                if(s.charAt(i)!='('&&s.charAt(j)!=')'){
                    result = false;
                    break;
                }else{
                    j--;
                }
            }
            return result;
        }
    }

    public static boolean matchBracesRecursive(String s){
        if(s.length()==0){
            return true;
        }

        if(s.length()%2!=0){
            return false;
        } else{
            return matchBracesRecursive(s.substring(1,s.length()-1))&&(s.charAt(0)=='('&&s.charAt(s.length()-1)==')');
        }
    }

    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.println("Match Braces Looped Approach Example 1: "+matchBraces("((()))"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Match Braces Recursive Approach Example 1: "+matchBracesRecursive("((()))"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds\n");

        startTime = System.nanoTime();
        System.out.println("Match Braces Looped Approach Example 2: "+matchBraces("())"));
        endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Match Braces Recursive Approach Example 2: "+matchBracesRecursive("())"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds\n");

        startTime = System.nanoTime();
        System.out.println("Match Braces Looped Approach Example 3: "+matchBraces(")"));
        endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Match Braces Recursive Approach Example 3: "+matchBracesRecursive(")"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds\n");

        startTime = System.nanoTime();
        System.out.println("Match Braces Looped Approach Example 4: "+matchBraces("(())"));
        endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Match Braces Recursive Approach Example 4: "+matchBracesRecursive("(())"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds\n");

    }

}