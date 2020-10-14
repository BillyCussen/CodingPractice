/*
PrintLetter.java
Billy Cussen
14/10/2020
*/

public class PrintLetter{

    public static String printLetter(String s){
        String result = new String();
        for(int i = 0; i<s.length();i++){
            result+=s.charAt(i)+"\n";
        }
        return result;
    }

    public static String printLetterRecursive(String s){
        if(s.length()<1){
            return s;
        }

        return s.charAt(0)+"\n"+printLetterRecursive(s.substring(1));
    }

    public static void main(String[]args){

        long startTime = System.nanoTime();
        System.out.print("***Print Letter Looped***\n"+printLetter("Hello"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took: "+(endTime-startTime)+" nanoseconds.");
  
        startTime = System.nanoTime();
        System.out.print("\n***Print Letter Recursive***\n"+printLetterRecursive("Hello"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took: "+(endTime-startTime)+" nanoseconds.");
        
    }
}