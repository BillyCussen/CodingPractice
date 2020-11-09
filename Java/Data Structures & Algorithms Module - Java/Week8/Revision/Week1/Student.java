/*
Student.java
Billy Cussen
09/11/2020
*/
public class Student extends Person{

    public Student(String firstname, String secondname, int age){
        super(firstname,secondname,age);
    }

    public String isStudent(){
        return "This is a Student";
    }

}