package syntax.scanner_lesson;

import java.util.Scanner;
public class about_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter name: ");
        String name = sc.nextLine();

        System.out.print("enter age: ");
        int age = sc.nextInt();

        System.out.println("name: " + name + ", age: " + age);
    }

}
