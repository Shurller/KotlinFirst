package syntax.printf_lesson;

import java.time.*;

public class about_printf {
    public static void main(String[] args) {

        var name = "sas";
        System.out.printf("Hello World, %s, how are u    %n", name);

        int age = 20;
        System.out.printf("my age is %d %n", age);

        double height = 5.0;
        System.out.printf("my height is %3.2f", height);

        LocalDateTime now = LocalDateTime.now();
        System.out.printf("now is %tF %tT  %n", now, now);
    }
}
