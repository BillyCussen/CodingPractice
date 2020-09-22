/*
Lottery.java
Billy Cussen
20/09/2020
*/

//In Progress

import java.util.HashSet;

public class Lottery{

    private int[] randomNumbers;
    private final int LENGTH = 6;

    //Constructor
    public Lottery(){
        this.randomNumbers = new int[this.LENGTH];
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
        
        //In Progress
        if(selection.length == 1){
            for(int i = 0; i < selection[0].length;i++){ 
                for(int j = i+1; j < selection[0].length;i++){
                    if(selection[0][i] == selection[0][j]){
                            return true;
                    }
                }
            }            
        } else{
            for(int i = 0; i < selection.length;i++){ 
                for(int j = 0; j < selection[0].length;i++){
                    for(int k = j+1; k < selection.length; k++){
                        if(selection[i][j] == selection[i][k]){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}