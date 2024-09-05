package CodePractice.Codeday1;
import java.util.*;
public class Vote{
  static void isVote(int age){
    if(age>=18){
      System.out.println("Eligible for vote.");
    }else{
      System.out.println("Not Eligible for vote.");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Age");
    int a = sc.nextInt();
    Vote.isVote(a);
    sc.close();
  }
}