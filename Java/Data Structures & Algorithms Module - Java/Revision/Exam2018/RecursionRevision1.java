/*
RecursionRevision1.java
Billy Cussen
15/03/2021
*/
public class RecursionRevision1<T> {
    
    public static int count(String s, char a){
        int len = s.length();
        if(len<=0){
            return 0;
        }
        
        if(s.charAt(0)==a){
            return 1 + count(s.substring(1, len), a);
        } else{
            return count(s.substring(1, len), a);
        }
    } 

    public static void main(String [] args){

        System.out.println("Count h in \"Hello\": "+count("hello",'h'));
        System.out.println("Count l in \"Hello\": "+count("hello",'l'));
        System.out.println("Count o in \"Hello\": "+count("hello",'o'));
        System.out.println("Count o in \"Goodbye\": "+count("Goodbye",'o'));
        System.out.println("Count r in \"Fractured\": "+count("Fractured",'r'));
        System.out.println("Count g in \"Fractured\": "+count("Fractured",'g'));      
    }

}
