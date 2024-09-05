package CodePractice.Codeday1;
import java.util.*;

public class SimpleInterest {
  void SI(int princi, int rate, int time) {
    int si = (princi * rate * time) / 100;
    System.out.println("Simple Interest is: " + si);
  }

  public static void main(String[] args) {
    SimpleInterest nc = new SimpleInterest();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Principle Amount: ");
    int p = sc.nextInt();
    System.out.println("Enter rate: ");
    int r = sc.nextInt();
    System.out.println("Enter Time: ");
    int t = sc.nextInt();
    nc.SI(p, r, t);
    sc.close();
  }
}