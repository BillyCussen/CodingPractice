/*
ChangeXY.java
Billy Cussen
17/11/2020
*/
public class ChangeXY{

    public static void main(String[]args){

        System.out.println(changeXY("xxxABCabcXXX"));
        System.out.println(changeXYRec("xxxABCabcXXX"));
    }

    public static String changeXY(String word){
        String result = "";
        for(int i = 0; i < word.length();i++){
            if(word.charAt(i)=='x'){
                result+="y";
            } else if(word.charAt(i)=='X'){
                result+="Y";
            } else{
                result+=word.charAt(i);
            }
        }
        return result;
    }

    public static String changeXYRec(String word){
        if(word.length()<=0){
            return word;
        }

        if(word.charAt(0)=='x'){
            return "y" + changeXYRec(word.substring(1,word.length()));
        } else if(word.charAt(0)=='X'){
            return "Y" + changeXYRec(word.substring(1,word.length()));
        } else{
            return word.charAt(0) + changeXYRec(word.substring(1, word.length()));
        }
    }

}