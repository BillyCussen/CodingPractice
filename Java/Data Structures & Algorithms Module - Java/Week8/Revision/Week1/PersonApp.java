/*
PersonApp.java
Billy Cussen
09/11/2020
*/
import java.util.List;
import java.util.ArrayList;
public class PersonApp{

    public static void main(String [] args){

        Person one = new Person("Billy","Cussen",31);
        Person two = new Student("William","Cussen",32);

        List<Person> myList = new ArrayList<Person>();
        myList.add(one);
        myList.add(two);

        for (Person e: myList){
            if (e instanceof Student){
                Student s = (Student) e;
                System.out.println(s.toString());
                System.out.println(s.isStudent());
            }
        }
    }
}