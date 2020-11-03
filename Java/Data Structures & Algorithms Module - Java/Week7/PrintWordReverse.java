/*
PrintWordReverse.java
Billy Cussen
14/10/2020
*/

public class PrintWordReverse{

    public static String printWordReverseLooped(String s){
        String result = new String();
        for(int i = s.length()-1; i >= 0; i--){
            result+=s.charAt(i);
        }
        return result;
    }

    public static String printWordReverseStringBuffer(String s){
        StringBuffer sb = new StringBuffer();
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String printWordReverseRecursive(String s){
        if(s.length() < 1){
            return s;
        }
        return printWordReverseRecursive(s.substring(1))+s.charAt(0);
    }

    public static String printWordReverseRecursiveAlt(String s){
        return printWordReverseRecursiveAlt(s, s.length()-1);
    }

    public static String printWordReverseRecursiveAlt(String s, int index){
        if(index < 0){
            return "";
        }
        return s.charAt(index)+printWordReverseRecursiveAlt(s,index-1);
    }

    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.println("Print Word Reverse Looped Approach: "+printWordReverseLooped("Hello"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Print Word Reverse Looped w/ StringBuffer Approach: "+printWordReverseStringBuffer("Hello"));
        endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Print Word Reverse Recursive Approach: "+printWordReverseRecursive("Hello"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.println("Print Word Reverse Alternative Recursive Approach: "+printWordReverseRecursiveAlt("Hello"));
        endTime = System.nanoTime();
        System.out.println("Alternative Recursive Approach took "+(endTime-startTime)+" nanoseconds");
    }
}