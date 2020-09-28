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
        //For Testing
        //Integer[] temp = new Integer[]{1,2,3,4,5,6};
        //return temp;
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
        this.historyInfo += "On Game "+gameNumber+", you played "+selection.length+" line(s).";
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
                    if(i==0){
                        lineOne++;
                    } else if(i==1){
                        lineTwo++;
                    }else{
                        lineThree++;
                    }
                }
            }
        }
        int winnings = 0;
        if(lineOne<3&&lineTwo<3&&lineThree<3){
            this.gameResult+="Sorry, you win nothing on this round!\n";
        } else{
            
            if(lineOne>=3){
                winnings += getWinnings(lineOne);
                this.gameResult+="On line 1, you guessed "+lineOne+" numbers correctly. You have won "+winnings+"\n";
            }
            if(lineTwo>=3){
                winnings += getWinnings(lineTwo);
                this.gameResult+="On line 2, you guessed "+lineTwo+" numbers correctly. You have won "+winnings+"\n";
            } 
            if(lineThree>=3){
                winnings += getWinnings(lineThree);
                this.gameResult+="On line 3, you guessed "+lineThree+" numbers correctly. You have won "+winnings+"\n";
            }
            this.totalWinnings+=winnings;
        }

        this.historyInfo += "\nYou guessed "+(lineOne+lineTwo+lineThree)+" numbers correctly. You won: "+winnings+"\n";
        return this.gameResult+"\n";
    }

    private int getWinnings(int lineNumber){
        if(lineNumber == 3){
            return 100;
        } else if(lineNumber == 4){
            return 250;
        } else if(lineNumber == 5){
            return 1000;
        } else if(lineNumber == 6){
            System.out.println("Congratulations, you won the Lottery!");
            return 10000;
        }
        return 0;
    }

    public String getHistory(){
        this.historyInfo+="Your total Winnings for All Games: "+this.totalWinnings;
        return this.historyInfo;
    }
}
