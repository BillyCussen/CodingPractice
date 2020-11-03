/*
UsernameGenerator.java
Billy Cussen
25/08/2020
*/

public class UsernameGenerator{

    //Data Members
    private String[] fullnames;
    private String[] userNames;
    private final String VOWELS = "aeiou";
    private final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
    private String result;
     

    //Constructor
    public UsernameGenerator(String[] fullnames){
        
        this.fullnames = new String[fullnames.length];
        for(int i = 0; i < fullnames.length; i++){
            this.fullnames[i] = fullnames[i].toLowerCase();
        }
        this.userNames = new String[this.fullnames.length];
        this.result = new String();
    }

    //Compute & Getter
    public String[] getUserName(){
        char[] userName;
        for(int j = 0; j < this.fullnames.length; j++){
            userName = this.fullnames[j].toCharArray();
            for(int c = 0; c < userName.length; c++){              
                if(userName[c] == ' '){
                    userName[c] = Character.forDigit(c, 10);
                }               
                for(int i = 0; i < this.VOWELS.length();i++){
                    if(userName[c] == this.VOWELS.charAt(i)){
                        userName[c] = ' ';
                        break;
                    }
                }
            }
            this.result = new String(userName) + this.fullnames[j].length();
            this.result = this.result.replaceAll("\\s+","");
            this.userNames[j] = this.result;
        }
        return this.userNames;
    }

    public String[] getUserName1(){
        StringBuffer userName1;
        for(int j = 0; j < this.fullnames.length; j++){
            userName1 = new StringBuffer();
            for(int c = 0; c < this.fullnames[j].length(); c++){
                if(this.fullnames[j].charAt(c) == ' '){
                    userName1.append(c);
                }       
                for(int i = 0; i < this.CONSONANTS.length();i++){
                    if(this.fullnames[j].charAt(c) == this.CONSONANTS.charAt(i)){
                        userName1.append(this.fullnames[j].charAt(c));
                        break;
                    } 
                }
            }
            this.userNames[j] =  userName1.toString().replaceAll("\\s","") + this.fullnames[j].length();       
        }
        return this.userNames;
    }

    public String[] getUserName2(){
        for(int j = 0; j < this.fullnames.length; j++){
            this.result = new String();
            for(int c = 0; c < this.fullnames[j].length(); c++){        
                if(this.fullnames[j].charAt(c) == ' '){
                    this.result+=c;
                }         
                for(int i = 0; i < this.CONSONANTS.length();i++){
                    if(this.fullnames[j].charAt(c) == this.CONSONANTS.charAt(i)){
                        this.result+=this.fullnames[j].charAt(c);
                    } 
                }
            }
            this.userNames[j] = this.result.replaceAll("\\s","") + this.fullnames[j].length();
        }
        return this.userNames;
    }
}