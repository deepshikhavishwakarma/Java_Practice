package CodePractice.Codeday4_Loops;
import java.util.*;
public class Fibonacci{
  static void isFibo(int n){
    int k1 = 0,k2 = 1,sum = 0;
    for(int i=1;i<=n;i++){
      sum = k1+k2;
      System.out.print(k1+" ");
      k1 = k2;
      k2 = sum;
      
    }
  }
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    Fibonacci.isFibo(num);
    sc.close();
  }
}