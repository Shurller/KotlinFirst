package syntax.vars;

public class finalization {
    public static void main(String[] args) {
        int firstInt = 2, secondInt = 3;

        secondInt = 4;
        System.out.println("firstInt: " + firstInt+", secondInt: " + secondInt);

        final var nameOfBoss = "Boss";
        //nameOfBoss = "No Boss"; // видим ошибку т.к. final
        System.out.println("nameOfBoss: " + nameOfBoss);
    }
}
