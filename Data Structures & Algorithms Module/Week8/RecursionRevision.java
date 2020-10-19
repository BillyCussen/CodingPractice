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

    public static void main(String[]args){

        System.out.println("Move X: "+moveX("Bxixlxlyx "));
        System.out.println("Remove X: "+removeX("Bxixlxlyx"));
        System.out.println("Change X: "+changeX("xes, billx is mx name"));
    }

}