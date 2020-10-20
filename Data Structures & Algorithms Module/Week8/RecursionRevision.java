/*
RecursionRevision.java
Billy Cussen
19/10/2020
*/

public class RecursionRevision{

    public static String moveX(String s){
        if(s.length()==0){
            return s;
        }

        if(s.charAt(0)=='x'||s.charAt(0)=='X'){
            return moveX(s.substring(1))+s.charAt(0);
        } else{
            return s.charAt(0)+moveX(s.substring(1));
        }
    }

    public static String removeX(String s){
        if(s.length()==0){
            return s;
        }

        if(s.charAt(0)=='x'||s.charAt(0)=='X'){
            return removeX(s.substring(1));
        } else{
            return s.charAt(0)+removeX(s.substring(1));
        }
    }

    public static String changeX(String s){
        if(s.length()==0){
            return s;
        }

        if(s.charAt(0)=='x'){
            return "y"+changeX(s.substring(1));
        } else if(s.charAt(0)=='X'){
            return "Y"+changeX(s.substring(1));
        } else{
            return s.charAt(0)+changeX(s.substring(1));
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

    public static int multiplyBy(int n){
        if(n==0||n==1){
            return n;
        }

        return n * multiplyBy(n-1);
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int countHi(String s){
        if(s.length()<=1){
            return 0;
        }

        if(s.charAt(0)=='h'&&s.charAt(1)=='i'){
            return 1 + countHi(s.substring(1));
        } else{
            return countHi(s.substring(1));
        }
    }

    public static boolean matchBraces(String s){
        if(s.length()==0){
            return true;
        }

        if(s.length()%2!=0){
            return false;
        } else{
            return (s.charAt(0)=='('&&s.charAt(s.length()-1)==')')&&matchBraces(s.substring(1,s.length()-1));
        }
    }

    public static boolean palindrome(String s){
        if(s.length()<=1){
            return true;
        }

        return (s.charAt(0)==s.charAt(s.length()-1))&&palindrome(s.substring(1,s.length()-1));
    }

    public static int power(int n, int e){
        if(e==1){
            return n;
        }
        return n * power(n,e-1);
    }

    public static String printLetters(String s){
        if(s.length()==1){
            return s;
        }

        return s.charAt(0)+"\n"+printLetters(s.substring(1));
    }

    public static String printBackwards(String s){
        if(s.length()<=1){
            return s;
        }

        return printBackwards(s.substring(1))+s.charAt(0);
    }

    public static String printLettersBackwards(String s){
        if(s.length()==0){
            return s;
        }

        return printLettersBackwards(s.substring(1))+s.charAt(0)+"\n";
    }

    public static int sumDigits(int n){
        if(n<=0){
            return n;
        }

        return (n%10)+sumDigits(n/10);
    }

    public static void main(String[]args){

        System.out.println("Move X: "+moveX("Bxixlxlyx "));
        System.out.println("Remove X: "+removeX("Bxixlxlyx"));
        System.out.println("Change X: "+changeX("xes, billx is mx name"));
        System.out.println("Clean String: "+cleanString("aabbccddeeffgghhiiijjjkkklllmmmmnnnnnopqrsttttttttttttttttttttttttttttttuuuuuuuuuuuuuvxyzzzzzzzzzzzzzz"));
        System.out.println("Multiply By: "+multiplyBy(5));
        System.out.print("Fibonacci Sequence: ");
        for(int i = 0; i <= 10; i++){
            if(i == 10){
                System.out.println(fibonacci(i) +".");
            } else{
                System.out.print(fibonacci(i)+", ");
            }
        }
        System.out.println("Count hi: "+countHi("hihihellohellohihihellohihihi"));
        System.out.println("Match Braces: "+matchBraces("((()))"));
        System.out.println("Match Braces: "+matchBraces("(()))"));
        System.out.println("Match Braces: "+matchBraces("))"));
        System.out.println("Palindrome: "+palindrome("madam"));
        System.out.println("Palindrome: "+palindrome("madar"));
        System.out.println("Power: "+power(2,5));
        System.out.println("Power: "+power(3,3));
        System.out.println("Print Letters\n"+printLetters("abcde"));
        System.out.println("Print Backwards: "+printBackwards("abcde"));
        System.out.print("Print Letters Backwards:\n"+printLettersBackwards("abcde"));
        System.out.println("Sum Digits: "+sumDigits(12345));
    }

}