package CodePractice.Codeday28_Interface;

interface HierarchiMain{
    public void m1();
    public void m2();
}
interface Hierarchi1 extends HierarchiMain{
    @Override
    public void m1();
}
interface Hierarchi2 extends HierarchiMain{
    @Override
    public void m2();
}
class Hierarchi implements Hierarchi1,Hierarchi2{
    @Override
    public void m1(){
        System.out.println("M1 Implemented");
    }
    @Override
    public void m2(){
        System.out.println("M2 Implemented");
    }
}

public class HierarchicalTest {
    public static void main(String[] args) {
       Hierarchi hm = new Hierarchi();
       hm.m1();
       hm.m2();
    }
}
