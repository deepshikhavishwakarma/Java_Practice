package CodePractice.Codeday3_Patterns;

public class Pattern7 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      int a = 5;
      for (int j = 1; j <= i; j++) {

        System.out.print(a-- + " ");

      }
      System.out.println();
    }
  }
}