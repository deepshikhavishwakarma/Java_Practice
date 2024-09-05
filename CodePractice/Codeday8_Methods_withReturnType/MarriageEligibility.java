package CodePractice.Codeday8_Methods_withReturnType;

public class MarriageEligibility {

  public static String determineAndPrintEligibility(char gender, int age) {
    String msg = "";
    if (((gender == 'F' || gender == 'f') && age >= 18) || ((gender == 'M' || gender == 'm') && age >= 21)) {
      msg = "you are eligible for Marriage";
      return msg;
    } else {
      msg = "you are not eligible for Marriage";
      return msg;
    }
  }

  public static void main(String[] args) {
    char gender = args[0].charAt(0);
    int age = Integer.parseInt(args[1]);
    System.out.println(determineAndPrintEligibility(gender, age));

  }

}