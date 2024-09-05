package CodePractice.Codeday3_Patterns;

public class Pattern6 {
  public static void main(String[] args) {
    for (int i = 5; i >= 1; i--) {

      for (int j = 1; j <= i*2; j += 2) {
        
        System.out.print(j);
      }

      System.out.println();
    }
  }
}