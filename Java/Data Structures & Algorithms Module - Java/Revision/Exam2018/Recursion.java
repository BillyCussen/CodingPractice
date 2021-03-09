/*
Recursion.java
Billy Cussen
09/03/2021
*/
public class Recursion{

    public static int count(String str, char a){
        if(str.length()==0){
            return 0;
        } 

        if(str.charAt(0)==a){
            return 1 + count(str.substring(1, str.length()), a);
        } else{
            return count(str.substring(1, str.length()),a);
        }
    }

    public static void main(String [] args){

        System.out.println(count("Dublin",'u'));
        System.out.println(count("Wexford",'o'));
        System.out.println(count("Roscommon",'o'));
        System.out.println(count("Limerick",'i'));
        System.out.println(count("",'u'));
        System.out.println(count("Tipperary",'e'));
    }


}