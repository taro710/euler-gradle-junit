import java.util.List;

public class Main {
  public static void main(String[] args) {
    String str =
        "CZZVQPNFZGRNJGWVQHKXLSTZGLHMKQQHJSQRMXPVZVCCDDFCPV"
            + "KBWXZLWZGKGQQBSQLCSHZHXJDPBJKLNWSXWZWJHRTHFSBPSKXX"
            + "WQJJNDKHLLRRTZBTPZMFDTKLGHMBRTKXPQKNTNTQRZMVKMDBDM"
            + "BDMRBZHZWJKVZZKNXHKHVHJJMXNCMRQKTHKTGBJSSJDLXNKXDP"
            + "FLGVDXVBQLNWXXQLVNNSCBGBDDVHBCCVSNRFNDHXRTTQDHZGGB"
            + "NPZJQRPKVTRDNPRZSPPZQXFJMSCJFZKZSPSLDMCXCTWLMPXBDQ"
            + "QVWPMTXCPRBPQMWIFSSIKLPMGSRXEGEIBEPRWSGFZXSPDKBWVZ"
            + "CRQMXNQDXRNZPRSVWDSNTPBLRTWGZNWXJNRDNPSKRTQQPDDLCJ"
            + "HTGQVDJFCQLMWFFSRSPPSRWJKHMCWZVMJVSDFHTZSZWXJHGQCS"
            + "QQGSCXRMWTVPQJZPGPGXVLLTQKTQNRSXZRBJDWRHHDKJDMNTBR";

    String alphabet = "ABCDEFGHIJKLNMOPQRSTUVWXYZ";
    List<String> alphabets = List.of(alphabet.split(""));
    StringBuilder newString = new StringBuilder();

    int count = 1;
    for (String s : str.split("")) {
      int num = alphabets.indexOf(s) - count;
      if (num < 0) {
        num = 26 + num % 26;
      }
      //      System.out.print(num);
      //
      //      System.out.print(" ");
      String newSt = alphabets.get(num);
      System.out.print(newSt);
      count++;
    }
  }
}
