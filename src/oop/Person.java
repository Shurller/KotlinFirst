package oop;

public class Person {

    public String name;
    public int age;

    public Person() {
        name = "";
        age = 0;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int _age) {
        this.name = name;
        age = _age;         // legacy вариант this.
    }








    public void sayHello() {
        System.out.println("Hello World, my name is " + name);
    }



}
