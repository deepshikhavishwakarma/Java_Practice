package CodePractice.Codeday3_Patterns;

public class Pattern27 {
  public static void main(String[] args) {
    int a = 1;
    for (int i = 1; i <= 5; i++) {
    
      for (int j = i; j <= 5; j++) {

        System.out.print(a++ + "  ");
       
      }
      System.out.println();
    }
  }
}