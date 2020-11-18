/*
MoveX.java
Billy Cussen
18/11/2020
*/

public class MoveX{

    private int spaceTrigger = 1;

    public static void main(String[]args){

        MoveX myMoveX = new MoveX();

        long startTime = System.nanoTime();
        System.out.println("Move X: "+moveX("HxexlXlxoX"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");
        
        startTime = System.nanoTime();
        System.out.println("Move X Recursion: "+myMoveX.moveXRecursion("HxexlXlxoX"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");
    }

    public static String moveX(String word){
        StringBuffer sb = new StringBuffer();
        String x = "";
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)=='X' || word.charAt(i)=='x'){
                x += word.charAt(i);
            } else{
                sb.append(word.charAt(i));
            }
        }
        sb.append(" "+x);
        return sb.toString();
    }

    public String moveXRecursion(String word){
        if(word.length()==0){
            return word;
        }

        if(spaceTrigger==1){
            word+= " ";
            spaceTrigger++;
        }

        if(word.charAt(0)=='X' || word.charAt(0)=='x'){
            return moveXRecursion(word.substring(1,word.length()))+word.charAt(0);
        } else{
            return word.charAt(0) + moveXRecursion(word.substring(1,word.length()));
        }
    }

}