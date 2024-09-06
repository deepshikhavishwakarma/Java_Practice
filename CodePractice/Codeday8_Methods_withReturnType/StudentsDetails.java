package CodePractice.Codeday8_Methods_withReturnType;

public class StudentsDetails {

  public static double printStudentDetails(int physics, int chemistry) {
    System.out.println("Total marks : " + (physics + chemistry));
    return (physics + chemistry) / 2;

  }

  public static void main(String[] args) {

    String name = args[0];
    long rollNo = Long.parseLong(args[1]);
    int physics = Integer.parseInt(args[2]);
    int chemistry = Integer.parseInt(args[3]);
    System.out.println("Name :" + name + "\nRoll No : " + rollNo + "\n---------------------\n" + "Physics Marks : "
        + physics + "\nChemistry Marks: " + chemistry);
    double result = printStudentDetails(physics, chemistry);
    System.out.println("result=" + result);
    System.out.println("Average is: " + printStudentDetails(physics, chemistry));
  }
}