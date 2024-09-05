
package CodePractice.Codeday1;
import java.util.*;

public class LargestNum{
  static void isLarge(int n1,int n2){
    if(n1>n2){
       System.out.println("First number "+n1+" is big");
    }else{
      System.out.println("Second number "+n2+" is big");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number: ");
    int num1 = sc.nextInt();
    System.out.println("Enter your Second number: ");
     int num2 = sc.nextInt();
    LargestNum.isLarge(num1,num2);
    sc.close();
  }
}