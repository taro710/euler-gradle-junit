package euler;

import java.math.BigInteger;

public class Problem16 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(2, 1000));

    System.out.println("#####################");
  }

  public static long answer(long radix, int index) {
    BigInteger bigInteger = BigInteger.valueOf(radix);
    BigInteger pow = bigInteger.pow(index);
    String string = pow.toString();
    System.out.println(string);
    String[] strings = string.split("");
    long answer = 0;
    for (String s : strings) {
      answer += Long.parseLong(s);
    }
    return answer;
  }
}
