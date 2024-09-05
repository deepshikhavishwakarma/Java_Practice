package CodePractice.Codeday9_MethodsCalling;

public class CheckPrimeNumber {
  boolean checkPrime(int num) {
   //int count;
    int a=num;
    while(num!=0){
       if(a%10==0){
        
       }
         }
         return true;
  }

  public static void main(String[] args) {
    CheckPrimeNumber obj = new CheckPrimeNumber();
    int num = Integer.parseInt(args[0]);
    System.out.println(obj.checkPrime(num));
  }
}