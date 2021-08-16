package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem24Check {
  public static void main(String... args) {
    System.out.println("#####################");

    answer();

    System.out.println("#####################");
  }

  public static void answer() {

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= 9; i++) {
      List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
      System.out.print(i);
      list.remove(Integer.valueOf(i));
    }
  }
}
