//   1
//   0 1
//   1 0 1
//   0 1 0 1
//   1 0 1 0 1
package CodePractice.Codeday3_Patterns;
public class Pattern32{
  public static void main(String[] args){
    int n=5;

    for(int i=1;i<=n;i++){


      for(int j=0;j<i;j++){
       
        System.out.print(((i+j)%2)+"  ");

      }

       System.out.println();
    }

  }
}