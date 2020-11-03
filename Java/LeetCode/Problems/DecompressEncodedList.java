/*
DecompressEndodedList.java
Billy Cussen
23/08/2020
*/

//We are given a list nums of integers representing a list compressed with run-length encoding.
//Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  
//For each such pair, there are freq elements with value val concatenated in a sublist. 
//Concatenate all the sublists from left to right to generate the decompressed list.
//Return the decompressed list.

import java.util.List;
import java.util.ArrayList;

public class DecompressEncodedList{

    public static void main(String [] args){

        DecompressEndodedListHelp myEndodedList = new DecompressEndodedListHelp();
        int[] arr1 = {1,2,3,4};
        int[] result1 = myEndodedList.decompressRLElist(arr1);
        arr1 = null;
        int[] arr2 = {1,1,2,3};
        int[] result2 = myEndodedList.decompressRLElist(arr2);
        arr2 = null;
        myEndodedList = null;

        for(int i = 0; i < result1.length; i++){
            if(i == 0){
                System.out.print("["+result1[i]+", ");
            } else if(i == result1.length - 1){
                System.out.println(result1[i]+"]");
            } else{
                System.out.print(result1[i]+", ");
            }
        }
        result1 = null;

        for(int j = 0; j < result2.length; j++){
            if(j == 0){
                System.out.print("["+result2[j]+", ");
            } else if(j == result2.length - 1){
                System.out.println(result2[j]+"]");
            } else{
                System.out.print(result2[j]+", ");
            }
        }
        result2 = null;

    }

}

class DecompressEndodedListHelp{

    DecompressEndodedListHelp(){
    }

    /*
    Solution 1
    53 / 53 test cases passed.
    Runtime: 10 ms
    Memory Usage: 46.6 MB

    public int[] decompressRLElist(int[] nums) {
        List<Integer> tempList = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i+=2){
            int temp = nums[i];
            while(temp > 0){
                tempList.add(nums[i+1]);
                temp--;
            }
        }
        int[] result = new int[tempList.size()];
        for(int j = 0; j < result.length; j++){
            result[j] = tempList.get(j);
        }
        return result;
    }
    */

    //Solution 2
    //53 / 53 test cases passed.
    //Runtime: 2 ms
    //Memory Usage: 39.9 MB
    
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for(int i = 0; i < nums.length; i+=2){
            if(nums[i]==1){
                length++;
            } else{
                length+=nums[i];
            }
        }
        int[] result = new int[length];
        int position = 0;
        for(int j = 0; j < nums.length; j+=2){
            while(nums[j] > 0){
                result[position] = nums[j+1];
                nums[j]--;
                position++;
            }            
        }
        return result;
    }


}