package CodePractice.Codeday7_Methods_NoReturnType;

public class VotingEligibility {

     public static void determineAndPrintEligibility(char gender, int age) {
          if (((gender == 'F' || gender == 'f') && age >= 18) || ((gender == 'M' || gender == 'm') && age >= 21)) {
               System.out.println("You are eligible for Vote.");
          } else {
               System.out.println("You are not eligible for Vote.");
          }
     }

     public static void main(String[] args) {
          char gender = args[0].charAt(0);
          int age = Integer.parseInt(args[1]);
          determineAndPrintEligibility(gender, age);
     }

}