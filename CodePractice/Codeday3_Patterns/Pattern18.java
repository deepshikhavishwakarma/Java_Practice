package CodePractice.Codeday3_Patterns;

public class Pattern18 {
  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++) {
      int a = i;
      for (int j = i; j <= 5; j++) {
        System.out.print("  ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(a-- + " ");
      }

      System.out.println();

    }
  }
}