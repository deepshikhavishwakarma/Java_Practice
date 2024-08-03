package CodePractice.Codeday10_Methods;

public class CBSEResult_In {
  public void acceptDetailAndSubmit(String studentName, long rollNo, String schoolRegNo, String schoolName, char gender,
      String citizenShip, String board) {
    // int math,sc,eng,sosc,phy;
    CBSEResult_In obj = new CBSEResult_In();
    if ((schoolRegNo.equals("CBSE01-100")) && (citizenShip.equals("INDIA")) && (board.equals("CBSE"))) {
      int math = 90, sc = 85, eng = 50, sosc = 90, phy = 100;
      char grade = obj.calculateGrade(math, sc, eng, sosc, phy);
      DisplayDetails(studentName, rollNo, schoolRegNo, schoolName, gender, citizenShip, board, math, sc, eng, sosc, phy,
          grade);
    } else {
      System.out.println("The form submission not accepted");
    }

  }

  public char calculateGrade(int math, int sc, int eng, int sosc, int phy) {
    int avg = (math + sc + eng + sosc + phy) / 5;
    char grade;
    if (avg > 80 && avg <= 100) {
      grade = 'A';
    } else if (avg > 60 && avg <= 80) {
      grade = 'B';
    } else if (avg > 40 && avg <= 60) {
      grade = 'C';
    } else {
      grade = 'F';
    }
    return grade;
  }

  static void DisplayDetails(String studentName, long rollNo, String schoolRegNo, String schoolName, char gender,
      String citizenShip, String board, int math, int sc, int eng, int sosc, int phy, char grade) {

    System.out.println("\n\nThe name of student :" + studentName);
    System.out.println("The rollNo :" + rollNo);
    System.out.println("The schoolRegNo  :" + schoolRegNo);
    System.out.println("The SchoolName :" + schoolName);
    System.out.println("Gender :" + gender);
    System.out.println("Citizenship :" + citizenShip);
    System.out.println("Board :" + board);
    System.out.println("_____________________________________________");
    System.out.println("====================Marks====================\n");

    System.out.println("            Math          ||  " + math);
    System.out.println("            Science       ||  " + sc);
    System.out.println("            English       ||  " + eng);
    System.out.println("            SocialScience ||  " + sosc);
    System.out.println("            PHE           ||  " + phy);
    System.out.println("=============================================");
    System.out.println("=============GRADE===========================\n");
    System.out.println("THE TOTAL MARKS AS GRADE IS " + grade);

  }

  public static void main(String[] args) {
    CBSEResult_In obj = new CBSEResult_In();
    obj.acceptDetailAndSubmit("Deepshikha", 3452633, "CBSE01-100", "svm", 'F', "INDIA", "CBSE");
  }
}
