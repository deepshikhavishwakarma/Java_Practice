package CodePractice.Codeday3_Patterns;

public class Pattern2 {
  public static void main(String[] args) {
    for (int i = 5; i >= 1; i--) {
      int a = i;
      for (int j = 1; j <= i; j++) {
        System.out.print(a);
        a--;
      }
      System.out.println();
    }
  }
}