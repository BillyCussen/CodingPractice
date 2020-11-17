/*
CleanString.java
Billy Cussen
17/11/2020
*/

public class CleanString{

    public static void main(String [] args){

        System.out.println(cleanString("aaabbbbxxxxdddddwwwwww"));
        System.out.println(cleanStringRecursion("aaabbbbxxxxdddddwwwwww"));
    }

    public static String cleanString(String word){
        StringBuffer sb = new StringBuffer();
        char a = word.charAt(0);
        sb.append(a);
        for(int i = 1; i < word.length();i++){
            if(a==word.charAt(i)){
                sb.append("");
            } else{
                a = word.charAt(i);
                sb.append(a);
            }
        }
        return sb.toString();
    }

    public static String cleanStringRecursion(String word){
        if(word.length()<=1){
            return word;
        }

        if(word.charAt(0)==word.charAt(1)){
            return "" + cleanStringRecursion(word.substring(1,word.length()));
        } else{
            return word.charAt(0) + cleanStringRecursion(word.substring(1,word.length()));
        }
    }

}