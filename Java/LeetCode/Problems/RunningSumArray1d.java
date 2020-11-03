/*
RunningSumArray1d.java
Billy Cussen
21/08/2020
*/

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.

public class RunningSumArray1d{

    public RunningSumArray1d(){

    }

    public int[] runningSum(int[] nums){

        int[] solutions = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < solutions.length; i++){
                sum += nums[i];
                solutions[i] = sum;
        }

        return solutions;
    }

    public static void main(String[] args){

        RunningSumArray1d myArraySum = new RunningSumArray1d();

        int[] array1 = {1,2,3,4};
        int[] result = myArraySum.runningSum(array1);
        System.out.print("[");
        for(int i = 0; i < result.length; i++){
            
            if(i == result.length-1){
                System.out.print(result[i]); 
            } else{
                System.out.print(result[i]+", ");
            }
        }
        System.out.println("]");

    }

}