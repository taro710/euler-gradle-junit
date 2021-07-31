package euler;

import java.math.BigInteger;

public class Problem20 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(100));

    System.out.println("#####################");
  }

  public static long answer(long num) {

    BigInteger multiple = BigInteger.ONE;
    for (long i = num; i > 0; i--) {
      multiple = multiple.multiply(BigInteger.valueOf(i));
    }
    System.out.println(multiple);

    long answer = 0;
    for (String s : multiple.toString().split("")) {
      answer += Integer.parseInt(s);
    }

    return answer;
  }
}
