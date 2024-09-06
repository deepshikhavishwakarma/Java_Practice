package CodePractice.Codeday4_Loops;
import java.util.*;
public class SumDigit{
  static void sumDigi(int num){//12345
    int sum = 0,count=0;
    while(num!=0){
    int rem = num%10;
      sum+=rem;
      count++;
      num/=10;
      
      }
    System.out.println("No of digit -"+count+"\n"+"Sum of digit - "+sum);
    
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int n = sc.nextInt();
    SumDigit.sumDigi(n);
    sc.close();
  }
}