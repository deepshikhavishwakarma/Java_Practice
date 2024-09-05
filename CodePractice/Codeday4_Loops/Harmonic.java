package CodePractice.Codeday4_Loops;

public class Harmonic {
  public static void main(String[] args) {
    double s = 1;
    int n = 5;
    System.out.print("1+");
    for (int i = 1; i <= n; i++) {
      s = s + 1.0 / i;
      System.out.print("1/" + i + "+");
    }
    System.out.printf("\b=%.2f", s);// in printf we can also print the value using format specifier.
  }
}