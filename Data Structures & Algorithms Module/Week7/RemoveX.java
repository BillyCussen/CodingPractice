/*
RemoveX.java
Billy Cussen
05/10/2020
*/

public class RemoveX{

    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.println("Remove X Looped: "+removeX("Bxixlxlxyx Cxuxsxsxexn"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach with StringBuffer took: "+(endTime-startTime)+" nanoseconds.");

        startTime = System.nanoTime();
        System.out.println("Remove X Recursive Approach: "+removeXRecursive("Bxixlxlxyx Cxuxsxsxexn"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took: "+(endTime-startTime)+" nanoseconds.");
    }

    public static String removeX(String s){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i)!='x'&&s.charAt(i)!='X'){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeXRecursive(String s){
        if(s.length() == 0){
            return s;
        } else if(s.charAt(0)=='x'||s.charAt(0)=='X'){
            return removeXRecursive(s.substring(1, s.length()));
        } else{
            return s.charAt(0) + removeXRecursive(s.substring(1,s.length()));
        }


    }
}