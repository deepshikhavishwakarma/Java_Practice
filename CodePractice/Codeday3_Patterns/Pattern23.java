  package CodePractice.Codeday3_Patterns;
public class Pattern23{
  public static void main(String[] args){
   
    
    for(int i=1;i<=5;i++){
         int n1 = 0, n2 = 1,sum =0;
      for(int j=1;j<=i;j++){
        sum = n1+n2;
        System.out.print(n1+" ");
      
      n1 = n2;
      n2 = sum;
      }
       System.out.println();
    }
   
  }
}