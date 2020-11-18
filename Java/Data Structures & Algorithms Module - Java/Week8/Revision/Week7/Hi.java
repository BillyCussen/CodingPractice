/*
Hi.java
Billy Cussen
18/11/2020
*/
public class Hi{

    public static void main(String[]args){

        long startTime = System.nanoTime();
        System.out.println("Count Hi: "+countHi("Hihihihellohellohihi"));
        long endTime = System.nanoTime();
        System.out.println("Looped Approach took "+(endTime-startTime)+" nanoseconds");
        
        startTime = System.nanoTime();
        System.out.println("Count Hi Recursion: "+countHiRecursion("Hihihihellohellohihi"));
        endTime = System.nanoTime();
        System.out.println("Recursive Approach took "+(endTime-startTime)+" nanoseconds");
    }

    public static int countHi(String word){
        word = word.toLowerCase();
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)=='h' && word.charAt(i+1)=='i'){
                count++;
                i++;
            }
        }
        return count;
    }

    public static int countHiRecursion(String word){
        if(word.length()<=1){
            return 0;
        }
        word = word.toLowerCase();
        if(word.charAt(0)=='h'&&word.charAt(1)=='i'){
            return 1 + countHiRecursion(word.substring(2,word.length()));
        } else{
            return 0 + countHiRecursion(word.substring(1,word.length()));
        }
    }

}