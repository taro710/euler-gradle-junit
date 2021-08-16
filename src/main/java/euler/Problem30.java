package euler;

public class Problem30 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(5));

    System.out.println("#####################");
  }

  public static long answer(int num) {
    long total = 0;
    for (int i = 2; i <= 1000000; i++) { // TODO どの数まで検証するか
      String[] strings = String.valueOf(i).split("");
      double sum = 0;
      for (String s : strings) {
        sum += Math.pow(Integer.parseInt(s), num);
      }
      if (sum == i) {
        System.out.println(i);
        total += i;
      }
    }
    return total;
  }
}
