/*
PasswordGenerator.java
Billy Cussen
11/08/2020
*/

public class PasswordGenerator{

    //Data Members
    private String input;
    private String output;
    private final String VOWELS = "aieou";
    private StringBuffer sbOutput;

    //Constructor
    public PasswordGenerator(){
        this.input = new String();
        this.output = new String();
        this.sbOutput = new StringBuffer();
    }

    //Compute, Setter & Getter
    public String getPassword(String input){
        this.input = input.toLowerCase();
        this.sbOutput.append(this.input);
        this.sbOutput.reverse();

        for(int k = 0; k < this.sbOutput.length(); k++){

            for(int j = 0; j < this.VOWELS.length(); j++){

                if(this.sbOutput.charAt(k) == this.VOWELS.charAt(j)){
                    this.sbOutput.replace(k,k+1,this.input.length()+"");
                    break;
                } 
                
            }

            if(this.sbOutput.charAt(k) == ' '){
                this.sbOutput.replace(k, k+1,"+");
            } 

        }
        this.output = this.sbOutput.toString();
        this.sbOutput = null;

        return this.output;
    }

}