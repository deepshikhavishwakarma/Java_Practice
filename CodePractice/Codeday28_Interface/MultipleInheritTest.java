package CodePractice.Codeday28_Interface;

interface A{
    public void m1();
}
interface B{
    public void m1();
}
interface C{
    public void m1();
}
interface D{
    public void m1();
}
class MultipleInherit implements A,B,C,D{
    public void m1(){
        System.out.println("M1 implemented");
    }
//    public void m2(){
//        System.out.println("M1 implemented");
//    }
//    public void m3(){
//        System.out.println("M1 implemented");
//    } public void m4(){
//        System.out.println("M1 implemented");
//    }

}

public class MultipleInheritTest {
    public static void main(String[] args) {
      MultipleInherit mm = new MultipleInherit();
      mm.m1();
    }
}
