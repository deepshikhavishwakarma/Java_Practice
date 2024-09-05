package CodePractice.Codeday20_Constructor.EmployeeBonusTest;

public class EmployeeBonusTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
       e1.setEmployeeName("John Doe");

        e1.setBasicSalary(50000);
     e1.setPerformanceRating(4);
    e1.displayEmployeeDetails();
    Bonus b1 = Bonus.calculateBonus(e1);
    System.out.println("Bonus Amount: "+b1.getBonusAmount()+"% of basic salary");

    }
}