/*
ProductSum.java
Billy Cussen
23/08/2020
*/

//Given an integer number n, return the difference between the product of its digits and the sum of its digits.

import java.util.ArrayList;

public class ProductSum{

    public static void main(String [] args){

        ProductSumHelp myProductSum = new ProductSumHelp();
        System.out.println(myProductSum.subtractProductAndSum(234));
        System.out.println(myProductSum.subtractProductAndSum(4421));
        myProductSum = null;
    }

}

class ProductSumHelp{

    ProductSumHelp(){
    }

    /*
    Solution 1
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> numArray = new ArrayList<Integer>();
        int product = 1, sum = 0;
        do{
            numArray.add(n % 10);
            n /= 10;
        } while (n > 0);
        for(int e: numArray){
            product*=e;
            sum+= e;
        }
        return product - sum;
    }
    */

    //Solution 2
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        do{
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }while(n > 0);
        return product - sum;
    }
}