package CodePractice.Codeday1;
import java.util.*;
public class PositNeg{
  static void ispositiveNeg(int num){
    if(num>0){
      System.out.println("Number is Positive.");
    }else{
       System.out.println("Number is Negative.");
    }
  }
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int n = sc.nextInt(); 
    PositNeg.ispositiveNeg(n);
    sc.close();
  }
}