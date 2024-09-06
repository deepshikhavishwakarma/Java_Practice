package CodePractice.Codeday9_MethodsCalling;

public class ClassA {

  String meth1(int a, int b) {// 4,8
    System.out.println(10);
    System.out.println((54 + a) - b);
    ClassA aobj = new ClassA();
    int value = aobj.meth5();// 20
    System.out.println(value);
    return "java";

  }

  int meth2(int a) {// 5
    System.out.println(75);
    int b = 5;
    System.out.println(b - a);
    return (5 * 5) - b;
  }

  void meth3() {
    System.out.println("Start");
    ClassA aobj = new ClassA();
    String msg = aobj.meth4();// java
    System.out.println(msg);
    System.out.println(40);
  }

  public String meth4() {
    System.out.println("Today is Thrusday");
    ClassA aobj = new ClassA();
    return aobj.meth1(4, 8);// java(rt)
  }

  public int meth5() {
    ClassA aobj = new ClassA();
    System.out.println(99);
    return aobj.meth2(5);// 20
  }

  public static void main(String[] args) {
    ClassA aobj = new ClassA();
    aobj.meth3();
  }
}
