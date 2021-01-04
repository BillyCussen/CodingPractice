/*
ArrayListApp.java
Billy Cussen
04/01/2020
*/

import java.util.List;
import java.util.ArrayList;

public class ArrayListApp{

    public static void main(String [] args){

        Person one = new Person("Billy","IT");
        Person two = new Student("William","Software");
        List<Person> myList = new ArrayList<Person>();
        myList.add(one);
        myList.add(two);

        for(Person e: myList){
            if(e instanceof Student){
                Student a = (Student) e;
                System.out.println(a.toString());
                System.out.println(a.isStudent());
            }
        }

    }

}

class Person{

    private String name;
    private String profession;

    Person(String name, String profession){
        this.name = name;
        this.profession = profession;
    }

    @Override
    public String toString(){
        return "Name: "+this.name+", Profession: "+this.profession;
    }

}

class Student extends Person{

    Student(String name, String profession){
        super(name, profession);
    }   

    public boolean isStudent(){
        return true;
    }

}