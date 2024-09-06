package CodePractice.Codeday13_Methods;

public class CheckCase {
  static void convertAlpha(char ch) {
    if (ch >= 'A' && ch <= 'Z') {
      // ch = ch.toLower();
      ch = (char) (ch + 32);
      System.out.println(ch);
    } else if (ch >= 'a' && ch <= 'z') {
      // ch = ch.toLower();
      ch = (char) (ch - 32);
      System.out.println(ch);
    } else {
      System.out.println("Not a Character.");
    }
  }

  public static void main(String[] args) {
    char ch = args[0].charAt(0);
    convertAlpha(ch);
  }
}