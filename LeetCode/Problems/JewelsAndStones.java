/*
JewelsAndStones.java
Billy Cussen
22/08/2020
*/

//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
//Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

public class JewelsAndStones{

    public static void main(String[] args){

        //Variables
        String J1 = "aA", S1 = "aAAbbbb", J2 = "z", S2 = "ZZ", J3="ZnS", S3 = "ZmZlsSuinz";

        //Object
        JewelsAndStonesHelp myJewels = new JewelsAndStonesHelp();

        //Process & Output
        System.out.println(myJewels.numJewelsInStones(J1,S1));
        System.out.println(myJewels.numJewelsInStones(J2,S2));
        System.out.println(myJewels.numJewelsInStones(J3,S3));
        myJewels = null;
    }


}

class JewelsAndStonesHelp{

    //Constructor
    JewelsAndStonesHelp(){

    }

    //Compute & Getter
    public int numJewelsInStones(String J, String S) {
        int jewelsTotal = 0;

        for(int i = 0; i < J.length(); i++){
            for(int j = 0; j < S.length(); j++){
                if(J.charAt(i)==S.charAt(j)){
                    jewelsTotal++;
                }
            }
        }
        return jewelsTotal;
    }

}