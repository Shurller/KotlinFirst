package syntax.elseif;

import java.util.Scanner;

public class about_if {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("good");
        } else if (age >= 13) {
            System.out.println("normal");
        } else {
            System.out.println("bad");
        }

        sc.close();
    }
}
