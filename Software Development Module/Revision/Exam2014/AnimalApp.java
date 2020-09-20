/*
AnimalApp.java
Billy Cussen 
07/08/2020
*/

import java.util.Scanner;

public class AnimalApp{

    public static void main(String [] args){

        //Variable 
        String animal = new String();
        String speak;
        boolean inputCheck;

        //Object
        Scanner keyboard;
        Animal myAnimal;

        //Input
        do{
            inputCheck = true;
            keyboard = new Scanner(System.in);

            System.out.print("Enter your Animal (Cat, Dog or Other): ");
            animal = keyboard.nextLine();

            if(!(animal.equalsIgnoreCase("Cat")||animal.equalsIgnoreCase("Dog")||animal.equalsIgnoreCase("Other"))){
                System.out.println("You need to enter Cat, Dog or Other!");
                inputCheck = false;
            }

            keyboard = null;

        }while(!inputCheck);

        if(animal.equalsIgnoreCase("Cat")){
            myAnimal = new Cat();
        } else if(animal.equalsIgnoreCase("Dog")){
            myAnimal = new Dog();
        } else{
            myAnimal = new Animal();
        }

        speak = myAnimal.speak();
        myAnimal = null;
        System.out.println(speak);

    }

}