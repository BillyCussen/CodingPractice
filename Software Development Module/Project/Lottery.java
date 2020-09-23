/*
Lottery.java
Billy Cussen
20/09/2020
*/

//In Progress
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Lottery{

    private int[] randomNumbers;
    private final int LENGTH = 6;

    //Constructor
    public Lottery(){
        this.randomNumbers = new int[this.LENGTH];
    }

    public void greetings(){
        System.out.println("***LOTTERY GAME***");
        System.out.println("Description: 6 random secret lottery numbers between 1 and 40 are generated!");
        System.out.println("Rule 1: You can play up to 3 lines per game!");
        System.out.println("Rule 2: You can guess 6 Numbers per line!");
        System.out.println("Rule 3: If you guess 3 or more numbers, you'll win a prize!\n");
    }

    public int[] generateRandomNumbers(){
        HashSet<Integer> randomNumbersTemp = new HashSet<Integer>();
        for(int i = 0; i < this.LENGTH; i++){
            int randomNumber = (int) (Math.random()*40)+1;
            while(randomNumbersTemp.contains(randomNumber)){
                randomNumber = (int) (Math.random()*40)+1;
            }
            randomNumbersTemp.add(randomNumber);
            this.randomNumbers[i] = randomNumber;
        }
        return this.randomNumbers;
    }

    public boolean checkForDuplicates(int[][] selection){        
        
        if(selection.length == 1){
            for(int i = 0; i < selection[0].length;i++){ 
                for(int j = i+1; j < selection[0].length;j++){
                    if(selection[0][i] == selection[0][j] && i != j){
                        return true;
                    }
                }
            }            
        } else{   
            HashSet<Integer> userNumbersTemp = new HashSet<Integer>();
            for(int i = 0; i < selection.length;i++){ 
                for (int j=0; j < selection[0].length; j++) {
                    if(userNumbersTemp.contains(selection[i][j])){
                        return true;
                    } else{
                        userNumbersTemp.add(selection[i][j]);
                    }
                }
            }
        }
        return false;
    }
}