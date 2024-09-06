package CodePractice.Codeday14_Methods;

public class TesthammingNumber {
  public static void main(String[] args) {

  }
}

class HammingNumber {
  public static boolean isPrime(int num) {
    
    for(int i=2;i<num/2;i++){
      if(num%i==0){
        return true;
      }
    }
    return false;
  }

  public static void checkHamming() {
  //  int n =0;
  //  int count=1;
    // while(){
      
    // }
  }
}