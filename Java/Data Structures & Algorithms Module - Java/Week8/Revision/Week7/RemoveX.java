/*
RemoveX.java
Billy Cussen
19/11/2020
*/
public class RemoveX{

    public static void main(String[] args){

        System.out.println("Remove X: "+removeX("BxixlxlxyX CxuXsXsXeXnx"));
        System.out.println("Remove X Recursion: "+removeXRecursion("BxixlxlxyX CxuXsXsXeXnx"));
    }

    public static String removeX(String word){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < word.length();i++){
            if(word.charAt(i)!='x' && word.charAt(i)!='X'){
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeXRecursion(String word){
        if(word.length()<=0){
            return word;
        }

        if(word.charAt(0)!='x'&&word.charAt(0)!='X'){
            return word.charAt(0) + removeXRecursion(word.substring(1,word.length()));
        } else{
            return removeXRecursion(word.substring(1,word.length()));
        }
    }

}