/*
ArraySmallerNumbers.java
Billy Cussen
22/08/2020
*/

//Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
//That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
//Return the answer in an array.

public class ArraySmallerNumbers{

    public static void main(String [] args){
        //Variables
        int[] arr1 = {6,5,4,8}, arr2 = {7,7,7,7}, arr3 = {8,1,2,2,3};
        //Object
        ArraySmallerNumbersHelp myArrays = new ArraySmallerNumbersHelp();

        //Compute & Output
        int[] result1 = myArrays.smallerNumbersThanCurrent(arr1), result2 = myArrays.smallerNumbersThanCurrent(arr2), result3 = myArrays.smallerNumbersThanCurrent(arr3);
        int[][] results = {result1, result2, result3};

        for(int i = 0; i < results.length; i++){
            for(int j = 0; j < results[i].length; j++){

                if(j == 0){
                    System.out.print("["+results[i][j]+", ");
                } else if(j == results[i].length -1){
                    System.out.println(results[i][j]+"]");
                } else{
                    System.out.print(results[i][j]+", ");
                }

            }
        }
    }
}

class ArraySmallerNumbersHelp{

    //Constructor
    ArraySmallerNumbersHelp(){

    }

    //Compute & Getter
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    result[i]++;
                }
            }
        }
        return result;
    }
}