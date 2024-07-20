public class SimpleInterest{
  void SI(int princi,int rate,int time){
    int si = (princi*rate*time)/100;
    System.out.println("Simple Interest is: "+si);
  }
  public static void main(String[] args){
    SimpleInterest sc = new SimpleInterest();
    sc.SI(14000,2,2);
  }
}