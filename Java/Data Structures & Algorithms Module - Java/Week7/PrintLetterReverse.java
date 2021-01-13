

/*
PrintLetterReverse.java
Billy Cussen
14/10/2020
*/
public class PrintLetterReverse{

    public static String printLetterReverse(String s){
        String result = new String();
        for(int i = s.length()-1;i >= 0; i--){
            result+=s.charAt(i)+"\n";
        }
        return result;
    }

    public static String printLetterReverseRecursive(String s){
        if(s.length() < 1){
            return s;
        }

        return s.charAt(s.length()-1)+"\n"+printLetterReverseRecursive(s.substring(0,s.length()-1));
    }

    public static String printLetterReverseRecursiveAlt(String s){
        if(s.length() < 1){
            return s;
        }
        return printLetterReverseRecursiveAlt(s.substring(1))+s.charAt(0)+"\n";
    }

    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.print("***Print Letter Reverse Looped***\n"+printLetterReverse("Hello"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");

        startTime = System.nanoTime();
        System.out.print("\n***Print Letter Reverse Recursive***\n"+printLetterReverseRecursive("Hello"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");        

        startTime = System.nanoTime();
        System.out.print("\n***Print Letter Reverse Recursive Alternative***\n"+printLetterReverseRecursiveAlt("Hello"));
        endTime = System.nanoTime();
        System.out.println("Recursive Alternative Approach took "+(endTime-startTime)+" nanoseconds");  
    }

}