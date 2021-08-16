package euler;

public class Problem28 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(2, 100));

    System.out.println("#####################");
  }

  public static long answer(long min, long max) {
    // 11   1
    // 33   1*4+4=8    3  5  7  9  (2ずつ）
    // 55   3*4+4=16   13 17 21 25 (4ずつ）
    // 77   5*4+4=24   31 37 43 49 (6ずつ)
    // .
    // nn              (n-1)*(n-2)+1 (n-1)*(n-2)+n (n-1)*(n-2)+2n-1 (n-1)*(n-2)+3n-2 (n-1ずつ)
    // .
    // 1001 5*4+4=24   31 37 43 49 (1000ずつ)

    return 1;
  }
}
