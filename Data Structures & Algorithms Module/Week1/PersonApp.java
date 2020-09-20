/*
PersonApp.java
Billy Cussen
07/09/2020
*/

import java.util.List;
import java.util.ArrayList;

public class PersonApp{

    public static void main(String [] args){

        Person one = new Person("Billy","Cussen",31);
        Person two = new Student("William","Cussen",31);
        List<Person> list1 = new ArrayList<Person>();
        list1.add(one);
        list1.add(two);

        for(Person p: list1){
            if(p instanceof Student){
                Student a = (Student) p;
                System.out.println(a.toString());
                System.out.println(a.isStudent());
            }
        }
        



    }

}