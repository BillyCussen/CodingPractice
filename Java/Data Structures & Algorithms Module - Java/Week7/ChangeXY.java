/*
ChangeXY.java
Billy Cussen
12/10/2020
*/

public class ChangeXY{

    public static String changeXY(String s){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='x'||s.charAt(i)=='X'){
                sb.append("y");
            } else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String changeXYRecursion(String s){
        if(s.length() == 0){
            return s;
        }

        if(s.charAt(0)=='x'||s.charAt(0)=='X'){
            return "y" + changeXYRecursion(s.substring(1, s.length()));
        } else{
            return s.charAt(0) + changeXYRecursion(s.substring(1, s.length()));
        }
    }

    public static void main(String [] args){

        long startTime = System.nanoTime();
        System.out.println("Looped Solution: "+changeXY("Xes, this is Billx"));
        long endTime = System.nanoTime();
        System.out.println("Looped Solution took "+(endTime-startTime)+" nanoseconds.");

        startTime = System.nanoTime();
        System.out.println("Recursive Solution: "+changeXYRecursion("Xes, this is Billx"));
        endTime = System.nanoTime();
        System.out.println("Recursive Solution took "+(endTime-startTime)+" nanoseconds.");
    }

}