package euler;

public class Problem2 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer());

    System.out.println("#####################");
  }

  public static long answer() {
    long beforeBeforeNum = 1;
    long beforeNum = 2;
    long total = 0;
    while (true){
      long nowNum = beforeBeforeNum+beforeNum;
      if(nowNum>4000000){
        break;
      }
      if(nowNum%2==0){
        total+=nowNum;
      }
      beforeBeforeNum = beforeNum;
      beforeNum=nowNum;
    }
    return total+2;
  }
}
