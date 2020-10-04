/*
RecursionRevision.java
Billy Cussen
04/10/2020
*/
public class RecursionRevision{

    public static void main(String [] args){

        System.out.println("***Fibonacci Sequence***");
        for(int i = 0; i < 10; i++){
            System.out.println("Fib: "+fib(i)+", Recursion: "+fibRecursion(i));
        }

        System.out.println("***Palindrome***");
        System.out.println("Palindrome: "+palindrome("madam")+", Recursion: "+palindromeRecursion("madam"));

        System.out.println("***Power of a Number***");
        System.out.println("Power: "+power(3,3)+", Recursion: "+powerRecursion(3,3));

        System.out.println("***Reverse String***");
        System.out.println("Reverse: "+reverse("hello")+", Recursion: "+reverseRecursion("hello"));
    }

    public static int fib(int n){
        int a = 0, b = 1, c = 0;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int fibRecursion(int n){
        if(n <= 1){
            return n;
        }
        return fibRecursion(n-1)+fibRecursion(n-2);
    }

    public static boolean palindrome(String s){
        StringBuffer sb = new StringBuffer();
        for(int i = s.length() - 1; i >= 0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString().equals(s);
    }

    public static boolean palindromeRecursion(String s){
        int len = s.length()-1;
        if(len <= 1){
            return true;
        }
        boolean result = s.charAt(0) == s.charAt(len);
        return result && palindromeRecursion(s.substring(1, len-1));
    }

    public static int power(int n, int e){
        int answer = 1;
        for(int i = 0; i < e; i++){
            answer*=n;
        }
        return answer;
    }

    public static int powerRecursion(int n, int e){
        if(e <= 1){
            return n;
        }
        return n * powerRecursion(n, e-1);
    }

    public static String reverse(String s){
        StringBuffer sb = new StringBuffer();
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseRecursion(String s){
        int len = s.length();
        if(len <= 1){
            return s;
        }
        return s.charAt(len - 1)+reverseRecursion(s.substring(0,len-1));
    }

}

