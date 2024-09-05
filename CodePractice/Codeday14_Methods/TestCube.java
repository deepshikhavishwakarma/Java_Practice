package CodePractice.Codeday14_Methods;

public class TestCube {

  public static void main(String[] args) {
    CheckCube.checkCube(18);
  }
}

class CheckCube {
  public static int getNum(int num) {
    for (int i = 2; i <= num; i++) {
      int cube = i * i * i;

      if (cube == num) {
        int n = i;
        return n;
      }
    }
    return 0;
  }

  public static void checkCube(int num) {
    int num1 = num;
    num = getNum(num);
    if (num != 0) {
      System.out.println("The Number is a cube of " + num);
    } else {
      System.out.println("There is no cube of " + num1);
    }
  }
}