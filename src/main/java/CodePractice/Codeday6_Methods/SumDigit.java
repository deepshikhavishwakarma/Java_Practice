package CodePractice.Codeday6_Methods;

import java.util.*;

public class SumDigit {

  public static void numberSum(int n) {
    int rem, sum = 0;
    while (n != 0) {
      rem = n % 10;
      sum += rem;
      n /= 10;
    }

    System.out.println("The Sum is " + sum);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num = sc.nextInt();
    numberSum(num);
    sc.close();

  }

}