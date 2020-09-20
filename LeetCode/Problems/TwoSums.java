/*
TwoSums.java
Billy Cussen
21/08/2020
*/

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class TwoSums{

    public int sums[];

    public int[] getTwoSums(int[] array, int target){

            for(int i = 0; i < array.length; i++){

                for(int j = i+1; j < array.length; j++){

                    if(array[j] == target - array[i]){
                        sums = new int[] {i,j};
                        break;
                    }

                }

            }

            return sums;
    }

    public static void main(String[] args){

        TwoSums myTwoSums = new TwoSums();

        int[] array1 = {1,6,3,9};
        int[] result = myTwoSums.getTwoSums(array1, 9);
        System.out.println("["+result[0]+", "+result[1]+"]");

        int[] array2 = {1,2,3,3};
        int[] result1 = myTwoSums.getTwoSums(array2, 6);
        System.out.println("["+result1[0]+", "+result1[1]+"]");

    }

}

