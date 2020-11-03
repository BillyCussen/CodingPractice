/*
Candies.java
Billy Cussen
22/08/2020
*/

//Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
//For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. 
//Notice that multiple kids can have the greatest number of candies.

import java.util.List;
import java.util.ArrayList;

public class Candies{

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result = new ArrayList<>();
        int largest = candies[0];
        for(int i = 1; i < candies.length; i++){
            if(candies[i] > largest){
                largest = candies[i];
            }
        }

        for(int e : candies){
            if(e+extraCandies >= largest){
                result.add(true);
            } else{
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String [] args){

        Candies myCandies = new Candies();

        int[] candies = {2,3,5,1,3};
        List<Boolean> result1 = myCandies.kidsWithCandies(candies, 3);
        candies = null;

        for(int i = 0; i < result1.size(); i++){
            
            if(i == result1.size()-1){
                System.out.println(result1.get(i)+"]");
            } else if(i==0){
                System.out.print("["+result1.get(i)+", ");
            } else{
                System.out.print(result1.get(i)+", ");
            }
        }

        int[] candies1 = {4,2,1,1,2};
        result1 = myCandies.kidsWithCandies(candies1, 1);
        myCandies = null;
        candies1 = null;

        for(int i = 0; i < result1.size(); i++){
            
            if(i == result1.size()-1){
                System.out.println(result1.get(i)+"]");
            } else if(i==0){
                System.out.print("["+result1.get(i)+", ");
            } else{
                System.out.print(result1.get(i)+", ");
            }
        }

        result1 = null;

    }

}