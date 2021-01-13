/*
RecursionRevision.java
Billy Cussen
13/01/2021
*/
public class RecursionRevision{

    public String changeXY(String word){
        if(word.length()==0){
            return word;
        }

        if(word.charAt(0)=='x' || word.charAt(0)=='X'){
            return "y" + changeXY(word.substring(1, word.length()));
        } else{
            return word.charAt(0)+changeXY(word.substring(1, word.length()));
        }
    }

    public String cleanString(String word){
        if(word.length()<=1){
            return word;
        }

        if(word.charAt(1)==word.charAt(0)){
            return cleanString(word.substring(1, word.length()));
        } else{
            return word.charAt(0) + cleanString(word.substring(1, word.length()));
        }
    }

    public int factorial(int a, int n){
        if(n == 0 || n == 1){
            return a;
        }
        return a * factorial(a, --n);
    }

    public int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public int hi(String word){
        if(word.length()<=1){
            return 0;
        }

        if(word.charAt(0)=='h'&&word.charAt(1)=='i'){
            return 1 + hi(word.substring(2, word.length()));
        } else{
            return hi(word.substring(1, word.length()));
        }
    }

    public boolean matchBraces(String str){
        if(str.length()==0){
            return true;
        }

        if(str.length()%2!=0){
            return false;
        } else{
            return matchBraces(str.substring(1, str.length()-1)) && (str.charAt(0)=='{' && str.charAt(str.length()-1)=='}');
        } 
    }

    public String moveX(String str){
        if(str.length()<=1){
            return str;
        }

        if(str.charAt(0)=='x' || str.charAt(0)=='X'){
            return moveX(str.substring(1, str.length())) + str.charAt(0);
        } else{
            return str.charAt(0) + moveX(str.substring(1, str.length()));
        }
    }

}