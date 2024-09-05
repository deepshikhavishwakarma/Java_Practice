package CodePractice.Codeday28_Interface;


interface SingleInherit1{
   public void m1();
}
//interface SingleInherit2 extends SingleInherit1{
//
//}
class Inherit implements SingleInherit1{
    @Override
    public void m1(){
        System.out.println("Method implemented.");
    }
}
public class SingleInheritTest {
    public static void main(String[] args){
        Inherit in = new Inherit();
        in.m1();
    }
}
