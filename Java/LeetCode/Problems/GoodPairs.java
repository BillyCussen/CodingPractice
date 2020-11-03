/*
GoodPairs.java
Billy Cussen
22/08/2020
*/

//Given an array of integers nums.
//A pair (i,j) is called good if nums[i] == nums[j] and i < j.
//Return the number of good pairs.

public class GoodPairs{

    public static void main(String [] args) {
        
        //Variables
        int[] array1 = {1,2,3,1,1,3};
        int[] array2 = {1,1,1,1};
        int[] array3 = {1,2,3};

        //Objects
        GoodPairsHelp goodPairs = new GoodPairsHelp();

        //Compute & Output
        System.out.println(goodPairs.numIdenticalPairs(array1));
        System.out.println(goodPairs.numIdenticalPairs(array2));
        System.out.println(goodPairs.numIdenticalPairs(array3));
        goodPairs = null;
    }
}

class GoodPairsHelp{

    //Constructor
    GoodPairsHelp(){

    }
    
    //Compute & Getter
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if((nums[i] == nums[j])&&(i != j)){
                    goodPairs++;
                }
            }
        }

        return goodPairs/2;
    }

}