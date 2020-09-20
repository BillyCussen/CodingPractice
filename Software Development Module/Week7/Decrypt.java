/*
Decrypt.java
Billy Cussen
16/07/2020
*/

public class Decrypt {
    
    //Data Members
    private String input;
    private String output;

    //Constructor
    public Decrypt(){
        this.input = new String();
        this.output = new String();
    }

    //Setter, Compute & Getter
    public String computeAndGetDecryption(String input){
        
        this.input = input;
        System.out.println("DEBUG -> User input is: "+this.input+", length: "+this.input.length());

        for(int i = this.input.length()-1; i >= 0; i--){
            this.output += this.input.charAt(i);
        }

        System.out.println("DEBUG -> Decrypt Stage 1: "+this.output+", length: "+this.output.length());

        for(int j = 0; j < this.input.length(); j++){

            if(this.output.charAt(j) == '?'){
                this.output = this.output.replace(this.output.charAt(j),'a');
            } else if(this.output.charAt(j) == '/'){
                this.output = this.output.replace(this.output.charAt(j),'e');
            } else if(this.output.charAt(j) == '$'){
                this.output = this.output.replace(this.output.charAt(j),'i');
            } else if(this.output.charAt(j) == '&'){
                this.output = this.output.replace(this.output.charAt(j),'o');
            } else if(this.output.charAt(j) == '+'){
                this.output = this.output.replace(this.output.charAt(j),'u');
            } else if(this.output.charAt(j) == '%'){
                this.output = this.output.replace(this.output.charAt(j),' ');
            } else if(this.output.charAt(j) == '#'){
                this.output = this.output.replace(this.output.charAt(j),' ');
            }
        }

        this.output = "Decrypted String is: "+this.output.replaceAll("\\s", ""); 

        return this.output;
    }

}