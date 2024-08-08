package CodePractice.Codeday13_Methods;

public class PrimeSum {
  static int getPrimeSum(int n) {
    int count, sum = 0,k=0;
    for (int i = 1; ; i++) {
      count = 0;
      for (int j = 1; j <= i; j++) {
        // count1 = 0;
        if (i % j == 0) {
          count++;
        }

      }
      if (count == 2) {
        sum += i;
        k++;
      }
      if (k == n) {
        
        break;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.println(getPrimeSum(n));
  }
}