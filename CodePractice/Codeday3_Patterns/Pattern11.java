package CodePractice.Codeday3_Patterns;

public class Pattern11 {
  public static void main(String[] args) {
    int a = 9;
    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= 5; j++) {
        System.out.print(a + " ");

      }
      System.out.println();
      a = a - 2;
    }
  }
}