package CodePractice.Codeday3;

public class EvenOdd {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    if (num % 2 == 0) {
      System.out.println("Number is Even : " + num);
    } else {
      System.out.println("Number is Odd : " + num);
    }
  }
}