package CodePractice.Codeday1;
import java.util.*;
public class Circle{
  static void circleArea(float radius){
    float area = 3.14f*radius*radius;
    System.out.println("Circle Area is: "+area);
  }
  void circleCircum(float radius){
    float circum = 2*3.14f*radius;
    System.out.println("Circle Circumference is: "+circum);
  }
  public static void main(String[] args){
    Circle cl = new Circle();
    //float radi = 3.7f;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius: ");
    float radi  = sc.nextFloat();
    Circle.circleArea(radi);
    cl.circleCircum(radi);
    sc.close();
  }
}