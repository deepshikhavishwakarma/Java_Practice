package CodePractice.Codeday5;

import java.util.*;

public class Automorphic {
  
  static void isAutomorp(int num) {
    int n1 = num;// 25
    int sq = n1 * n1;// 625

    while (n1 != 0) {
      if (sq % 10 != n1 % 10) {
        System.out.println(num + " is not an Automorphic number");
        return;
      }

      sq /= 10;
      n1 /= 10;
    }
    System.out.println(num + " is an Automorphic number");

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int n = sc.nextInt();
    Automorphic.isAutomorp(n);
    sc.close();
  }
}