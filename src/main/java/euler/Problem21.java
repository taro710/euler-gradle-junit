package euler;

import java.math.BigInteger;

public class Problem21 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(10000));

    System.out.println("#####################");
  }

  public static long answer(long num) {
    long total = 0;
    for (int a = 1; a <num ; a++) {
      long b = d(a);
      long c = d(b);
      if(a==c && b!=a ){
        total+=b;
      }
    }
    return total;
  }
  public static long d(long num){
    long total = 0;
    for (int i = 1; i <num ; i++) {
      if(num%i==0) total+=i;
    }
    return total;
  }
}
