package euler.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// チャンパーノウン定数
// 正の整数を小さい順に並べたものを全て連結した数字列を小数部とする小数を考える(この実数は無理数である)。
//
// 0.123456789101112131415161718192021⋯
//
// 太字で示した通り、この実数の小数第 12 位は 1 である。
// この実数の第 1 位、第 10 位、第 100 位、第 1000 位、第 10000 位、第 100000 位、第 1000000 位の数字を求 め、それら全ての積を答えよ。
public class Test2 {
  public static void main(String[] args) {

    // 1-9までは1文字 (9この数字
    // 10-99までは2文字 (100この数字
    // 100-999までは3文字(1000この数字
    // 1000-9999までは4文字(10000この数字
    // 10000-99999までは5文字(100000この数字
    // 100000は6文字(1この数字

    System.out.println(9+200+3000+40000+500000+6*100000);

    StringBuilder string =new StringBuilder();

    for (int i = 0; i <= 200000; i++) {
      string.append(String.valueOf(i));
    }
    System.out.println(string);

    System.out.println(string.charAt(1));
    System.out.println(string.charAt(10));
    System.out.println(string.charAt(100));
    System.out.println(string.charAt(1000));
    System.out.println(string.charAt(10000));
    System.out.println(string.charAt(100000));
    System.out.println(string.charAt(1000000));
  }



}
