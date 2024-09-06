package CodePractice.Codeday7_Methods_NoReturnType;

public class TemperatureStatus {

  public static void printTemperatureState(int temp) {

    if (temp <= 0) {
      System.out.println("Wheather is Freezing.");
    } else if (temp > 0 && temp <= 10) {
      System.out.println("Wheather is very Cold.");
    } else if (temp > 10 && temp <= 20) {
      System.out.println("Wheather is Cold.");
    } else if (temp > 20 && temp <= 30) {
      System.out.println("Wheather is Normal");
    } else if (temp > 30 && temp < 40) {
      System.out.println("Wheather is Hot.");
    } else {
      System.out.println("Wheather is very Hot.");
    }

  }

  public static void main(String[] args) {

    int temp = Integer.parseInt(args[0]);
    printTemperatureState(temp);

  }

}