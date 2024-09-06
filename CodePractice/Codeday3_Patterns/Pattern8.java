package CodePractice.Codeday3_Patterns;

public class Pattern8 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      // int a = i;
      for (int j = i; j <= 5; j++) {

        System.out.print(j + " ");
        // a--;
      }
      System.out.println();
    }
  }
}