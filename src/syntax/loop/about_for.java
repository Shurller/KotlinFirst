package syntax.loop;

public class about_for {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
            sum += i;
            System.out.println(sum);
        }
    }
}
