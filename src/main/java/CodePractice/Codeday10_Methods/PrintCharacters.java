package CodePractice.Codeday10_Methods;

public class PrintCharacters {
  static void print_Chars(char ch1, char ch2, int n) {
    // -------------------first method----------------
    int a = 1, k = n;
    for (char ch = ch1; ch <= ch2; ch++, a++) {

      System.out.print(ch + " ");

      if (a == n) {
        System.out.println();
        n += k;
      }
    }
    // -------------------second method----------------
    // int a = 1;
    // for (char ch = ch1; ch <= ch2; ch++, a++) {

    // System.out.print(ch + " ");
    // if (a == n) {
    // System.out.println();
    // a = 0;
    // }
    // }
  }

  public static void main(String[] args) {
    print_Chars('(', 'z', 20);
  }
}
