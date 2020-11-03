/*
InvalidPasswordException.java
Billy Cussen
13/08/2020
*/

public class InvalidPasswordException extends RuntimeException{

    //Data Members
    private String message = "Your password must be at least 10 Characters in length";

    //Constructors
    public InvalidPasswordException(){
    }

    public InvalidPasswordException(String message){
        super(message);
        this.message = message;
    }

    //Getter
    @Override
    public String getMessage(){
        return this.message;
    }

}