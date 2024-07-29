package CodePractice.Codeday6_Methods;

import java.util.*;

public class Average {

  public static void findAverage(float n1, float n2, float n3) {
    // float n1 = 25.0f;
    // float n2 = 45.0f;
    // float n3 = 65.0f;
    float avg = (n1 + n2 + n3) / 3;

    System.out.println("The Average value is " + avg);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers");
    float num1 = sc.nextFloat();
    float num2 = sc.nextFloat();
    float num3 = sc.nextFloat();
    findAverage(num1, num2, num3);
    sc.close();

  }

}