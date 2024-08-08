package CodePractice.Codeday13_Methods;

public class TriangleType {
  static String findTriangle(int n1, int n2, int n3) {
    if (n1 == 0 && n2 == 0 && n3 == 0) {
      return "-1";
    } else if (n1 < 0 && n2 < 0 && n3 < 0) {
      return "-2";
    } else if (n1 + n2 < n3 || n1 + n3 < n2 || n2 + n3 < n1) {
      return "-3";
    } else if (n1 == n2 && n1 == n3) {
      return "EQUILATERAL";
    } else if ((n1 == n2 && n1 + n2 > n3) || (n1 == n3 && n1 + n3 > n2) || (n2 == n3 && n2 + n3 > n1)) {
      return "ISOSCELES";
    } else {
      return "SCALENE";
    }
  }

  public static void main(String[] args) {
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    int n3 = Integer.parseInt(args[2]);
    System.out.println(findTriangle(n1, n2, n3));
  }
}