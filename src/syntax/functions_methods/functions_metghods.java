package syntax.functions_methods;

public class functions_metghods {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        System.out.printf("Sum of numbers %d and %d is: " +getSumOfNumbers(num1, num2), num1, num2);
    }
    public static long getSumOfNumbers(int a, int b) {
        return a + b;

    }
}


