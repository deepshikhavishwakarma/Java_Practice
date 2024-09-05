package CodePractice.Codeday13_Methods;

public class PrintEven {
  String getEvenNumbers(int num1, int num2) {
    if (num1 < 0 && num2 < 0) {
      return "-1";
    } else if (num1 == num2 && num1 == 0 && num2 == 0) {
      return "-2";
    } else {
      int n1 = Math.min(num1, num2);
      int n2 = Math.max(num1, num2);
      for (int i = n1; i <= n2; i++) {
        if (i % 2 == 0) {
          System.out.print(i + " ");
        }
      }
      return " ";
    }
  }

  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    PrintEven obj = new PrintEven();
    System.out.println(obj.getEvenNumbers(num1, num2));
  }
}