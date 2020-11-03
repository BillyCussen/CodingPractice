/*
LoginName.java
Billy Cussen
06/08/2020
*/

//A startup company has an application that creates login names for their employees. The application prompts the user to enter a name (in lowercase letters) in the format "forename surname".
//a. the login name starts with the surname
//b. the forename without the consonants is added after the surname (i.e. the modified version of the forename keeps only the vowels).

public class LoginName{

    //Data Members
    private String fullName;
    private String userName;
    private final String VOWELS;
    private String[] userNameTemp;
    private StringBuffer strbUusernameTemp;

    //Constructor
    public LoginName(){
        this.fullName = new String();
        this.userName = new String();
        this.VOWELS = "aeiou";
        this.userNameTemp = new String[2];
        this.strbUusernameTemp = new StringBuffer();
    }

    //Compute, Setter & Getter
    public String computeLoginName(String fullName){
        this.fullName = fullName.toLowerCase();
        this.userNameTemp = this.fullName.split(" ");
        this.strbUusernameTemp.append(this.userNameTemp[1]);

        boolean vowelCheck = false;

        for(int i = 0; i < this.userNameTemp[0].length(); i++){

            for(int j = 0 ; j < this.VOWELS.length(); j++){

                vowelCheck = false;
                System.out.println(this.userNameTemp[0].charAt(i)+" -> "+this.VOWELS.charAt(j));
                if(this.userNameTemp[0].charAt(i) == this.VOWELS.charAt(j)){
                    vowelCheck = true;
                    break;
                }

            }

            if(vowelCheck == false){
                System.out.println("TEST: "+this.userNameTemp[0].charAt(i));
                this.strbUusernameTemp.append(this.userNameTemp[0].charAt(i));
            }

        }

        this.userName = this.strbUusernameTemp.toString();
        this.strbUusernameTemp = null;
        this.userNameTemp = null;

        return this.userName;
    }

}