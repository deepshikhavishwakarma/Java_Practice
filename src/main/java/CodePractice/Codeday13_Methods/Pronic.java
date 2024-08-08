package CodePractice.Codeday13_Methods;
public class Pronic {
  public static boolean isPronicNumber(int num) {
    for (int i = 0; i <= num; i++) {
      if (i * (i + 1) == num) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    System.out.println("Pronic Number " + isPronicNumber(num));
  }
}