package euler;

public class Problem5 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer(20));

    System.out.println("#####################");
  }

  public static long answer(long max) {
    long num=1;
    while (true){
      if(subeteOK(num,max)){
        return num;
      }
      num++;
    }
  }

  public static boolean subeteOK(long num,long max){
    for(int i = 1; i <=max ; i++) {
      if(num%i!=0){
        return false;
      }
    }
    return true;
  }


}
