 // 1   2  3
 // 6   5  4
 // 7   8  9
 // 12 11 10
 // 13 14 15
package CodePractice.Codeday3_Patterns;
public class Pattern22{
  public static void main(String[] args){
    int a=1;
    for(int i=1;i<=5;i++){
      for(int j=1;j<=3;j++){
        if(i%2==0){
           System.out.print(--a +" ");
        }else{
           System.out.print(a++ +" ");
        }
       
      }
      a+=3;
      System.out.println();
    }
  }
}