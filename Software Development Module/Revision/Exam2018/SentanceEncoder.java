/*
SentanceEncoder.java
Billy Cussen
02/09/2020
*/

public class SentanceEncoder{

    //Data Members
    private StringBuffer outputSentance;

    //Constructor
    public SentanceEncoder(){
        this.outputSentance = new StringBuffer();
    }

    //Compute & Getter
    public void getEncodedSentance(String inputSentance){
        for(int i = inputSentance.length()-1; i >= 0; i--){
            if(((i+1) % 4 == 0)  && !(inputSentance.charAt(i)==' '|| inputSentance.charAt(i)=='.')){
                this.outputSentance.append("!");
            } else if(inputSentance.charAt(i)==' '){
                this.outputSentance.append("+");
            } else{
                this.outputSentance.append(inputSentance.charAt(i));
            }
        }

        System.out.println("Encoded Sentance is: "+this.outputSentance.toString());
        getCharacterCount(this.outputSentance.toString());
    }

    private void getCharacterCount(String inputSentance){
        int exclamationCount = 0, plusCount = 0;
        for(int i = 0; i < inputSentance.length(); i++){
            if(inputSentance.charAt(i)=='!'){
                exclamationCount++;
            } else if(inputSentance.charAt(i)=='+'){
                plusCount++;
            }
        }
        System.out.println("The total number of Exclamation Marks are: "+exclamationCount);
        System.out.println("The total number of Plus Characters are: "+plusCount);
    }

}