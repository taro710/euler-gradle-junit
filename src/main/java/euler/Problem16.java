package euler;

import java.math.BigInteger;

public class Problem16 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer());

    System.out.println("#####################");
  }

  public static long answer() {
    BigInteger bigInteger = BigInteger.TWO;
    BigInteger pow = bigInteger.pow(1000);
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
