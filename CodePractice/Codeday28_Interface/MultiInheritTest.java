package CodePractice.Codeday28_Interface;

interface MultiInherit1{
    public void m1();
    public void m2();

}
interface MultiInherit2 extends MultiInherit1{
    @Override
    public void m1();
    public void m2();

  }
interface MultiInherit3 extends MultiInherit2{
@Override
    public void m1();

}
class Multi implements MultiInherit3{
    @Override
    public void m1(){
        System.out.println("m1 Implemented");
    }
    @Override
    public void m2(){
        System.out.println("m2 Implemented");
    }
}
public class MultiInheritTest {
    public static void main(String[] args) {
        Multi mm = new Multi();
        mm.m1();
        mm.m2();
    }
}
