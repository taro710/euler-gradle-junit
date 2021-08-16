package euler;

import java.math.BigInteger;

public class Problem25 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(1000));

    System.out.println("#####################");
  }

  public static long answer(long num) {
    BigInteger num1 = BigInteger.ONE;
    BigInteger num2 = BigInteger.ONE;
    BigInteger nowNum;

    long count = 3;
    while (true) {
      nowNum = num1.add(num2);
      if (nowNum.toString().length() == num) {
        return count;
      }
      num2 = num1;
      num1 = nowNum;
      count++;
    }
  }
}
