package CodePractice.Codeday5;


import java.util.*;

public class SpyNumber {
  static void isSpy(int num) {
    int n1 = num;
    int sum = 0, product = 1, rev;
    while (n1 != 0) {
      rev = n1 % 10;
      sum += rev;
      product *= rev;
      n1 /= 10;
    }
    // System.out.println(sum);
    // System.out.println(product);
    if (sum == product) {
      System.out.println(num + " is a spy number");
    } else {
      System.out.println(num + " is not a spy number");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int n = sc.nextInt();
    SpyNumber.isSpy(n);
    sc.close();
  }
}