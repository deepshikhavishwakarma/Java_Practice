package CodePractice.Codeday1;
import java.util.*;

public class EvenOdd{
  static void evenOdd(int n){
    if(n%2==0){
       System.out.println("Number "+n+" is Even.");
    }else{
      System.out.println("Number "+n+" is Odd.");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int num = sc.nextInt();
    EvenOdd.evenOdd(num);
    sc.close();
  }
}