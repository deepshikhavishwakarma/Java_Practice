package CodePractice.Codeday9_MethodsCalling;

public class ClassB {

  void meth1() {
    System.out.println(10);
    System.out.println(64);
    System.out.println("End");

  }

  int meth2(int a, int b, int c) {// 50 50 50
    ClassB bobj = new ClassB();
    bobj.meth5(100, "java is awesome");// java is awesome (rt)
    System.out.println(5);
    return a - b;
  }

  String meth3(String s, int b, int d)// ("Hii", 15, 10
  {
    System.out.println(b + d);
    return s;
  }

  int meth4(int c, int k)// 20 10
  {
    System.out.println(k);
    ClassB bobj = new ClassB();
    int result = bobj.meth2(50, 50, 50); // 0 (rt)
    System.out.println(result);
    return k + 10;
  }

  String meth5(int a, String c)// 100 java is awesome
  {
    System.out.println(a + a);
    ClassB bobj = new ClassB();
    bobj.meth3("Hii", 15, 10);// hi
    System.out.println(5);
    return c;
  }

  public static void main(String[] args) {
    ClassB bobj = new ClassB();
    System.out.println("Start");
    int result = bobj.meth4(20, 10);// 20
    System.out.println(result);
    bobj.meth1();
  }

}