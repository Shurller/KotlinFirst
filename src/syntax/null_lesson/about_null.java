package syntax.null_lesson;

public class about_null {
    public static void main(String[] args) {

        String nullableString = null;
        System.out.println(nullableString);
        nullableString.length(); // будет ошибка
        Integer nullableInt = null;
        System.out.println(nullableInt);
    }
}
