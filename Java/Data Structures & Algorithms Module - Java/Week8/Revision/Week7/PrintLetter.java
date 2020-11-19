/*
PrintLetter.java
Billy Cussen
19/11/2020
*/
public class PrintLetter{

    public static void main(String [] args){

        System.out.println("Print Letter:\n"+printLetter("Hello"));
        System.out.println("Print Letter Recursion:\n"+printLetterRecursion("Hello"));
    }

    public static String printLetter(String word){
        String result = "";
        for(int i = 0; i < word.length();i++){
            result+=word.charAt(i)+"\n";
        }
        return result; 
    }

    public static String printLetterRecursion(String word){
        if(word.length()<=1){
            return word;
        }
        return word.charAt(0)+"\n"+printLetterRecursion(word.substring(1,word.length()));
    }

}