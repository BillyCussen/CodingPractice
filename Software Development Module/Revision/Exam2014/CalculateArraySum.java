/*
CalculateArraySum.java
Billy Cussen
10/08/2020
*/

//Develop a method which calculates the following two sums of the elements from a onedimensional array:
//1. the sum of those values that are odd numbers
//2. the sum of those values that are multiple of 4

public class CalculateArraySum{

    public static void main(String [] args){

        //Contains both Odd and Multiples of 4
        int[] array1 = {5,2,7,4,6,3,16};
        //Contains Odd Numbers but no Multiples of 4
        int[] array2 = {10,15,22,31,46};
        //Contains No Odd or Multiples of 4
        int[] array3 = {2,6,10,14,30};

        String result1 = calculateArraySums(array1);
        System.out.println("***ARRAY 1***\n"+result1+"\n");
        String result2 = calculateArraySums(array2);
        System.out.println("***ARRAY 2***\n"+result2+"\n");
        String result3 = calculateArraySums(array3);
        System.out.println("***ARRAY 3***\n"+result3+"\n");
    }

    public static String calculateArraySums(int[] inputArray){

        String result = new String();
        int oddSum = 0;
        int multipleSum = 0;

        for(int i = 0; i < inputArray.length; i++){

            if(inputArray[i] % 2 != 0){
                oddSum += inputArray[i];
            }

            if(inputArray[i] % 4 == 0){
                multipleSum += inputArray[i];
            }

        }

        result = "Sum of Odd Numbers: "+oddSum+"\nSum of Numbers that are multiples of 4: "+multipleSum;

        return result;
    }

}