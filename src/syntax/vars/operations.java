package syntax.vars;

public class operations {
    public static void main(String[] args) {
        int a = 5, b = 6;

        //оператор присваивания =
        b= a;

        //арифметические операторы
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int division = a/b;
        int mod = a % b;

        //a++ инкремент
        //а-- декремент
        //a += 4
        //a -= 4
        //a *= 4
        //a /= 4

        //операторы сравнения
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isGreaterEqual = a >= b;
        boolean isLess = a < b;
        boolean isLessEqual = a <= b;

        //And(&&)    Or(||)
        boolean aIsGreaterThanB = b > a;
        boolean aIsEqualToB = b == a;

        System.out.println(aIsGreaterThanB || aIsEqualToB);
    }
}
