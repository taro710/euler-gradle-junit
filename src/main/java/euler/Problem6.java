package euler;

public class Problem6 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(100));

    System.out.println("#####################");
  }

  public static long answer(long num) {
    long answer1=0;
    for (long i = 1; i <=num ; i++) {
      answer1+=i*i;
    }
    long sum=0;
    for (long i = 1; i <=num ; i++) {
      sum+=i;
    }
    long answer2 = sum*sum;
    return answer2-answer1;
  }


}
