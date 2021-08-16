package euler.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test7 {
  public static void main(String[] args) {

    String string ="HDSDHHSDDHSHHSSSSDDHHSDHSSDDDHSHSDSHDSDHHSHHHDHHDH" +
            "HSSDSDHSSHSSSSDHDSSSDDHDDDHHHHHDHHSDDDHSHSSHHSSSDD" +
            "DHSHHSHHSSDDHSDDSDDDSSSHDDSDDHHSDDDDDHHSDSSSDHSHHS" +
            "SDHDSDHHHSHHDHHSSHDHDHDDHSHDHHSSDHDDDHSHHSSSDSDHSS" +
            "DHSHHSDSDDSSDHHHHSSHSSHSHSSDDDHDDSHDDDHSHDHSHDSSDD" +
            "HSDSHSSHDDDSHSDSDHSDDDDHDHHSDHDHHHSDSDHSSDHHHHDDSS" +
            "HSSDSSDDDSDHDHSDSDSHSDDDDSHSHHSDHDHSDDSDHDSHSSDDHS" +
            "SSSDDDHDSHHHSHDHSHSHDDDDSSHDSHHDSDSDSHDSDHDHDSHSHS" +
            "DHSHDSDDSDHSDSDDSHDDSSSHSSDHSDHHHDHDSDSHDSHDDHHDSD" +
            "DSDHSHSSHHDHSHHHHSDDDSHHHSDSHHHDHHDDDSDDSHSDHHSDHS" +
            "SDSHSSDSSSDHHHSDHSDHHSDHSSDSHSDDSDHDHSHSDDDDHHSHSH" +
            "DSHSHDDSDHDDHSHHHHSHSHHSSHSHSDDSSSDSDDDHDSSHHSHDSH";

            while (true){
              string = excute(string);
              System.out.println(string);
              if(string.equals("none")){
                break;
              }
            }

  }

  public static String excute(String str) {

    char mojiNow ;
    char moji1 ;
    char moji2 ;
    char moji3 ;

    int index = 0;
    int count = 1;
    StringBuilder sb = new StringBuilder(str);
    while (true){
      mojiNow = sb.charAt(index);
      moji2 = sb.charAt(index+2);
      moji3 = sb.charAt(index+3);
      if(mojiNow==moji2){
        return sb.delete(index+1,index+2).toString();
      }
      if(mojiNow==moji3){
        return sb.delete(index+1,index+3).toString();
      }

      if(count==str.length()-3){
        return "none";
      }
      index++;
      count++;
    }
  }

}
