package euler;

import euler.utils.ProjectEulerUtil;

public class Problem10 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(2000000L));

    System.out.println("#####################");
  }

  public static long answer(long num) {
    long answer=0;
    for (int i = 2; i <=num ; i++) {
      if(ProjectEulerUtil.isPrime(i)){
        answer+=i;
      }
    }
    return answer;
  }


}
