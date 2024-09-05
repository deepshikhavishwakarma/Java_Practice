package CodePractice.Codeday3_Patterns;



public class Pattern10 {
  public static void main(String[] args) {
    int a = 3;
    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(a + " ");

      }
      System.out.println();
      a++;
    }
  }
}