package CodePractice.Codeday14_Methods;

public class CalculatePower {
  public static void main(String[] args) {
    int number = Integer.parseInt(args[0]);
    int exponent = Integer.parseInt(args[1]);
    double power = Math.pow(number, exponent);
    System.out.println(exponent + " power of" + number + " is: " + power);
  }
}