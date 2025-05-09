package oop;

public class Person {

    private String name;
    private int age;
    private static final String KIND = "HUMAN";

    public static String getKIND() {
        return KIND;
    }

    {
        System.out.println("----------");
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        name = "";
        age = 0;
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int _age) {
        this(name);
        age = _age;         // legacy вариант this.
    }

    public void sayHello() {
        System.out.println("Hello World, my name is " + name);
    }






    public static Person getInstance() {
        return new Person();
    }
    public static Person getInstance(String name) {
        return new Person(name);
    }

    public static Person getInstance(String name, int age) {
        return new Person(name, age);
    }

    public static Person getInstance(Person other) {
        return new Person(other.getName(), other.getAge());
    }









}
