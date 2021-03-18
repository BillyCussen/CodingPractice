/*
Recursion.java
Billy Cussen
17/03/2021
*/

/*
3A. Write a recursive function that reverses a given string. For instance, if the given string is “java”
the output is “avaj”.
*/

public class Recursion {
    
    public static String reverse(String str){
        if(str.length() <= 0){
            return str;
        }

        return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
    }

    public static void main(String[]args){

        System.out.println("Reverse \"java\": "+reverse("java"));
        System.out.println("Reverse \"billy\": "+reverse("billy"));
        System.out.println("Reverse \"Taco cat\": "+reverse("Taco cat"));
    }   
}
