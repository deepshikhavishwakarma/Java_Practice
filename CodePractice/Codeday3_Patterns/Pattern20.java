package CodePractice.Codeday3_Patterns;

public class Pattern20 {
  public static void main(String[] args) {
    int a = 1;
    for (int i = 1; i <= 5; i++) {

      int b = a;
      for (int j = 1; j <= i; j++) {
        System.out.print(b+" ");
        b -= 2;

      }
      for (int j = i; j <= 5; j++) {
        System.out.print(" ");
      }
      a += 2;
      System.out.println();

    }

  }
}