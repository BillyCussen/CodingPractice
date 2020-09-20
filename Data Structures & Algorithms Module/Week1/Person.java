/*
Person.java
Billy Cussen
07/09/2020
*/
public class Person{

    //Data Members
    String firstName;
    private String secondName;
    private int age;

    //Constructor
    public Person(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public String toString(){
        return "First Name: "+this.firstName+", Second Name: "+this.secondName+", Age: "+this.age;
    }

}