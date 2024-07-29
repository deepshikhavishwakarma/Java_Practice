package CodePractice.Codeday6_Methods;

import java.util.*;

public class TriangleArea {

  public static void areaOfTriangle(double a, double b, double c) {
    // double a = 10.00;
    // double b = 15.00;
    // double c = 20.00;

    double s = (a + b + c) / 2;

    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    System.out.println("The Area of triangle is " + area);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st side of triangle: ");
    double num1 = sc.nextDouble();
    System.out.println("Enter 2nd side of triangle: ");
    double num2 = sc.nextDouble();
    System.out.println("Enter 3rd side of triangle: ");
    double num3 = sc.nextDouble();
    areaOfTriangle(num1, num2, num3);
    sc.close();

  }

}