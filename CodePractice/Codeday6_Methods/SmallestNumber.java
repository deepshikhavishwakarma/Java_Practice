package CodePractice.Codeday6_Methods;

import java.util.*;

public class SmallestNumber {
  public static void findSmallest(int a, int b, int c) {
    if (a < b && a < c) {
      System.out.println("The Smallest value is " + a);
    } else if (b < a && b < c) {
      System.out.println("The Smallest value is " + b);
    } else if (a == b && a == c) {
      System.out.println("All are equal.");
    } else {
      System.out.println("The Smallest value is " + c);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    findSmallest(num1, num2, num3);
    sc.close();

  }

}