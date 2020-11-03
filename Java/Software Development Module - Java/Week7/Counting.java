/*
Counting.java
Billy Cussen
15/07/2020
*/

public class Counting {
    
    //Data Members
    String input;
    String output;
    private final String VOWEL = "aeiou";
    private final String CONSONANT = "bcdfghjklmnpqrstvwxyz";
    private final String NUMBER = "0123456789";
    int vowelCount;
    int spaceCount;
    int consonantCount;
    int numCount;

    //Constructor
    public Counting(String input){
        this.input = input;
        //System.out.println("DEBUG => CHecking input: "+this.input);
        this.output = new String();
        this.vowelCount = 0;
        this.spaceCount = 0;
        this.consonantCount = 0;
        this.numCount = 0;
    }

    //Compute and Getter
    public String computeAndGetOutput(){

        for(int i = 0; i < this.input.length(); i++){

            //System.out.println("DEBUG => CHecking character: "+this.input.toLowerCase().charAt(i));

            for(int j = 0; j < this.VOWEL.length(); j++){
                if(this.input.toLowerCase().charAt(i) == this.VOWEL.charAt(j)){
                    this.vowelCount++;
                    break;
                }
            }

            for(int k = 0; k < this.CONSONANT.length(); k++){
                if(this.input.toLowerCase().charAt(i) == this.CONSONANT.charAt(k)){
                    this.consonantCount++;
                    break;
                }
            }

            for(int l = 0; l < this.NUMBER.length(); l++){
                if(this.input.charAt(i) == this.NUMBER.charAt(l)){
                    this.numCount++;
                    break;
                }
            }

            if(this.input.charAt(i) == ' '){
                this.spaceCount++;
            }
    
        }

        this.output = "Input: "+this.input+"\nVowel Count: "+this.vowelCount+"\nConsonant Count: "+this.consonantCount+"\nNumber Count: "+this.numCount+"\nSpace Count: "+this.spaceCount;
        return this.output;
    }

}