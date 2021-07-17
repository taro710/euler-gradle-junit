package euler;

import euler.utils.ProjectEulerUtil;

public class Problem14 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(1000000));

    System.out.println("#####################");
  }

  public static long answer(long param) {

    long maxCount = 0;
    long answer = 0;
    for (long firstNum = 1; firstNum < param; firstNum++) {
      long nowNum = firstNum;
      long nextNum;
      long count = 1;
      while (true) {
        if (ProjectEulerUtil.isEven(nowNum)) {
          nextNum = nowNum / 2;
        } else {
          nextNum = 3 * nowNum + 1;
        }
        if (nextNum == 1) {
          if (maxCount < count) {
            maxCount = count;
            answer = firstNum;
          }
          break;
        }
        nowNum = nextNum;
        count++;
      }
    }
    return answer;
  }
}
