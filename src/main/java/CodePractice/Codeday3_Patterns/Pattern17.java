package CodePractice.Codeday3_Patterns;

public class Pattern17 {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 5; i++) {
      for (int j = i; j <= 5; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }

      System.out.println();
      
    }
  }
}