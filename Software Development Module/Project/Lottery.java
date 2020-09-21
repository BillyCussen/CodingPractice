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

}