package euler;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Problem19 {
  public static void main(String... args) {
    System.out.println("#####################");

    int sundayCounter = 0;
    for (int i = 1901; i <= 2000; i++) {
      for (int j = 1; j <= 12; j++) {
        if (getDayOfWeek(i, j, 1).equals("Sunday")) {
          //          System.out.println(i + "-" + j + "-1");
          sundayCounter++;
        }
      }
    }
    //    System.out.println(sundayCounter);

    int sundayCounter1 = 0;
    for (int i = 1901; i <= 2000; i++) {
      for (int j = 1; j <= 12; j++) {
        LocalDate date = LocalDate.of(i, j, 1);
        if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
          //          System.out.println(date);
          sundayCounter1++;
        }
      }
    }
    //    System.out.println(sundayCounter1);

    //    System.out.println(getDayOfWeek(1954, 2, 1));

    System.out.println("#####################");
  }

  public static String getDayOfWeek(int year, int month, int day) {

    int sonotsukimadennonissu = 0;
    switch (month) {
      case 1:
        sonotsukimadennonissu = 0;
        break;
      case 2:
        sonotsukimadennonissu = 31;
        break;
      case 3:
        sonotsukimadennonissu = 31 + 28;
        break;
      case 4:
        sonotsukimadennonissu = 31 + 28 + 31;
        break;
      case 5:
        sonotsukimadennonissu = 31 + 28 + 31 + 30;
        break;
      case 6:
        sonotsukimadennonissu = 31 + 28 + 31 + 30 + 31;
        break;
      case 7:
        sonotsukimadennonissu = 31 + 28 + 31 + 30 + 31 + 30;
        break;
      case 8:
        sonotsukimadennonissu = 31 + 28 + 31 + 30 + 31 + 30 + 31;
        break;
      case 9:
        sonotsukimadennonissu = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        break;
      case 10:
        sonotsukimadennonissu = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        break;
      case 11:
        sonotsukimadennonissu = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        break;
      case 12:
        sonotsukimadennonissu = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        break;
    }

    int dayFrom19000101NoUruHosei = (year - 1900) * 365 + sonotsukimadennonissu + day;

    int uruCounter = 0;
    for (int i = 1900; i <= year; i++) {
      if (i % 4 == 0) {
        if (i % 400 != 0 && i % 100 == 0) {
        } else {
          System.out.println(i);
          uruCounter++;
        }
      }
    }
    int dayFrom19000101 = 0;
    if (month >= 3) {
      dayFrom19000101 = dayFrom19000101NoUruHosei + uruCounter;
    } else {
      dayFrom19000101 = dayFrom19000101NoUruHosei + uruCounter - 1;
    }

    if (dayFrom19000101 % 7 == 0) {
      return "Sunday";
    } else {
      return "";
    }
  }
}
