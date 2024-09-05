package CodePractice.Codeday14_Methods;

public class TestHarsadNumber {
  public static void main(String[] args) {
    HarsadNumber.checkHarsad(200);
  }
}

class HarsadNumber {
  public static int getSum(int num) {
    int sum = 0, rem;
    while (num != 0) {
      rem = num % 10;
      sum += rem;
      num /= 10;
    }
    System.out.println(sum);
    return sum;
  }

  public static void checkHarsad(int num) {
    int sum = getSum(num);
    if (num % sum == 0) {
      System.out.println(num + " is a Harshad Number.");
    } else {
      System.out.println(num + " is not a Harshad Number.");
    }
  }
}
