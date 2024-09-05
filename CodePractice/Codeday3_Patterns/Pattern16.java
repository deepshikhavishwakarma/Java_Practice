package CodePractice.Codeday3_Patterns;

public class Pattern16 {
  public static void main(String[] args) {
    // int a = 1;
    for (int i = 1; i <= 5; i++) {
      int a = i;
      for (int j = 1; j <= i; j++) {
        System.out.print(a++ + " ");

      }
      System.out.println();
      // a = a - 2;
    }
  }
}