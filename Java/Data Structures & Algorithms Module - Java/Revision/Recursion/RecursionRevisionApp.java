/*
RecursionRevisionApp.java
Billy Cussen
13/01/2021
*/
public class RecursionRevisionApp {
    
    public static void main(String[]args){

        RecursionRevision myRevision = new RecursionRevision();

        System.out.println("Change X with Y: "+myRevision.changeXY("Billx"));
        System.out.println("Change X with Y: "+myRevision.changeXY("XXXXxxxx"));
        System.out.println("Clean String \"XXXXxxxx\": "+myRevision.cleanString("XXXXxxxx"));
        System.out.println("Clean String \"AABBCCaaabbbbcccdef\": "+myRevision.cleanString("AABBCCaaabbbbcccdef"));
        System.out.println("5 factorial 3: "+myRevision.factorial(5, 3));

        for(int i = 1; i <= 10; i++){
            System.out.println("Fibonacci: "+myRevision.fibonacci(i));
        }

        System.out.println("Count \"hi\" in \"hihihi\": "+myRevision.hi("hihihi"));
        System.out.println("Count \"hi\" in \"Hello there\": "+myRevision.hi("Hello there"));
        System.out.println("Match Braces in \"{{}}\": "+myRevision.matchBraces("{{}}"));
        System.out.println("Match Braces in \"{}}\": "+myRevision.matchBraces("{}}"));
        System.out.println("Move X in \"Bxilxlxyx\": "+myRevision.moveX("Bxilxlxyx"));
        System.out.println("Move X in \"xunorthodo\": "+myRevision.moveX("xunorthodo"));
    }

}
