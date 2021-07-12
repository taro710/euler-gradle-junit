package euler;

import euler.utils.ProjectEulerUtil;

public class Problem3 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(600851475143L));

    System.out.println("#####################");
  }

  public static long answer(long num) {
    long max =0;
    for (long i = 2; i <num ; i++) {
      if(ProjectEulerUtil.isPrime(i)&&num%i==0){
        if(max<i){
          System.out.println(i);
          max=i;
        }
      }
    }
    return max;
  }
}
