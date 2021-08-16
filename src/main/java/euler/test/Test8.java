package euler.test;

import euler.utils.ProjectEulerUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test8 {
  public static void main(String[] args) {

    long count =0;
    long num =2;
    while (true){
      if(ProjectEulerUtil.isPrime(num)){
        count++;
      }
      if(count==10001){
        System.out.println(num);
        break;
      }
      num++;
    }
  }

}
