package euler;

import euler.utils.ProjectEulerUtil;

public class Problem7 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(6));

    System.out.println("#####################");
  }

  public static long answer(long value) {
    long num=2;
    long count =0;
    while (true){
      if(ProjectEulerUtil.isPrime(num)){
        count++;
        if(count==value){
          return num;
        }
      }
      num++;
    }
  }


}
