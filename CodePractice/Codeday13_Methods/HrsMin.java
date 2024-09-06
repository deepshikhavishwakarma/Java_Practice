//WAP using suitable input stream to input hours and minutes,convert
//hours to minutes and minutes to hours.Display with suitable message.
package CodePractice.Codeday13_Methods;

public class HrsMin {
  static void HrsConvert(int hrs) {
    hrs = hrs * 60;
    System.out.println("Minuites is " + hrs);
  }

  static void MinConvert(int min) {
    min = min / 60;
    int rem = min % 60;
    System.out.println("Hour is " + min + ":" + rem);
  }

  public static void main(String[] args) {
    int hrs = Integer.parseInt(args[0]);
    int min = Integer.parseInt(args[1]);
    HrsConvert(hrs);
    MinConvert(min);
  }
}