package euler;

public class Problem12Check {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer());

    System.out.println("#####################");
  }

  public static long answer() {

    long num = 1;
    while (true) {
      System.out.println(num);
      long sum = 0;
      for (int i = 1; i <= num; i++) {
        sum += i;
      }
      int counter = 0;
      for (int i = 1; i <= sum; i++) {
        if (sum % i == 0) {
          counter++;
        }
      }
      if (counter > 500) {
        return sum;
      } else {
        System.out.println("No");
        num++;
      }
    }
  }
}
