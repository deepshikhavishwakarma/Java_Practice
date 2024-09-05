package CodePractice.Codeday3_Patterns;

public class Pattern19 {
  public static void main(String[] args) {
    int a = 1;
    for (int i = 1; i <= 5; i++) {

      for (int j = i; j <= 5; j++) {
        System.out.print(" ");
      }
      int b = a;
      for (int j = 1; j <= i; j++) {
        System.out.print(b);
        b -= 2;

      }
      a += 2;
      System.out.println();

    }

  }
}