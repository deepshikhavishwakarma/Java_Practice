package CodePractice.Codeday19_getter_Setter;

public class EmployeeTester {
  public static void main(String[] args) {
    Employee obj = new Employee();
    obj.setEmployeeName("Deepshikha");
    obj.setDepartment("Engineering");
    obj.setBaseSalary(34000);
    obj.setPerformanceScore(4);
    double bonus = obj.calculateBonus();
    System.out.println("Employee Name  " + obj.getEmployeeName());
    System.out.println("Department     " + obj.getDepartment());
    System.out.println("Base Salary    " + obj.getBaseSalary());
    System.out.println("Performance    " + obj.getPerformanceScore());
    System.out.println("Bonus          " + bonus);
    System.out.println("Total Salary   " + (bonus + obj.getBaseSalary()));

  }
}

class Employee {
  private String employeeName;
  private String department;
  private double baseSalary;
  private int performanceScore;

  public void setEmployeeName(String name) {
    this.employeeName = name;
  }

  public void setDepartment(String dept) {
    this.department = dept;
  }

  public void setBaseSalary(double baseSal) {
    this.baseSalary = baseSal;
  }

  public void setPerformanceScore(int perform) {
    this.performanceScore = perform;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public String getDepartment() {
    return department;
  }

  public double getBaseSalary() {
    return baseSalary;
  }

  public int getPerformanceScore() {
    return performanceScore;
  }

  public double calculateBonus() {
    double bonus = 0;
    if (performanceScore >= 8 && performanceScore <= 10) {
      bonus = baseSalary * 0.2;
      return bonus;
    } else if (performanceScore >= 5 && performanceScore <= 7) {
      bonus = baseSalary * 0.1;
      return bonus;
    } else {
      return bonus;
    }

  }
}