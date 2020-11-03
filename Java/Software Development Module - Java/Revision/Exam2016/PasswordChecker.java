/*
PasswordChecker.java
Billy Cussen
13/08/2020
*/

public class PasswordChecker{

    //Data Members
    private String[] passwordsArray;
    private String specialCharacters;
    private String output;

    //Constructor
    public PasswordChecker(String[] passwordsArray, String specialCharacters){
        this.passwordsArray = passwordsArray;
        this.specialCharacters = specialCharacters;
        this.output = "***WEAK PASSWORDS*** \n";
    }

    //Compute & Getter
    public String getWeakPasswords(){

        int weakPasswordCount = 0;
        int characterCount;
        boolean upperCaseCheck;

        for(int i = 0; i < this.passwordsArray.length; i++){

            characterCount = 0;
            upperCaseCheck = false;

            for(int j = 0; j < this.passwordsArray[i].length(); j++){

                for(int k = 0; k < this.specialCharacters.length(); k++){

                    if(this.passwordsArray[i].charAt(j) == this.specialCharacters.charAt(k)){
                        characterCount++;
                        break;
                    }

                }

                if(Character.isUpperCase(this.passwordsArray[i].charAt(j))){
                    upperCaseCheck = true;
                }

            }

            if(characterCount < 2){
                this.output += "Weak Password "+(i+1)+": "+this.passwordsArray[i]+", it should have at least 2 characters!\n";
                weakPasswordCount++;
            }

            if(!upperCaseCheck){
                this.output += "Weak Password "+(i+1)+": "+this.passwordsArray[i]+", it should have at least 1 Uppercase Letter!\n";
                weakPasswordCount++;
            }

        }

        if(weakPasswordCount == 0){
            this.output += "Every Password Entered is Strong!";
        }

        return this.output;
    }

}