package CodePractice.Codeday13_Methods;

public class CheckPerfectAbundant {
  public static String getAbundantNumber(int start, int end) {
    int sum;
    String s = "";
    for (int i = start; i < end; i++) {
      sum = checkNum(i);
      if (sum > i) {
        s += i + " ";
      }
    }
    return s;

  }

  public static String getPerfectNumber(int start, int end) {

    int sum;
    String s = "";
    for (int i = start; i <= end; i++) {
      sum = checkNum(i);
      if (sum == i) {
        s += i + "  ";
      }
    }
    return s;
  }

  static int checkNum(int i) {
    int t = i;
    int sum = 0;

    for (int j = 1; j <= t / 2; j++) {
      if (t % j == 0) {
        sum += j;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int start = Integer.parseInt(args[0]);
    int end = Integer.parseInt(args[1]);
    System.out.println(getAbundantNumber(start, end));
    System.out.println(getPerfectNumber(start, end));
  }
}