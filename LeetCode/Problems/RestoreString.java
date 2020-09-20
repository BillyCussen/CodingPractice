/*
RestoreString.java
Billy Cussen
22/08/2020
*/

public class RestoreString{

    public static void main(String [] args){

        //Variables
        String s1 = "codeleet", s2 = "abc", s3 = "aiohn", s4 = "aaiougrt", s5 = "art";
        int[] indices1 ={4,5,6,7,0,2,1,3}, indices2 = {0,1,2}, indices3 = {3,1,4,2,0}, indices4={4,0,2,6,7,3,1,5}, indices5 = {1,0,2};

        //Object
        ShuffleString myShuffle = new ShuffleString();

        //Compute&Output
        System.out.println(myShuffle.restoreString(s1,indices1));
        System.out.println(myShuffle.restoreString(s2,indices2));
        System.out.println(myShuffle.restoreString(s3,indices3));
        System.out.println(myShuffle.restoreString(s4,indices4));
        System.out.println(myShuffle.restoreString(s5,indices5));
        myShuffle = null;
    }

}

class ShuffleString{

    //Construcor
    ShuffleString(){

    }

    //Compute & Getter
    /*
    Solution 1 - Using char Array, faster than StringBuffer
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for(int i = 0; i < ch.length; i++){
            ch[indices[i]] = s.charAt(i);
        }
        return new String(ch);
    }

    */

    
    /*
    Solution 2 - Using a StringBuffer
    public String restoreString(String s, int[] indices){
        StringBuffer sb = new StringBuffer(s);
        for(int i = 0; i < s.length(); i++){
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }
    */

    //Solution 3
    public String restoreString(String s, int[] indices){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            sb.append(" ");
        }

        for(int j = 0; j < indices.length; j++){
            sb.setCharAt(indices[j],s.charAt(j));
        }
        return sb.toString();
    }
}