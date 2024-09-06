  // 1
  // 12        1
  // 123       21
  // 1234      321
  // 12345     4321

package CodePractice.Codeday3_Patterns;
public class Pattern25{
  public static void main(String[] args){


    for(int i=1;i<=5;i++){
       //  int a=i;
      for(int j=1;j<=i;j++){
         System.out.print(j+" ");
      }
          for (int j = i-1; j >= 1; j--) {
            System.out.print(j + " ");
          }
       System.out.println();
    }

  }
}