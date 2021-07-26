package euler;

public class Problem17 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(1000));

    System.out.println("#####################");
  }

  public enum NumberWord {
    NUM1(1, "one"),
    NUM2(2, "two"),
    NUM3(3, "three"),
    NUM4(4, "four"),
    NUM5(5, "five"),
    NUM6(6, "six"),
    NUM7(7, "seven"),
    NUM8(8, "eight"),
    NUM9(9, "nine"),
    NUM10(10, "ten"),
    NUM11(11, "eleven"),
    NUM12(12, "twelve"),
    NUM13(13, "thirteen"),
    NUM14(14, "fourteen"),
    NUM15(15, "fifteen"),
    NUM16(16, "sixteen"),
    NUM17(17, "seventeen"),
    NUM18(18, "eighteen"),
    NUM19(19, "nineteen"),
    NUM20(20, "twenty"),
    NUM30(30, "thirty"),
    NUM40(40, "forty"),
    NUM50(50, "fifty"),
    NUM60(60, "sixty"),
    NUM70(70, "seventy"),
    NUM80(80, "eighty"),
    NUM90(90, "ninety"),
    NUM100(100, "hundred"),
    NUM1000(1000, "onethousand");

    private final int num;
    private final String word;

    NumberWord(int num, String word) {
      this.num = num;
      this.word = word;
    }

    public static NumberWord getByNum(int num) {
      for (NumberWord numberWord : NumberWord.values()) {
        if (numberWord.num == num) {
          return numberWord;
        }
      }
      return null;
    }
  }

  public static long answer(long num) {

    long answer = 0;
    for (int i = 1; i <= num; i++) {
      System.out.print(i + " ");
      if (i <= 19) {
        System.out.println(countUntil19(i));
        answer += countUntil19(i).length();
      } else if (i <= 99) {
        System.out.println(countUntil99(i));
        answer += countUntil99(i).length();
      } else if (i <= 999) {
        System.out.println(countUntil999(i));
        answer += countUntil999(i).length();
      } else {
        System.out.println(NumberWord.NUM1000.word);
        answer += NumberWord.NUM1000.word.length();
      }
    }

    return answer;
  }

  public static String check(int num) {
    if (num <= 19) {
      return countUntil19(num);
    } else if (num <= 99) {
      return countUntil99(num);
    } else if (num <= 999) {
      return countUntil999(num);
    } else {
      return NumberWord.NUM1000.word;
    }
  }

  private static String countUntil19(int num) {
    if (num > 19) {
      System.out.println("19以下で頼む");
      return "";
    }
    return NumberWord.getByNum(num).word;
  }

  private static String countUntil99(int num) {
    if (num < 20 || num > 99) {
      System.out.println("20以上99以下で頼む");
      return "";
    }
    if (num % 10 == 0) {
      return NumberWord.getByNum(num).word;
    } else {
      return NumberWord.getByNum((num / 10) * 10).word
          + NumberWord.getByNum(num - (num / 10) * 10).word;
    }
  }

  private static String countUntil999(int num) {
    if (num < 100 || num > 999) {
      System.out.println("100以上999以下で頼む");
      return "";
    }
    if (num % 100 == 0) { // 100,200,300,400,500,,,
      return NumberWord.getByNum(num / 100).word + NumberWord.NUM100.word;
    }
    String nanbyaku = NumberWord.getByNum(num / 100).word + NumberWord.NUM100.word;
    int hasu = num - (num / 100) * 100;
    if (hasu <= 19) { // 110,212,411,,,
      return nanbyaku + "and" + countUntil19(hasu);
    } else { // 110,230,440,,,
      return nanbyaku + "and" + countUntil99(hasu);
    }
  }
}
