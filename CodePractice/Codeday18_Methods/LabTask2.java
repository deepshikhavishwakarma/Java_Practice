package CodePractice.Codeday18_Methods;

public class LabTask2 {
    public static void main(String[] args) {
    Sample1 s1 = new Sample1();
    Sample1 s2 = new Sample1();
    System.out.println("x :" + s1.x + ", " + "y :" + s1.y);//0 0
    System.out.println("x :" + s2.x + ", " + "y :" + s2.y);// 0 0
    s1.modify(s1);
    System.out.println();
    System.out.println("x :" + s1.x + ", " + "y :" + s1.y);//5 5
    System.out.println("x :" + s2.x + ", " + "y :" + s2.y);// 0 0

    s1.modify(s2);
    System.out.println();
    System.out.println("x :" + s1.x + ", " + "y :" + s1.y);//5 5
    System.out.println("x :" + s2.x + ", " + "y :" + s2.y);//0 10
  }
}
class Sample1 {
  int x;
  int y;
      public void modify(Sample1 s) {//1010
       x = s.x + 5;//5
       s.y = y + 5;//5
  }
}

