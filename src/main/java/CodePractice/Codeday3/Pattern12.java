package CodePractice.Codeday3;

public class Pattern12 {
  public static void main(String[] args) {
    int a = 9, l;
    for (int i = 1; i <= 5; i++) {
      l = a;
      for (int j = 1; j <= i; j++) {
        System.out.print(l + " ");
        l += 2;
      }
      System.out.println();
      a = a - 2;
    }
  }
}