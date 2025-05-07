package syntax.vars;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimal_BigInteger {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("1234567890");
        BigDecimal number2 = BigDecimal.valueOf(1234567822.212);


        BigDecimal sum = number1.add(number2);
        BigDecimal tax = sum.multiply(new BigDecimal("0.13"));

        BigInteger number3 = new BigInteger("1234567890123123123123123123");
        BigInteger number4 = BigInteger.valueOf(1234567890123123123L);

        BigInteger difference = number3.subtract(number4);
        System.out.println(difference);
    }
}
