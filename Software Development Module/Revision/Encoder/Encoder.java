/*
Encoder.java
Billy Cussen
03/08/2020
*/

public class Encoder{

    //Data Members
    private String inputWord;
    private String encodedWord;
    private StringBuffer sbEncodedWord;

    //Constructor
    public Encoder(){
    }

    //Compute & Getter
    public String getEncodedWord(String inputWord){
        this.inputWord = inputWord;
        this.sbEncodedWord = new StringBuffer();

        for(int i = inputWord.length() - 1; i >= 0; i--){

            if(this.inputWord.charAt(i)=='a'||this.inputWord.charAt(i)=='A'){
                this.sbEncodedWord.append("12");
            } else if(this.inputWord.charAt(i)=='e'||this.inputWord.charAt(i)=='E'){
                this.sbEncodedWord.append("21");
            } else if(this.inputWord.charAt(i)=='i'||this.inputWord.charAt(i)=='I'){
                this.sbEncodedWord.append("33");
            } else if(this.inputWord.charAt(i)=='o'||this.inputWord.charAt(i)=='O'){
                this.sbEncodedWord.append("48");
            } else if(this.inputWord.charAt(i)=='u'||this.inputWord.charAt(i)=='U'){
                this.sbEncodedWord.append("09");
            } else{
                this.sbEncodedWord.append(this.inputWord.charAt(i));
            }

        }
        this.encodedWord = sbEncodedWord.toString();
        this.sbEncodedWord = null;

        return this.encodedWord;
    }
}