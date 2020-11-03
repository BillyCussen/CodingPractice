/*
BalancedStrings.java
Billy Cussen
30/08/2020
*/

//Balanced strings are those who have equal quantity of 'L' and 'R' characters.
//Given a balanced string s split it in the maximum amount of balanced strings.
//Return the maximum amount of splitted balanced strings.
import java.util.Scanner;
import java.util.InputMismatchException;

public class BalancedStrings{

    public static void main(String [] args){

        //Variables
        boolean inputCheck;
        String inputString = new String();

        //Object
        BalancedStringsHelp myBalancedString = new BalancedStringsHelp();
        Scanner keyboard;

        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            try{
                System.out.print("Enter the String to be checked: ");
                inputString = keyboard.nextLine();

                if(inputString.length() < 2){
                    throw new InputMismatchException("You need to enter a String of length 2 or Greater!");
                }

            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
                inputCheck = false;
            } finally{
                keyboard = null;
            }

        }while(!inputCheck);

        System.out.println(myBalancedString.balancedStringSplit(inputString));
        System.out.println(myBalancedString.balancedStringSplit("RLRRLLRLRL"));
        System.out.println(myBalancedString.balancedStringSplit("RLLLLRRRLR"));
        System.out.println(myBalancedString.balancedStringSplit("LLLLRRRR"));
        System.out.println(myBalancedString.balancedStringSplit("RLRRRLLRLL"));

        System.out.println(myBalancedString.balancedStringSplit2("RLRRLLRLRL"));
        System.out.println(myBalancedString.balancedStringSplit2("RLLLLRRRLR"));
        System.out.println(myBalancedString.balancedStringSplit2("LLLLRRRR"));
        System.out.println(myBalancedString.balancedStringSplit2("RLRRRLLRLL"));

        myBalancedString = null;
    }
}

class BalancedStringsHelp{

    //Constructor
    public BalancedStringsHelp(){
    }

    //Solution 1 - Accepting User Input
    //40 / 40 test cases passed.
    //Runtime: 1 ms
    //Memory Usage: 37 MB
    public int balancedStringSplit(String s) {
        int count = 0, balancedCount = 0;
        char tempChar1 = s.charAt(0), tempChar2 = '\0';
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) != tempChar1){
                tempChar2 = s.charAt(j);
                break;
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == tempChar1){
                count++;
            } else if (s.charAt(i) == tempChar2) {
                count--;
            }
            if(count == 0){
                balancedCount++;
            }
        }
        return balancedCount;
    }

    //Solution 2 - HardCoded (i.e. using only R & L)
    // 40 / 40 test cases passed.
    //Runtime: 0 ms
    //Memory Usage: 37.4 MB
    public int balancedStringSplit2(String s) {
        int balancedCount = 0, count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                count++;
            } else if(s.charAt(i) == 'L'){
                count--;
            }
            if(count == 0){
                balancedCount++;
            }
        }
        return balancedCount;
    }
}