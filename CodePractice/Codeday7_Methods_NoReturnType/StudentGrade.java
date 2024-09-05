package CodePractice.Codeday7_Methods_NoReturnType;

public class StudentGrade {

      public static void findGrade(String name, int marks) {

            if (marks >= 80 && marks <= 100) {
                  System.out.println("\nName : " + name + "\n" + "Marks :" + marks + "\nGrade A+");
            } else if (marks >= 60 && marks <= 80) {
                  System.out.println("\nName : " + name + "\n" + "Marks :" + marks + "\nGrade A");
            } else if (marks >= 50 && marks <= 60) {
                  System.out.println("\nName : " + name + "\n" + "Marks :" + marks + "\nGrade B");
            } else {
                  System.out.println("\nName : " + name + "\n" + "Marks :" + marks + "\nGrade C");
            }

      }

      public static void main(String[] args) {
            String name = args[0];
            int marks = Integer.parseInt(args[1]);
            findGrade(name, marks);

      }

}