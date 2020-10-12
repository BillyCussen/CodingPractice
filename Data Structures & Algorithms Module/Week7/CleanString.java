/*
CleanString.java
Billy Cussn
12/10/2020
*/

public class CleanString{

    public static String cleanString(String s){
        StringBuffer sb = new StringBuffer();
        char a = s.charAt(0);
        sb.append(a);
        for(int i = 1; i < s.length(); i++){
            if(a == s.charAt(i)){
                sb.append("");
            } else{
                a = s.charAt(i);
                sb.append(a);
            }
        }
        return sb.toString();
    }

    public static String cleanStringRecursion(String s){
        if(s.length()<=1){
            return s;
        }

        if(s.charAt(1)==s.charAt(0)){
            return cleanStringRecursion(s.substring(1, s.length()));
        } else{
            return s.charAt(0)+cleanStringRecursion(s.substring(1, s.length()));
        }
    }

    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.println("Looped Solution: "+cleanString("xxyyzz"));
        long endTime = System.nanoTime();
        System.out.println("Looped Solution took "+(endTime-startTime)+" nanoseconds.");

        startTime = System.nanoTime();
        System.out.println("Recursive Solution: "+cleanStringRecursion("xxyyzz"));
        endTime = System.nanoTime();
        System.out.println("Recursive Solution took "+(endTime-startTime)+" nanoseconds.");

    }

}