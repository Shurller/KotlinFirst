package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class oopDemo {
    public static void main(String[] args) throws ParseException {

        Person sasha = Person.getInstance();
        sasha.setName("Sasha");
        sasha.setAge(90);
        sasha.sayHello();
        System.out.println("The kind of Person is " + Person.getKIND());

        Person ivan = Person.getInstance("Ivan");
        ivan.sayHello();

        Person john = Person.getInstance("John",22);
        john.sayHello();

        PersonKt masha = PersonKt.Companion.getInstance();
        masha.setName("masha");
        masha.setAge(19);
        masha.sayHello();

        var selena = PersonKt.Companion.getInstance("Selena");
        //selena.setBirth(new SimpleDateFormat("yyyy.MM.dd").parse("1992.07.22"));
        selena.sayHello();
        System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(selena.getBirth()));
        System.out.println(PersonKt.KIND);













    }
}
