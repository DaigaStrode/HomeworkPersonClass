package com.company;

public class Main {

    public static void main(String[] args) {
        Person thePerson = new Person();

        thePerson.setHeightInM(1.75);
        thePerson.setGender("male");
        thePerson.setComplexion("medium");
        thePerson.setAge(50);

        System.out.println("Height of the person is: " + thePerson.getHeightInM());
        System.out.println("Gender of the person is: " + thePerson.getGender());
        System.out.println("Complexion of the person is: " + thePerson.getComplexion());
        System.out.println("Age of the person is: " + thePerson.getAge());

        thePerson.walk(true);
        thePerson.talk(true);;
        thePerson.eat(false);;
        thePerson.run(false);
    }
}
