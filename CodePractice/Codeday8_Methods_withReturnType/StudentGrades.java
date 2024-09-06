package CodePractice.Codeday8_Methods_withReturnType;

public class StudentGrades {

   public static char findGrade(double marks) {

      if (marks > 80 && marks <= 90) {
         return 'A';
      } else if (marks > 60 && marks <= 80) {
         return 'B';
      } else if (marks > 50 && marks <= 60) {
         return 'C';
      } else {
         return 'D';
      }
   }

   public static void main(String[] args) {
      double marks = Double.parseDouble(args[0]);

      System.out.println(findGrade(marks));

   }

}