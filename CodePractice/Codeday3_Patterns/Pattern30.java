 //       1                  
 //     1 2 1
 //   1 2 3 2 1
 // 1 2 3 4 3 2 1
package CodePractice.Codeday3_Patterns;

public class Pattern30{
  public static void main(String[] args){

      // int a =0 ;
    for(int i=1;i<=5;i++){
      // int a=i;
       for(int k=5;k>=i;k--){
         System.out.print("  ");        //space
       }

      for(int j=1;j<=i;j++){
         System.out.print(j+" ");
      }
      for(int k=i-1;k>=1;k--){
        System.out.print(k+" ");
      }

       System.out.println();
    }


   

  }
}