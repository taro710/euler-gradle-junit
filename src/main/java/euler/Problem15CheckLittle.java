package euler;

import java.math.BigInteger;

public class Problem15CheckLittle {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(40, 20));

    System.out.println("#####################");
  }

  public static Long answer(long size, long area) {
    BigInteger num = BigInteger.ONE;
    for (int i = 21; i <= size; i++) {
      num = num.multiply(BigInteger.valueOf(i));
    }
    BigInteger num2 = BigInteger.ONE;
    for (int i = 1; i <= area; i++) {
      num2 = num2.multiply(BigInteger.valueOf(i));
    }
    return Long.valueOf(num.divide(num2).toString());
  }
}
