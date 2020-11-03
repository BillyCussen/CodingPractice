/*
Decoder.java
Billy Cussen
04/08/2020
*/

public class Decoder{

    //Data Member
    private String inputWord;
    private String outputWord;
    private StringBuffer sbOutputWord;

    //Constructor
    public Decoder(){
        this.inputWord = new String();
        this.outputWord = new String();
        this.sbOutputWord = new StringBuffer();
    }

    public String getDecodedWord(String inputWord){
        this.inputWord = inputWord;

        for(int i = inputWord.length() - 1; i >= 0; i--){

            if(this.inputWord.charAt(i)=='1'&&this.inputWord.charAt(i-1)=='2'){
                this.sbOutputWord.append("a");
                i--;
            } else if(this.inputWord.charAt(i)=='2'&&this.inputWord.charAt(i-1)=='1'){
                this.sbOutputWord.append("e");
                i--;
            } else if(this.inputWord.charAt(i)=='3'&&this.inputWord.charAt(i-1)=='3'){
                this.sbOutputWord.append("i");
                i--;
            } else if(this.inputWord.charAt(i)=='4'&&this.inputWord.charAt(i-1)=='8'){
                this.sbOutputWord.append("o");
                i--;
            } else if(this.inputWord.charAt(i)=='0'&&this.inputWord.charAt(i-1)=='9'){
                this.sbOutputWord.append("u");
                i--;
            } else{
                this.sbOutputWord.append(this.inputWord.charAt(i));
            }

        }
        this.outputWord = sbOutputWord.toString();
        this.sbOutputWord = null;    
        
        return this.outputWord;
    }

}