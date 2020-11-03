/*
Encrypt.java
15/07/2020
Billy Cussen
*/

public class Encrypt {
    
    //Data Members
    private String input;
    private String output;
    private final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
    private final String VOWELS = "aeiou";

    //Constructor
    public Encrypt(){
        this.input = new String();
        this.output = new String();
    }

    //Setter
    public void setInput(String input){
        this.input = input;
        //System.out.println("DEBUG => Input: "+this.input+", Input Length: "+this.input.length());
    }

    //Compute
    public void encryptInput(){

        for(int i = this.input.length()-1; i >= 0; i--){
            //System.out.println("DEBUG => Checking Character: "+this.input.charAt(i));
            this.output += this.input.toLowerCase().charAt(i)+"*";
        }

        //System.out.println("DEBUG => Output is now: "+this.output);

        for(int j = 0; j < this.output.length(); j++){

            for(int k = 0; k < this.VOWELS.length(); k++){
                if(this.output.charAt(j) == this.VOWELS.charAt(k)){
                    //System.out.println("DEBUG => Checking Character: "+this.output.charAt(j)+", Against: "+this.VOWELS.charAt(k));
                    this.output = this.output.replace(this.output.charAt(j), '?');
                    //System.out.println("DEBUG => Output is now: "+this.output);
                    break;
                }
            }

            for(int l = 0; l < this.CONSONANTS.length(); l++){
                if(this.output.charAt(j) == this.CONSONANTS.charAt(l)){
                    this.output = this.output.replace(this.output.charAt(j), '!');
                    break;
                }
            }

            if(this.output.charAt(j) == ' '){
                this.output = this.output.replace(this.output.charAt(j), '%');
                this.output += "#";
            }

        }

    }

    //Getter
    public String getOutput(){
        return this.output;
    }
}