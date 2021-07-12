package euler;

public class Problem4 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer());

    System.out.println("#####################");
  }

  public static long answer() {
    long max =0;
    for (long i = 100; i <=999 ; i++) {
      for (long j = 100; j <=999 ; j++) {
        long num=i*j;
        StringBuilder normal = new StringBuilder(String.valueOf(num));
        StringBuilder reverse = new StringBuilder(String.valueOf(num)).reverse();
        if(normal.toString().equals(reverse.toString())){
          long num2 = Long.parseLong(String.valueOf(normal));
          if(max<num2){
            max=num2;
          }
        }
      }
    }
    return max;
  }


}
