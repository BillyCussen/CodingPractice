/*
MoveX.java
Billy Cussen
05/10/2020
*/
import java.util.ArrayList;
public class MoveX{

    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.println("Move X Looped: "+moveX("XeXRXxxoxxx "));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach with StringBuffer took: "+(endTime-startTime)+" nanoseconds.");

        startTime = System.nanoTime();
        System.out.println("Move X Recursive Approach: "+moveXRecursion("XeXRXxxoxxx "));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took: "+(endTime-startTime)+" nanoseconds.");
    }

    public static String moveX(String s){
        StringBuffer sb = new StringBuffer();
        ArrayList<Character> chars = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='x'||s.charAt(i)=='X'){
                chars.add(s.charAt(i));
            } else{
                System.out.println(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        for(Character e: chars){
            sb.append(e);
        }
        return sb.toString();
    }

    public static String moveXRecursion(String s){
        if(s.length()==0){
            return s;
        } else if(s.charAt(0)=='x'||s.charAt(0)=='X'){
            return moveXRecursion(s.substring(1, s.length()))+s.charAt(0);
        } else{
            return s.charAt(0) + moveXRecursion(s.substring(1,s.length()));
        }
    }
}
