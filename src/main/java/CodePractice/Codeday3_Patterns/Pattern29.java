//      1
//    3 2 1
//   5 4 3 2 1
//  7 6 5 4 3 2 1
package CodePractice.Codeday3_Patterns;
public class Pattern29{
  public static void main(String[] args){

int a = 1;
    for(int i=1;i<=5;i++){
      
       for(int k=5;k>=i;k--){
         System.out.print("  ");        //space
       }
      int b=a;
      for(int j=1;j<=(i*2-1);j++){

        System.out.print(b-- +"  ");
        

      }
      a+=2;
       System.out.println();
    }

  }
}