/*
HelloApp.java
Billy Cussen
10/11/2020
*/

public class HelloApp{
    public static void main(String[]args){

        HelloInterface myHello1 = new EnglishHello();
        HelloInterface myHello2 = new FrenchHello();

        System.out.println(myHello1.sayHello());
        System.out.println(myHello2.sayHello());
    }
}