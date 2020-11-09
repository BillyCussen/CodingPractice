/*
Person.java
Billy Cussen
09/11/2020
*/
public class Person{

    private String firstname;
    private String secondname;
    private int age;

    public Person(String firstname, String secondname, int age){
        this.firstname = firstname;
        this.secondname = secondname;
        this.age = age;
    }

    @Override
    public String toString(){
        return "First Name: "+this.firstname+", Second name: "+this.secondname+", Age: "+this.age;
    }

}