/*
Encoder.java
Billy Cussen
10/08/2020
*/

public class Encoder{

    //Data Members
    private String input;
    private String output;
    private final String VOWEL = "aeiou";
    private final String CONSONANT = "bcdfghjklmnpqrstvwxyz";
    private StringBuffer sbOutput;

    //Constructor
    public Encoder(){
        this.input = new String();
        this.output = new String();
        this.sbOutput = new StringBuffer();
    }

    //Compute, Setter and Getter
    public String getEncodedSentance(String input){
        this.input = input;
        char ch;

        for(int i = 0; i < this.input.length(); i++){

            ch = Character.toLowerCase(this.input.charAt(i));

            for(int j = 0; j < this.VOWEL.length(); j++){

                if(ch == this.VOWEL.charAt(j)){
                    this.sbOutput.append(ch+"++");
                }

            }

            for(int k = 0; k < this.CONSONANT.length(); k++){

                if(ch == this.CONSONANT.charAt(k)){
                    this.sbOutput.append(ch+" ");
                }

            }

            if(ch == ' '){
                this.sbOutput.append("*");
            }

            if(ch == '.'){
                this.sbOutput.append(ch);
            }

        }
        this.output = this.sbOutput.toString();

        return this.output;
    }
}