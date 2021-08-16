package euler.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test9 {
  public static void main(String[] args) {

    long max = 0;
    for (int i = 1;i <1000000; i++) {
      long nowNum = i;
      long nextNum = i;
      long count =1;
      while (true){
        nowNum = nextNum;
        if(nowNum==1){
          break;
        }
        if(nowNum%2==0){
          nextNum = nowNum/2;
        }else{
          nextNum = 3*nowNum+1;
        }
        count++;
      }
      if(count>max){
        max = count;
        System.out.println(i);
      }
    }
  }

}
