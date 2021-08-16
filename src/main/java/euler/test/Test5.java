package euler.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 問題5：ROT1-2-3
// 英字からなる文字列について、以下のような「変換」を適用する。
// • 1 文字目(先頭)の英字を「1 つ先の英字」(A → B、B → C、など)に置き換える。 • 2 文字目の英字を「2 つ先の英字」(A → C、B → D、など)に置き換える。
// • 以後同様に、𝑛 文字目の英字を「𝑛 個先の英字」に置き換える。
// ※ Z の 1 つ先は A に戻るものとする。すなわち、Z の 2 つ先は B で、Z の 26 個先は Z である。 例えば、「DAY」にこの「変換」を適用すると「ECB」が得られる。
// とある文字列 𝑆 について、「変換」を適用すると以下の文字列が得られた。
//
// CZZVQPNFZGRNJGWVQHKXLSTZGLHMKQQHJSQRMXPVZVCCDDFCPV
// KBWXZLWZGKGQQBSQLCSHZHXJDPBJKLNWSXWZWJHRTHFSBPSKXX
// WQJJNDKHLLRRTZBTPZMFDTKLGHMBRTKXPQKNTNTQRZMVKMDBDM
// BDMRBZHZWJKVZZKNXHKHVHJJMXNCMRQKTHKTGBJSSJDLXNKXDP
// FLGVDXVBQLNWXXQLVNNSCBGBDDVHBCCVSNRFNDHXRTTQDHZGGB
// NPZJQRPKVTRDNPRZSPPZQXFJMSCJFZKZSPSLDMCXCTWLMPXBDQ
// QVWPMTXCPRBPQMWIFSSIKLPMGSRXEGEIBEPRWSGFZXSPDKBWVZ
// CRQMXNQDXRNZPRSVWDSNTPBLRTWGZNWXJNRDNPSKRTQQPDDLCJ
// HTGQVDJFCQLMWFFSRSPPSRWJKHMCWZVMJVSDFHTZSZWXJHGQCS
// QQGSCXRMWTVPQJZPGPGXVLLTQKTQNRSXZRBJDWRHHDKJDMNTBR
//
// 𝑆 の中には「TEAMLAB」という部分文字列が含まれる。元の文字列 𝑆 を復元した上で、𝑆 の中の「TEAMLAB」 の直後に続く 15 文字を答えよ。
public class Test5 {
  public static void main(String[] args) {

    String string = "CZZVQPNFZGRNJGWVQHKXLSTZGLHMKQQHJSQRMXPVZVCCDDFCPV" +
            "KBWXZLWZGKGQQBSQLCSHZHXJDPBJKLNWSXWZWJHRTHFSBPSKXX" +
            "WQJJNDKHLLRRTZBTPZMFDTKLGHMBRTKXPQKNTNTQRZMVKMDBDM" +
            "BDMRBZHZWJKVZZKNXHKHVHJJMXNCMRQKTHKTGBJSSJDLXNKXDP" +
            "FLGVDXVBQLNWXXQLVNNSCBGBDDVHBCCVSNRFNDHXRTTQDHZGGB" +
            "NPZJQRPKVTRDNPRZSPPZQXFJMSCJFZKZSPSLDMCXCTWLMPXBDQ" +
            "QVWPMTXCPRBPQMWIFSSIKLPMGSRXEGEIBEPRWSGFZXSPDKBWVZ" +
            "CRQMXNQDXRNZPRSVWDSNTPBLRTWGZNWXJNRDNPSKRTQQPDDLCJ" +
            "HTGQVDJFCQLMWFFSRSPPSRWJKHMCWZVMJVSDFHTZSZWXJHGQCS" +
            "QQGSCXRMWTVPQJZPGPGXVLLTQKTQNRSXZRBJDWRHHDKJDMNTBR";
    String[] strings = string.split("");

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    List<String> list = new ArrayList<>(List.of(alphabet.split("")));

        for (int i = 0; i < strings.length; i++) {
          int nanmojime = i+1; //1~
          int index = alphabet.indexOf(strings[i])+1; //1~26

          int newIndex=0;
          if((index-nanmojime)%26>0){
            newIndex = (index-nanmojime)%26;
          }else{
            newIndex = 26+(index-nanmojime)%26;
          }
          System.out.print(list.get(newIndex-1));
        }
  }
}
