/*
Lottery.java
Billy Cussen
20/09/2020
*/

//In Progress
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Lottery{

    private Integer[] randomNumbers;
    private final int LENGTH = 6;
    private int linesWon;
    private int totalWinnings;
    private String historyInfo;
    private String gameResult;

    //Constructor
    public Lottery(){
        this.randomNumbers = new Integer[this.LENGTH];
        this.linesWon = 0;
        this.totalWinnings = 0;
        this.historyInfo = "***GAME HISTORY***\n";
        this.gameResult = new String();
    }

    public void greetings(){
        System.out.println("***LOTTERY GAME***");
        System.out.println("Description: 6 random secret lottery numbers between 1 and 40 are generated!");
        System.out.println("Rule 1: You can play up to 3 lines per game!");
        System.out.println("Rule 2: You can guess 6 Numbers per line!");
        System.out.println("Rule 3: If you guess 3 or more numbers, you'll win a prize!\n");
    }

    public Integer[] generateRandomNumbers(){
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

    public String getResult(int[][] selection, int gameNumber){
        this.historyInfo += "On Game "+gameNumber+", you played "+selection.length+" lines.";
        this.gameResult = "Game "+gameNumber+" Results\nRandom Numbers are: ";
        int lineOne = 0, lineTwo = 0, lineThree = 0;
        Integer[] randTemp = generateRandomNumbers();
        List randomNumbers = Arrays.asList(randTemp);
        System.out.println(randomNumbers.get(0));
        for(int e: randTemp){
            this.gameResult+=e +" ";
        }
        this.gameResult+="\n";

        //Determine How many Matches Per Line - Needs work
        for(int i = 0; i < selection.length; i++){
            for(int j = 0; j < selection[0].length; j++){
                if(randomNumbers.contains(selection[i][j])){
                    System.out.println("DEBUG: Match was found");
                    if(i==0){
                        lineOne++;
                        if(j == selection[0].length-1){
                            this.gameResult+="On line "+(i+1)+", you guessed "+lineOne+" numbers correctly";
                        }
                    } else if(i==1){
                        lineTwo++;
                        if(j == selection[0].length-1){
                            this.gameResult+="On line "+(i+1)+", you guessed "+lineOne+" numbers correctly";
                        }
                    }else{
                        lineThree++;
                        if(j == selection[0].length-1){
                            this.gameResult+="On line "+(i+1)+", you guessed "+lineOne+" numbers correctly";
                        }
                    }
                }
            }
        }
        if(lineOne==0&&lineTwo==0&&lineThree==0){
            this.gameResult+="Sorry, you win nothing on this round!\n";
        }

        this.historyInfo += "\nYou guessed "+(lineOne+lineTwo+lineThree)+" numbers correctly.\n";
        return this.gameResult+"\n";
    }

    public String getHistory(){
        return this.historyInfo;
    }
}
