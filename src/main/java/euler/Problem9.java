package euler;

public class Problem9 {
  public static void main(String... args) {
    System.out.println("#####################");

    System.out.println(answer());

    System.out.println("#####################");
  }

  public static long answer() {
    long answer=0 ;
    for (int i = 1; i <1000 ; i++) {
      for (int j = 1; j <1000 ; j++) {
        for(int k =1 ; k < 1000; k++) {
          if(i<j&&i*i+j*j==k*k&&i+j+k==1000){
            answer = i*j*k;
          }
        }
      }
    }
    return answer;
  }


}
