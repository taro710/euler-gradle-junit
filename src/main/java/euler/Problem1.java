package euler;

public class Problem1 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(1000));

    System.out.println("#####################");
  }

  public static long answer(long num) {
    long sum = 0;
    for (int i = 1; i <= num; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }
    return sum;
  }
}
