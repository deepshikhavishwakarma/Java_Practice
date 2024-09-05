package CodePractice.Codeday3_Patterns;

public class Pattern15 {
  public static void main(String[] args) {
    //int a = 1;
    for (int i = 1; i <= 5; i++) {
      // l = a;
      for (int j = 1; j <= i; j++) {
        if (j == 1 || i == j) {
          System.out.print(1 + " ");
        } else {
          System.out.print(0 + " ");
        }
        // l += 2;
      }
      System.out.println();
      // a = a - 2;
    }
  }
}