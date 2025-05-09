package oop;

public class newOOpJava {
    public static void main(String[] args) {
        // копирование по значению
        int int1=4;
        int int2=5;
        int int3=int1;

        System.out.println(int3);


// копирование по ссылке
        Person sasha = Person.getInstance("Sasha");
        Person john = Person.getInstance("John");
        Person incog = sasha;

        System.out.println(incog.getName());
        sasha.setName("nesasha");
        System.out.println(incog.getName());
        incog.setName("insasha");
        System.out.println(sasha.getName());

        Person newPerson = Person.getInstance(sasha);
        System.out.println(newPerson.getName());
        newPerson.setName("name123");
        System.out.println(sasha.getName());



    }
}
