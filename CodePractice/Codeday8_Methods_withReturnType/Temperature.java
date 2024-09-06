package CodePractice.Codeday8_Methods_withReturnType;

public class Temperature {

  public static String printTemperatureState(int temp) {
    String msg = "";
    if (temp < 0) {
      msg = "Freezing weather";
      return msg;
    } else if (temp > 0 && temp <= 10) {
      msg = "Very Cold weather";
      return msg;
    } else if (temp > 10 && temp <= 20) {
      msg = "Cold weather";
      return msg;
    } else if (temp > 20 && temp <= 30) {
      msg = "Normal in Temp";
      return msg;
    } else if (temp > 30 && temp < 40) {
      msg = "Its Hot";
      return msg;
    } else {
      msg = "Its Very Hot";
      return msg;
    }
  }

  public static void main(String[] args) {
    int temp = Integer.parseInt(args[0]);
    System.out.println(printTemperatureState(temp));

  }

}