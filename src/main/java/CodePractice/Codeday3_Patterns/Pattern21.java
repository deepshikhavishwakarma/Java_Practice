package CodePractice.Codeday3_Patterns;

public class Pattern21 {
  public static void main(String[] args) {
    int a;
    for (int i = 1; i <= 5; i++) {

      for (int j = i; j <= 5; j++) {
        System.out.print(" ");
      }
      a = 1;
      for (int j = 1; j <= i; j++) {
        System.out.print(a);
        a += 2;

      }
      a += 2;
      System.out.println();

    }

  }
}