package CodePractice.Codeday13_Methods;

public class CheckUppLowChar {

  static void checkAlpha(char alphabet) {
    if (alphabet >= 'A' && alphabet <= 'Z') {
      System.out.println("It is  Uppercase");
    } else if (alphabet >= 'a' && alphabet <= 'z') {
      System.out.println("It is  Lowercase");
    } else {
      System.out.println("It is not an Alphabet.");
    }
  }

  public static void main(String[] args) {
    char alphabet = args[0].charAt(0);
    checkAlpha(alphabet);
  }
}