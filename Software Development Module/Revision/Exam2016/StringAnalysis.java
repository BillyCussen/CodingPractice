/*
StringAnalysis.java
Billy Cussen
15/08/2020
*/

public class StringAnalysis{

    //Data Members
    private final String VOWELS = "aeiou";
    private String userInput;
    private StringBuffer output;
    private int wordCount;

    //Constructor
    public StringAnalysis(String userInput){
        this.userInput = userInput.toLowerCase();
        this.output = new StringBuffer();
        this.wordCount = 0;
    }

    //Compute
    public void computeOutput(){

        //Get Output String
        for(int i = 0; i < this.userInput.length(); i++){

            if(isVowel(this.userInput.charAt(i))){
                this.output.append('*');
            } else{
                this.output.append(this.userInput.charAt(i));
            }
        }

        String[] wordCount = this.userInput.split(" ");
        this.wordCount = wordCount.length;

    }

    private boolean isVowel(char a){

        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            return true;
        } else{
            return false;
        }

    }


    //Getters
    public String getOutput(){
        return this.output.toString();
    }

    public int getWordCount(){
        return this.wordCount;
    }

}