package euler;

import java.util.HashSet;
import java.util.Set;

public class Problem29 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(2, 100));

    System.out.println("#####################");
  }

  public static long answer(long min, long max) {
    Set<Double> set = new HashSet<>();
    for (long i = min; i <= max; i++) {
      for (long j = min; j <= max; j++) {
        set.add(Math.pow(i, j));
      }
    }
    return set.size();
  }
}
