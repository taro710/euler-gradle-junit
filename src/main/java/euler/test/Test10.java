package euler.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test10 {
  public static void main(String[] args) {

    BigInteger num1 = BigInteger.ONE;
    BigInteger num2 = BigInteger.ONE;
    BigInteger numNow = BigInteger.ZERO;

    long count=3;
    while (true){
      numNow = num1.add(num2);
      if(String.valueOf(numNow).length()==1000){
        System.out.println(count);
        break;
      }
      num1=num2;
      num2=numNow;
      count++;
    }

  }

}
