package CodePractice.Codeday7_Methods_NoReturnType;

public class LoanEligibility {

   public static void checkLoanEligibility(int creditScore, double monthlyIncome) {
      if ((creditScore >= 750 && monthlyIncome >= 3000) || (creditScore >= 650 && monthlyIncome >= 5000)
            || (creditScore >= 600 && monthlyIncome >= 7000)) {
         System.out.println("You are eligible for Loan.");
      } else {
         System.out.println("You are not eligible for Loan.");
      }
   }

   public static void main(String[] args) {
      int creditScore = Integer.parseInt(args[0]);
      double monthlyIncome = Double.parseDouble(args[1]);
      checkLoanEligibility(creditScore, monthlyIncome);
   }

}