package CodePractice.Codeday21_Methods;

import java.util.Scanner;

public class Circle {
    public void radius(float radius){
        System.out.println("Circle radius is           "+radius);
        System.out.println("Circle Diameter is         "+2*radius);
        System.out.println("Circumference of circle is "+(2*3.14*radius));
        System.out.println("Area of circle is          "+(3.14*radius*radius));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius  ");
        float radius = sc.nextFloat();
        Circle c1 = new Circle();
        c1.radius(radius);
    }
}
