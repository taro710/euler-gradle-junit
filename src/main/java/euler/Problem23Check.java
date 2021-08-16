package euler;

public class Problem23Check {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer());
    System.out.println(isKajo(12));
    System.out.println(isBeFromTwinKajo(24));

    System.out.println("#####################");
  }

  public static long answer() {
    long total = 0;
    for (int i = 1; i <= 28123; i++) {
      if (!isBeFromTwinKajo(i)) {
        System.out.println(i);
        total += i;
      }
    }
    return total;
  }

  public static boolean isKajo(long num) {
    long total = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        total += i;
      }
    }
    return total > num;
  }

  public static boolean isBeFromTwinKajo(long num) {
    for (int i = 1; i < num; i++) {
      if (isKajo(i) && isKajo(num - i)) {
        return true;
      }
    }
    return false;
  }
}
