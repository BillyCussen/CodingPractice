/*
XORArray.java
Billy Cussen
23/08/2020
*/

//Given an integer n and an integer start.
//Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
//Return the bitwise XOR of all elements of nums.

public class XORArray{

    public static void main(String [] args){

        XORArrayHelp myXOR = new XORArrayHelp();
        System.out.println(myXOR.xorOperation(5, 0));
        System.out.println(myXOR.xorOperation(4, 3));
        System.out.println(myXOR.xorOperation(1, 7));
        System.out.println(myXOR.xorOperation(10, 5));
        myXOR = null;
    }
}

class XORArrayHelp{

    XORArrayHelp(){
    }

    /*
    Solution 1
    54 / 54 test cases passed.
    Runtime: 1 ms
    Memory Usage: 38.1 MB
    
    public int xorOperation(int n, int start) {
        int[] numArr = new int[n];
        int result = 0;
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = start + 2*i;
        }
        for(int j = 0; j < numArr.length; j++){
            result^=numArr[j];
        }
        return result;
    }
    */

    //Solution 2
    //54 / 54 test cases passed.
    //Runtime: 0 ms
    //Memory Usage: 36.4 MB
    public int xorOperation(int n, int start) {
        int result = 0;
        for(int i = 0; i < n; i++){
            result ^= start + 2*i;
        }
        return result;
    }   

}