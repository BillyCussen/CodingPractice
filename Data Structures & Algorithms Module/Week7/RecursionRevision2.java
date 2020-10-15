/*
RecursionRevision2.java
Billy Cussen
15/10/2020
*/

public class RecursionRevision2{

    public static String moveX(String s){
        if(s.length()<1){
            return s;
        }
        if(s.charAt(0)=='x'||s.charAt(0)=='X'){
            return moveX(s.substring(1))+s.charAt(0);
        } else{
            return s.charAt(0)+moveX(s.substring(1));
        }
    }

    public static String removeX(String s){
        if(s.length()<1){
            return s;
        }
        if(s.charAt(0)=='x'||s.charAt(0)=='X'){
            return removeX(s.substring(1));
        } else{
            return s.charAt(0)+removeX(s.substring(1));
        }
    }

    public static boolean palindrome(String s){
        if(s.length()<=1){
            return true;
        }
        return s.charAt(0)==s.charAt(s.length()-1)&&palindrome(s.substring(1,s.length()-1));
    }

    public static int fibonacci(int n){
        if(n == 0||n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static String changeXY(String s){
        if(s.length()==0){
            return s;
        }

        if(s.charAt(0)=='x'||s.charAt(0)=='y'){
            return 'y' + changeXY(s.substring(1));
        } else{
            return s.charAt(0) + changeXY(s.substring(1));
        }
    }

    public static String cleanString(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return cleanString(s.substring(1));
        } else{
            return s.charAt(0)+cleanString(s.substring(1));
        }
    }

    public static int factorial(int n){
        if(n==0||n==1){
            return n;
        }

        return n * factorial(n-1);
    }

    public static int hi(String s){
        if(s.length()<=1){
            return 0;
        }
        int count = 0;
        if(s.charAt(0)=='h'&&s.charAt(1)=='i'){
            count++;
        }
        return count +hi(s.substring(1));
    }

    public static boolean matchBraces(String s){
        if(s.length()==0){
            return true;
        }
        if(s.length()%2!=0){
            return false;
        } 
        return s.charAt(0)=='('&&s.charAt(s.length()-1)==')'&&matchBraces(s.substring(1,s.length()-1));
    }

    public static String printLetter(String s){
        if(s.length()==0){
            return s;
        }

        return s.charAt(0)+"\n"+printLetter(s.substring(1));
    }

    public static String printLetterReverse(String s){
        if(s.length()==0){
            return "";
        }
        return s.charAt(s.length()-1)+"\n"+printLetterReverse(s.substring(0,s.length()-1));
    }

    public static String printWordReverse(String s){
        if(s.length()==0){
            return "";
        }
        return s.charAt(s.length()-1)+printWordReverse(s.substring(0,s.length()-1));
    }

    public static void main(String [] args){
        System.out.println("Move X: " +moveX("BxiXlxlXyx CxuXsXseXnx "));
        System.out.println("Remove X: " +removeX("BxiXlxlXyx CxuXsXseXnx"));
        System.out.println("Is \"madam\" a palindrome: " +palindrome("madam"));
        System.out.println("Is \"madal\" a palindrome: "+palindrome("madal"));
        System.out.println("Change x's in \"hxdrolxticallx\" to y's: "+changeXY("hxdrolxticallx"));
        System.out.println("Change x's in \"hxdrolxticallx\" to y's: "+changeXY("hxpabxssallx"));
        System.out.println("Clean String (Remove Duplicates): "+cleanString("xxxyyyzzz"));
        System.out.println("Multiply a number by all previous Numbers: "+factorial(5));
        System.out.println("Count all \"hi\" in a String: "+hi("hihihihihihihi"));
        System.out.println("Match Braces in \"((()))\": "+matchBraces("((()))"));
        System.out.println("Match Braces in \"((())\": "+matchBraces("((())"));
        System.out.println("Match Braces in \"(\": "+matchBraces("("));
        System.out.println("Print the word \"Hello\" in Reverse:"+printWordReverse("Hello"));

        System.out.println("Print each letter in \"Hello\":\n"+printLetter("Hello"));
        System.out.println("Print each letter in reverse in \"Hello\":\n"+printLetterReverse("Hello"));

        System.out.println("Fibonacci Sequence: ");
        for(int i = 0; i < 10; i++){
            System.out.println(fibonacci(i));
        }
    }

}