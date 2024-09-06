package CodePractice.Codeday18_Methods;

public class LabTask3 {
    public static void main(String[] args) {
    Sample2 s1 = new Sample2();
    System.out.println("x :" + s1.x + ", " + "y :" + s1.y);//0 0
    System.out.println();
    s1.modify(s1);
    System.out.println();
    System.out.println("x :" + s1.x + ", " + "y :" + s1.y);//55 66
  }
}
class Sample2 {
  int x;
  int y;
    public void modify(Sample2 s) {//s1->1010  x=0  y=0
    x = 11;
    s.y = 21;
    System.out.println("x :" + x + ", " + "y :" + y);//11 21
    System.out.println("x :" + s.x + ", " + "y :" + s.y);//11 21
    s = new Sample2();
    s.x = 55;
    s.y = 66;
    System.out.println("x :" + x + ", " + "y :" + y);//11 21
    System.out.println("x :" + s.x + ", " + "y :" + s.y);//55 66
  }
}

