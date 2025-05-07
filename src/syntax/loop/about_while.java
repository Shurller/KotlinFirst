package syntax.loop;

import java.util.Scanner;

public class about_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
//        while(count < 3) {
//
//            System.out.print("Enter age: ");
//            int age = sc.nextInt();
//
//            if (age >= 18) {
//                System.out.println("good");
//            } else if (age >= 13) {
//                System.out.println("normal");
//            } else {
//                System.out.println("bad");
//            }
//            count++;
//        }
        //sc.close();
        do {

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("good");
            } else if (age >= 13) {
                System.out.println("normal");
            } else {
                System.out.println("bad");
            }
            count++;
        }while(count < 5);
    }
}
