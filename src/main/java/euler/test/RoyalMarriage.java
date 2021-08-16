package euler.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoyalMarriage {
  public static void main(String[] args) {

//    String string ="HDSDHHSDDHSHHSSSSDDHHSDHSSDDDHSHSDSHDSDHHSHHHDHHDH" +
//            "HSSDSDHSSHSSSSDHDSSSDDHDDDHHHHHDHHSDDDHSHSSHHSSSDD" +
//            "DHSHHSHHSSDDHSDDSDDDSSSHDDSDDHHSDDDDDHHSDSSSDHSHHS" +
//            "SDHDSDHHHSHHDHHSSHDHDHDDHSHDHHSSDHDDDHSHHSSSDSDHSS" +
//            "DHSHHSDSDDSSDHHHHSSHSSHSHSSDDDHDDSHDDDHSHDHSHDSSDD" +
//            "HSDSHSSHDDDSHSDSDHSDDDDHDHHSDHDHHHSDSDHSSDHHHHDDSS" +
//            "HSSDSSDDDSDHDHSDSDSHSDDDDSHSHHSDHDHSDDSDHDSHSSDDHS" +
//            "SSSDDDHDSHHHSHDHSHSHDDDDSSHDSHHDSDSDSHDSDHDHDSHSHS" +
//            "DHSHDSDDSDHSDSDDSHDDSSSHSSDHSDHHHDHDSDSHDSHDDHHDSD" +
//            "DSDHSHSSHHDHSHHHHSDDDSHHHSDSHHHDHHDDDSDDSHSDHHSDHS" +
//            "SDSHSSDSSSDHHHSDHSDHHSDHSSDSHSDDSDHDHSHSDDDDHHSHSH" +
//            "DSHSHDDSDHDDHSHHHHSHSHHSSHSHSDDSSSDSDDDHDSSHHSHDSH";

    String string = "ABBAM";

        while (true){
          string = excute(string);
          System.out.println(string);
          if(string.equals("none")){
            break;
          }
        }

  }

  public static String excute(String str) {

    List<String> list = Arrays.asList(str.split(""));
    List<String> strings = new ArrayList<>(list);

    String mojiNow = "";
    String moji1 = "";
    String moji2 = "";
    String moji3 = "";

    int index = 0;
    int count = 1;
    StringBuilder sb = new StringBuilder();
    while (true){
      mojiNow = strings.get(index);
      moji1 = strings.get(index+1);
      moji2 = strings.get(index+2);
      moji3 = strings.get(index+3);

      if(mojiNow.equals(moji2)){
        strings.remove(index+1);
        for(String s : strings){
            sb.append(s);
        }
        return sb.toString();
      }
      if(mojiNow.equals(moji3)){
        strings.remove(index+1);
        strings.remove(index+2);
        for(String s : strings){
            sb.append(s);
        }
        return sb.toString();
      }

      if(count==str.length()-3){
        System.out.println("oooo");
        return "none";
      }
      index++;
      count++;
    }
  }

}
