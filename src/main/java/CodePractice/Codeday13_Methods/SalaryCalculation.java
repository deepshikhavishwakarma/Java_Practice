package CodePractice.Codeday13_Methods;

public class SalaryCalculation {
  String name;
  double basicPay, specialAllowance, netSalary, pf, gross, AnnualSalary;
  int conveyanceAllowance;

  void giveValues() {
    name = "Deepshikha";
    basicPay = 35000;
    conveyanceAllowance = 1200;
    SalaryCalculation obj = new SalaryCalculation();
    obj.salaryCalculate(name, basicPay, conveyanceAllowance);

  }

  void salaryCalculate(String name, double basicPay, int conveyanceAllowance) {
    specialAllowance = basicPay - (basicPay * 0.25);
    gross = basicPay + specialAllowance + conveyanceAllowance;
    pf = basicPay - (basicPay * 8.33 / 100);
    netSalary = gross - pf;
    AnnualSalary = netSalary * 12;
    SalaryCalculation obj = new SalaryCalculation();
    obj.display(name, basicPay, specialAllowance, conveyanceAllowance, netSalary, pf, gross, AnnualSalary);
  }

  void display(String name, double basicPay, double specialAllowance, int conveyanceAllowance, double netSalary,
      double pf, double gross, double AnnualSalary) {
    System.out.println("Employee Name \t\t\t" + name);
    System.out.println("Basic Pay \t\t\t\t" + basicPay);
    System.out.println("Special Allowance \t\t" + specialAllowance);
    System.out.println("Conveyance Allowance \t" + conveyanceAllowance);
    System.out.println("Net Salary \t\t\t\t" + netSalary);
    System.out.println("PF Amount \t\t\t\t" + pf);
    System.out.println("Gross \t\t\t\t\t" + gross);
    System.out.println("Annual Salary \t\t\t" + AnnualSalary);
  }

  public static void main(String[] args) {
    SalaryCalculation obj = new SalaryCalculation();
    obj.giveValues();
  }

}

// void giveValues(): a method to assign details of employee---------------
// ii. void salaryCalculate(): calculate the allowances and salary
// specialAllowance: 25% of basic salary
// gross: basicpay + specialAllowance + conveyanceAllowance
// pf=8.33% of basicPay
// netSalary=gross-pf
// annualSalary=12 months of salary
// iii. void display(): display all the details with suitable message