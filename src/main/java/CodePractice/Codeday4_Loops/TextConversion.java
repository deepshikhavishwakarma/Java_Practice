package CodePractice.Codeday4_Loops;

import java.util.*;

public class TextConversion {

  static void textConvert(int num) // 476
  {
    int rem;
    int n = 100;
    while (n != 0) {
      rem = num / n;// 6/1

      // s = s * 10 + rem;

      switch (rem) {
        case 0:
          System.out.print("Zero ");
          break;
        case 1:
          System.out.print("One ");
          break;
        case 2:
          System.out.print("Two ");
          break;
        case 3:
          System.out.print("Three ");
          break;
        case 4:
          System.out.print("Four ");
          break;
        case 5:
          System.out.print("Five ");
          break;
        case 6:
          System.out.print("Six  ");
          break;
        case 7:
          System.out.print("Seven ");
          break;
        case 8:
          System.out.print("Eight");
          break;
        case 9:
          System.out.print("Nine ");
          break;
        case 10:
          System.out.print("Ten ");
          break;
        case 11:
          System.out.print("Eleven ");
          break;
        case 12:
          System.out.print("Twelve ");

      }
      num = num % n;// 6
      n = n / 10;// 10
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number");
    int n = sc.nextInt();
    TextConversion.textConvert(n);
    sc.close();
  }
}