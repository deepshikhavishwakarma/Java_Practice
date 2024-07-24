//         1  
//       1  1  
//     1  2  1  
//   1  3  3  1  
// 1  4  6  4  1 
package CodePractice.Codeday3_Patterns;
public class Pattern26{
  public static void main(String[] args){

int a ;
    for(int i=1;i<=5;i++){
 a=1;
       for(int k=5;k>=i;k--){
         System.out.print("  ");        //space
       }
     
      for(int j=1;j<=i;j++){

        System.out.print(a+"  ");
       a=a*(i-j)/j;

      }
   
       System.out.println();
    }

  }
}