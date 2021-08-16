package euler.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
  public static void main(String[] args) {

    for (int i = 900; i <=999; i++) {
      for (int j = 900; j <=999 ; j++) {
        StringBuilder sb = new StringBuilder(String.valueOf(i*j));
        StringBuilder reverce = new StringBuilder(String.valueOf(i*j)).reverse();
        if(sb.toString().equals(reverce.toString())){
          System.out.println(sb);
        }

      }
    }
  }


}
