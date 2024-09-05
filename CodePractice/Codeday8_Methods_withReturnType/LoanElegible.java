package CodePractice.Codeday8_Methods_withReturnType;

public class LoanElegible {

  public static String checkLoanEligibility(int creditScore, double monthlyIncome) {
    String msg = "";
    if ((creditScore >= 750 && monthlyIncome >= 3000) || (creditScore >= 650 && monthlyIncome >= 5000)
        || (creditScore >= 600 && monthlyIncome >= 7000)) {
      msg = "you are eligible for loan";
      return msg;
    } else {
      msg = "you are not eligible for loan";
      return msg;
    }
  }

  public static void main(String[] args) {
    int creditScore = Integer.parseInt(args[0]);
    double monthlyIncome = Double.parseDouble(args[1]);
    System.out.println(checkLoanEligibility(creditScore, monthlyIncome));

  }

}