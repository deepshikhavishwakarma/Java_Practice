package CodePractice.Codeday18_Methods;

// public class LabTask {
//     public static void main(String[] args) {
//     Sample s1 = new Sample();//s1-> 1010
//     System.out.println("x :" + s1.x + ", " + "y :" + s1.y);//0 0
//     System.out.println();
//     s1.modify(s1);
//     System.out.println();
//     System.out.println("x :" + s1.x + ", " + "y :" + s1.y);//11 21
//   }
// }
// class Sample {
//   int x;
//   int y;
//     public void modify(Sample s) {
//     System.out.println("x :" + x + ", " + "y :" + y);//0 0
//     this.x  = 11;
//     this.y  = 21;
//     System.out.println("x :" + s.x + ", " + "y :" + s.y);//11 21
//   }
// }

public class LabTask {
    public static void main(String[] args) {
    Sample s1 = new Sample(); //s1->1010
    System.out.println("x :" + s1.x + ", " + "y :" + s1.y);//0 0
    System.out.println();
    s1.modify(s1);
    System.out.println();
    System.out.println("x :" + s1.x + ", " + "y :" + s1.y);//11 21
  }
}
class Sample {
  int x;
  int y;
    public void modify(Sample s) {// 1010
    System.out.println("x :" + x + ", " + "y :" + y);//0 0 
    this.x  = 11;
    this.y  = 21;
    System.out.println("x :" + s.x + ", " + "y :" + s.y);//11 21
  }
}

