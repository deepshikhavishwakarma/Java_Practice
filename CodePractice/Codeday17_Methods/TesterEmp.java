package CodePractice.Codeday17_Methods;
import java.util.*;
public class TesterEmp{
  public static void main(String[] args){
    Employee e1 = new Employee();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Employee First Name:");
    String fname = sc.next();
    System.out.print("Enter Employee Last Name:");
    String lname = sc.next();
    System.out.print("Enter Employee ID:");
    int id = sc.nextInt();
    System.out.print("Enter Employee Salary:");
    double sal = sc.nextDouble();
    System.out.print("Enter Employee completed Projects :");
    int nProject = sc.nextInt();
    e1.setEmployeeData(fname,lname,id,sal,nProject);
    sc.close();
  }
}
class Employee{
  private String firstName;
  private String lastName;
  private int employeeId;
  private double salary;
  private int noOfProject;

  public void setEmployeeData(String fname,String lname,int id,double sal,int nProject){
    firstName = fname;
    lastName = lname;
    employeeId = id;
    salary = sal;
    noOfProject = nProject;
    calculateSalary();
   }
  public void calculateSalary(){
    if(noOfProject >5 && noOfProject<10){
      salary+=5000;
      display();
    }else if(noOfProject >10 && noOfProject<20){
        salary+=10000;
      display();
      }else{
      salary+=15000;
      display();
      }
  }

  public void display(){
    System.out.println("Employee First name:        "+firstName);
    System.out.println("Employee Last name:         "+lastName);
    System.out.println("Employee ID:                "+employeeId);
    System.out.println("Employee salary:            "+salary);
    System.out.println("Employee Project completed: "+noOfProject);
  }
  
}

