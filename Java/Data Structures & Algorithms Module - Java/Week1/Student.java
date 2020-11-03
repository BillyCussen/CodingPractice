/*
Student.java
Billy Cussen
07/09/2020
*/

public class Student extends Person{

    //Constructor
    public Student(String firstName, String secondName, int age){
        super(firstName,secondName,age);
    }

    public String isStudent(){
        return "This is a Student";
    }

}