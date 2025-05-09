package oop;

public class Student extends Person {

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student() {
        super();
    }

    public Student(String name) {
        super(name);
    }

    public Student(String name, int age) {
        super(name,age);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello World, my name is " + getName()+". I am a"+getKIND());
    }

    public static Student getInstance() {
        return new Student();
    }

    public static Student getInstance(String name) {
        return new Student(name);
    }

    public static Student getInstance(String name, int age) {
        return new Student(name, age);
    }
}
