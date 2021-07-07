package com.company;

public class Person {
    private double heightInM;
    private String gender;
    private String complexion;
    private int age;

    public void setHeightInM(double heightInM) {
        this.heightInM = heightInM;
    }
    public double getHeightInM() {
        return this.heightInM;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return this.gender;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }
    public String getComplexion() {
        return this.complexion;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public void walk(boolean walk) {
        if (walk) {
            System.out.println("The person is walking");
        }else {
            System.out.println("The person is not walking");
        }
    }

    public void talk(boolean talk) {
        if (talk) {
            System.out.println("The person is talking");
        }else {
            System.out.println("The person is not talking");
        }
    }

    public void eat(boolean eat) {
        if (eat) {
            System.out.println("The person is eating");
        }else {
            System.out.println("The person is not eating");
        }
    }

    public void run(boolean run) {
        if (run) {
            System.out.println("The person is running");
        }else {
            System.out.println("The person is not running");
        }
    }
}
