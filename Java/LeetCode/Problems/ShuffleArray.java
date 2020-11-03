/*
ShuffleArray.java
Billy Cussen
22/08/2020
*/

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].

public class ShuffleArray{

    public int[] shuffle(int[] nums, int n) {
        int[] results = new int[nums.length];
        int tempPositionA = 0;
        int tempPositionB = 1;

        for(int i = 0; i < results.length / 2; i++){
            results[tempPositionA] = nums[i];
            results[tempPositionB] = nums[i+n];
            tempPositionA+=2;
            tempPositionB+=2;
        }

        return results;
    }

    public static void main(String [] args){

        ShuffleArray myShuffle = new ShuffleArray();

        int[] nums1 = {2,5,1,3,4,7};
        int[] result1 = myShuffle.shuffle(nums1,3);

        for(int i = 0 ; i < result1.length; i++){
            
            if(i==0){
                System.out.print("["+result1[i]+", ");
            } else if (i == result1.length -1){
                System.out.println(result1[i]+"]");
            } else{
                System.out.print(result1[i]+", ");
            }

        }

        int[] nums2 = {1,2,3,4,4,3,2,1};
        int[] results2 = result1 = myShuffle.shuffle(nums2,4);

        for(int i = 0 ; i < result1.length; i++){
            
            if(i==0){
                System.out.print("["+result1[i]+", ");
            } else if (i == result1.length -1){
                System.out.println(result1[i]+"]");
            } else{
                System.out.print(result1[i]+", ");
            }

        }

    }

}