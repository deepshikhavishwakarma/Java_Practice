package CodePractice.Codeday4_Loops;
import java.util.*;
public class Table{
  static void multiTable(int n1,int n2){
    for(int i=1;i<=10;i++){
      for(int j=n1;j<=n2;j++){
        System.out.print(j+" * "+i+" = "+(i*j)+"\t");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1 :");
    int num1 = sc.nextInt();
    System.out.println("Enter number 2 :");
    int num2 = sc.nextInt();
    Table.multiTable(num1,num2);
    sc.close();
  }
}