/*
MatchBraces.java
Billy Cussen
18/11/2020
*/
public class MatchBraces{

    public static void main(String[]args){

        long startTime = System.nanoTime();
        System.out.println("Match Braces ({{{}}}): "+matchBraces("{{{}}}"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");
        
        startTime = System.nanoTime();
        System.out.println("Match Braces Recursion ({{{}}}): "+matchBracesRecursion("{{{}}}"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Match Braces ({{{}}): "+matchBraces("{{{}}"));
        endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Match Braces Recursion ({{{}}): "+matchBracesRecursion("{{{}}"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Match Braces ({}): "+matchBraces("{}"));
        endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Match Braces Recursion ({}): "+matchBracesRecursion("{}"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");
    }

    public static boolean matchBraces(String braces){
        if(braces.length()%2!=0){
            return false;
        } else{
            boolean checkBraces = true;
            int stringLength = braces.length()-1;
            for(int i = 0; i < braces.length()/2;i++){
                if(braces.charAt(i)=='{' &&braces.charAt(stringLength)=='}'){
                    stringLength--;
                } else{
                    checkBraces = false;
                    break;
                }
            }
            return checkBraces;
        }
    }

    public static boolean matchBracesRecursion(String braces){
        if(braces.length()<=0){
            return true;
        } else if (braces.length()%2!=0){
            return false;
        } 
        
        if(braces.charAt(0)=='{' && braces.charAt(braces.length()-1)=='}'){
            return matchBracesRecursion(braces.substring(1,braces.length()-1));
        } else{
            return matchBracesRecursion(braces.substring(1,braces.length()-1));
        }
    }
}