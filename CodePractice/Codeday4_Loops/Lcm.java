package CodePractice.Codeday4_Loops;

import java.util.*;

public class Lcm {
  static void gcdLcm(int num1, int num2) {
    int i = 1, gcd = 0;
    while (i <= num1 && i <= num2) {
      if (num1 % i == 0 && num2 % i == 0) {
        gcd = i;

      }
      i++;

    }
    System.out.println("LCM is : " + (num1 * num2) / gcd);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number 1: ");
    int n1 = sc.nextInt();
    System.out.println("Enter Number 2: ");
    int n2 = sc.nextInt();
    Lcm.gcdLcm(n1, n2);
    sc.close();

  }
}