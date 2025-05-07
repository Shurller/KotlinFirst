package oop;

public class oopDemo {
    public static void main(String[] args) {

        Person sasha = new Person();
        sasha.name = "Sasha";
        sasha.age = 18;
        sasha.sayHello();

        Person ivan = new Person("Ivan", 22);
        ivan.sayHello();

        Person john = new Person("John");
        john.sayHello();

        PersonKt masha = new PersonKt();
        masha.setName("masha");
        masha.setAge(19);
        masha.sayHello();

        var selena = new PersonKt("Selena");
        selena.sayHello();













    }
}
