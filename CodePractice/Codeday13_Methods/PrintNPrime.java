package CodePractice.Codeday13_Methods;

public class PrintNPrime {
  String getPrimeNumbers(int num1, int num2) {// 1 20

    String s = "";
    int sum = 0;
    for (int i = num1; i < num2; i++) {
      int count = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          count++;
        }
      }
      if (count == 2) {
        s += i + " ";
        sum += i;
      }

    }
    System.out.println(sum);

    return s;
  }

  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    PrintNPrime p1 = new PrintNPrime();
    System.out.println(p1.getPrimeNumbers(num1, num2));
  }
}