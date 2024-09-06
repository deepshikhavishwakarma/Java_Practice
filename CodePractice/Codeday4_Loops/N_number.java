package CodePractice.Codeday4_Loops;

import java.util.*;

public class N_number {

  public static int printNumber(int num) {
    int m=1;
    while (m <= num) {
      System.out.print(m + " ");
      m++;
    }
    return num;
  }

  public static void main(String[] args) {
    System.out.println("How many numbers you want to Print: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    N_number.printNumber(n);
    sc.close();
  }
}