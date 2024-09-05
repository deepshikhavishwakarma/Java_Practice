package CodePractice.Codeday15_Methods;

import java.util.*;

public class TestStudentGrade {
  public static void main(String[] args) {
   Student s1 = new Student();
    s1.setStudentData();
  }
}

class Student {
  private int studentId;
  private String studentName;
  private int marks;
  private char grade;

  public void setStudentData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student ID    ");
    studentId = sc.nextInt();
    System.out.println("Enter Student Name  ");
    studentName = sc.next();
    System.out.println("Enter Student Marks ");
    marks = sc.nextInt();
    calculateGrade(studentId, studentName, marks, grade);
    sc.close();
  }

  public void calculateGrade(int studentId, String studentName, int marks, char grade) {
    if (marks > 90) {
      grade = 'A';
    } else if (marks >= 81 && marks <= 90) {
      grade = 'B';
    } else if (marks >= 71 && marks <= 80) {
      grade = 'C';
    } else if (marks >= 61 && marks <= 70) {
      grade = 'D';
    } else {
      grade = 'E';
    }
    displayDetails(studentId, studentName, marks, grade);
  }

  public void displayDetails(int studentId, String studentName, int marks, char grade) {
    System.out.println("Student ID            " + studentId);
    System.out.println("Student Name          " + studentName);
    System.out.println("Student Marks         " + marks);
    System.out.println("Student Grade         " + grade);
  }
}